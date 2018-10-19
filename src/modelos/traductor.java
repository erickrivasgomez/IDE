/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Lenovo
 */
public class traductor {
    
    public void escribir(String entrada) throws Exception {

        File archivo = new File("recientes.txt");
        try (FileWriter escritor = new FileWriter(archivo, true)) {
            escritor.write(entrada);
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
