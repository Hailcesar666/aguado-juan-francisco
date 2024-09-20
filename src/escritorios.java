public class escritorios extends muebles {
    public double altura ;
    public double ancho;

    public escritorios(int stock, String nombre, double precio, double ancho, double altura) {
        super(stock, nombre, precio);
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "escritorios{" +
                "altura=" + altura +
                ", ancho=" + ancho +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
