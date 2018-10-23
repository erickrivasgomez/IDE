
package modelos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompiladorGCC {
    public String compilar(){
        String resultado = "";
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"cmd", "/c", "compilargcc.bat"};
            Process proc = rt.exec(commands);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String s;
            while ((s = stdInput.readLine()) != null) {
                resultado += ("<span style='color: white; font-family:verdana;font-size:110%;'>" + s + "<br></span>");
            }
            while ((s = stdError.readLine()) != null) {
                resultado += ("<span style='color: red; font-family:verdana;font-size:100%;'>" + s + "<br></span>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(resultado);
        return resultado;
    }
    
    public String ejecutar(){
        String resultado = "";
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"cmd", "/c", "ejecutargcc.bat"};
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
        System.out.println(resultado);
        return resultado;
    }
    
}
