
/*Desarrolle el sistema para una empresa que comercializa productos para oficina. Tiene dos
grandes grupos de productos a la venta: Muebles (sillas y escritorios) y productos informáticos.
Todos los productos que comercializa tienen en común un número de stock, nombre y precio.*/

import java.util.ArrayList;

public class gestionProductos {
    public int stock;
    public String nombre;
    public double precio;

    public gestionProductos() {

    }

    public gestionProductos(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "gestionProductos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void Imprimir(ArrayList<gestionProductos> producto) {
        for (gestionProductos productos : producto)

            System.out.println(productos.getClass());
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void cambiarPrecio(ArrayList<gestionProductos> Productos) {
        for (gestionProductos Producto : Productos.toArray(new gestionProductos[0])) {
            double orig = Producto.precio;
            if (Producto.getClass().equals(silla.class)) {
                Producto.setPrecio(orig * 5 / 100 + orig);
            } else if (Producto.getClass().equals(escritorios.class)) {
                Producto.setPrecio(orig * 10 / 100 + orig);
            } else if (Producto.getClass().equals(impresoras.class)) {
                Producto.setPrecio(orig * 15 / 100 + orig);
            } else if (Producto.getClass().equals(notebooks.class)) {
                Producto.setPrecio(orig * 20 / 100 + orig);
            }
            System.out.println(Producto.toString());
        }


    }
}

