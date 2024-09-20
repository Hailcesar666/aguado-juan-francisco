import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        gestionProductos gestor=new gestionProductos();
        silla Silla = new silla(5, "linda", 500.63, sillas.RUEDAS);
        System.out.println(Silla.toString());
        escritorios Escritorios = new escritorios(16, "grande", 5000, 1.70, 1.3);
       // System.out.println(Escritorios.toString());

        notebooks Notebook = new notebooks(500, "buena", 70000.82, 16);
       // System.out.println(Notebook.toString());

        impresoras Impresora=new impresoras(20,"impresora",582.33,16);
        //impr es la cantidad de impresiones por minuto
       System.out.println(Impresora.toString());
///ejercicio 3
        ArrayList<gestionProductos> producto=new ArrayList<>();
        producto.add(Silla);
        producto.add(Escritorios);
        producto.add(Notebook);
        producto.add(Impresora);
        gestor.Imprimir(producto);
//ejercicio 4
        //la funcion agrega el descuento con el porcentaje que le ingresan
 Impresora.aplicarDescuento(5);
 Silla.aplicarDescuento(6);
        System.out.println(Silla.toString());
        System.out.println(Impresora.toString());
//ejercicio 5
        System.out.println("precio actualizado.------------------------");
        gestor.cambiarPrecio(producto);


    }
}