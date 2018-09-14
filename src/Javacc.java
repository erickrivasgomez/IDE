
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
    public String lexer(String code) throws UnsupportedEncodingException, IOException {
        String resultado = "";
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("entrada.txt"), "utf-8"))) {
            writer.write(code);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"cmd", "/c", "java Parser < entrada.txt"};
            Process proc = rt.exec(commands);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

            String s = null;
            //Estas son etiquetas HTML para jEditorPane, modificar el tipo de formato que permite.
            while ((s = stdInput.readLine()) != null) {
                resultado += ("<p style='color: green; font-family:verdana;font-size:110%;'>" + s + "</p>");
            }

            while ((s = stdError.readLine()) != null) {
                resultado += ("<p style='color: red; font-family:verdana;font-size:100%;'>" + s + "</p>");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
