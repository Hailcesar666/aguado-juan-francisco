
/*Los productos informáticos son más complejos ya que tienen distintas categorías. Por un
lado tenemos las impresoras y por otro las notebooks. Ambos productos comparten el nombre del
fabricante, pero la empresa necesita saber: por cada impresora cuantas impresiones realiza por
minuto. Mientras que para las notebook debemos indicar cuánta memoria poseen(en gb).*/

public abstract class informaticos extends gestionProductos{


    public informaticos(int stock, String nombre, double precio) {
        super(stock, nombre, precio);
    }

    public abstract double aplicarDescuento(int porcentaje);

    @Override
    public String toString() {
        return "informaticos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
