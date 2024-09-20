public class impresoras extends informaticos {
    public int impr;//impresiones por minutos


    public impresoras(int stock, String nombre, double precio, int impr) {
        super(stock, nombre, precio);
        this.impr = impr;

    }

    @Override
    public double aplicarDescuento(int porcentaje) {
        double descuento = (precio * porcentaje) / 100;
        return precio- descuento;
    }


    @Override
    public String toString() {
        return "impresoras{" +
                "impr=" + impr +
                ", stock=" + stock +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}














