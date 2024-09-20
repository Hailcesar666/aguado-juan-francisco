public class notebooks extends informaticos{
 public int GB;

    public notebooks(int stock, String nombre, double precio, int GB) {
        super(stock, nombre, precio);
        this.GB = GB;

    }

    @Override
    public double aplicarDescuento(int porcentaje) {
        return 0;
    }

    @Override
    public String toString() {
        return "notebooks{" +
                "GB=" + GB +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
