
import java.util.*;

public class TablaSimbolos {

    public static ArrayList<Simbolo> tabla = new ArrayList<Simbolo>();

    public void insertarVariable(String nombre, String tipo, Object valor) {
        if (buscarVariable(nombre)) {
            tabla.add(new Simbolo(nombre, tipo, valor));
        }
    }

    public boolean buscarVariable(String nombre) {
        for (int i = 0; i < tabla.size(); i++) {
            if (tabla.get(i).getNombre().equals(nombre)) {
                return false;
            }
        }
        return true;
    }

    public void imprimirTabla() {
        System.out.println("\tNombre\t\tTipo\t\tValor");
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println("\t"+tabla.get(i).getNombre()+"\t\t"+tabla.get(i).getTipo()+"\t\t"+tabla.get(i).getValor());
        }
    }

    public Object getValor(String nombre){
        for (int i = 0; i < tabla.size(); i++) {
            if (tabla.get(i).getNombre().equals(nombre)) {
                return tabla.get(i).getValor();
            }
        }
        return null;
    }

    public void setValor(String nombre, Object valor){
        for (int i = 0; i < tabla.size(); i++) {
            if (tabla.get(i).getNombre().equals(nombre)) {
                tabla.get(i).setValor(valor);
            }
        }
    }
}