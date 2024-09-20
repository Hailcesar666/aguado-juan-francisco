public class muebles extends gestionProductos{
    public muebles(int stock, String nombre, double precio) {
        super(stock, nombre, precio);
    }

    @Override
    public String toString() {
        return "muebles{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
