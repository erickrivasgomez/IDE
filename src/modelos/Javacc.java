package modelos;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ErickRG
 */
public class Javacc {

    //Función para ejecutar nuestros archivos javacc
    public String lexer(String codigo, String in) throws UnsupportedEncodingException, IOException {
        String resultado = "";
        File archivo = new File("out.c");
        archivo.delete();
        archivo = new File("Parser.jj");
        archivo.delete();
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("Parser.jj"), "utf-8"))) {
            writer.write(codigo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        archivo = new File("in.txt");
        archivo.delete();
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("in.txt"), "utf-8"))) {
            writer.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"cmd", "/c", "javacc Parser.jj"};
            Process proc = rt.exec(commands);
            String[] commands1 = {"cmd", "/c", "javac *.java"};
            proc = rt.exec(commands1);
            String[] commands2 = {"cmd", "/c", "java Parser < in.txt "};
            proc = rt.exec(commands2);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

            String s = null;
            //Estas son etiquetas HTML para jEditorPane, modificar el tipo de formato que permite.
            while ((s = stdInput.readLine()) != null) {
                resultado += ("<span style='color: white; font-family:verdana;font-size:110%;'>" + s + "<br></span>");
            }

            while ((s = stdError.readLine()) != null) {
                resultado += ("<span style='color: red; font-family:verdana;font-size:100%;'>" + s + "<br></span>");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}