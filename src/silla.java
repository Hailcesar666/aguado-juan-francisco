
public class silla extends muebles {
    public sillas rueda;

    public silla(int stock, String nombre, double precio, sillas rueda) {
        super(stock, nombre, precio);
        this.rueda=rueda;

}
    public double aplicarDescuento(int porcentaje) {
        double descuento = (precio * porcentaje) / 100;
        return precio - descuento;
    }

    public sillas getRueda() {
        return rueda;
    }

    public void setRueda(sillas rueda) {
        this.rueda = rueda;
    }

    @Override
    public String toString() {
        return "silla{" +
                "rueda=" + rueda +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
