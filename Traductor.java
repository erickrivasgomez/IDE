

import java.io.File;
import java.io.FileWriter;

public class Traductor {

    public Traductor (){
        File archivo = new File("salida.c");
        archivo.delete();
    }

    public void escribir(String entrada){

        File archivo = new File("out.c");
        try (FileWriter escritor = new FileWriter(archivo, true)) {
            escritor.write(entrada+"\n");
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void escribirEnLinea(String entrada){
        
        File archivo = new File("out.c");
        try (FileWriter escritor = new FileWriter(archivo, true)) {
            escritor.write(entrada+" ");
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}