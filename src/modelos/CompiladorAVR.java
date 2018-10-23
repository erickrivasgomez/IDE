/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class CompiladorAVR {
    
    public String compilar(){
        String resultado = "";
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"cmd", "/c", "compilar.bat"};
            Process proc = rt.exec(commands);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String s;
            while ((s = stdInput.readLine()) != null) {
                resultado += s + "\n";
            }
            while ((s = stdError.readLine()) != null) {
                resultado += s + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
}
