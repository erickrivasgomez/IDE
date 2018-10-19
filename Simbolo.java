class Simbolo {

    private String tipo, nombre;
    private Object valor;

    public Simbolo(String nombre, String tipo, Object valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Simbolo{" + "tipo=" + tipo + ", nombre=" + nombre + ", valor=" + valor + '}';
    }

}