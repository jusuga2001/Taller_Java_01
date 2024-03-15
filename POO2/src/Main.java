import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;


        /*hacer un menu
            1. Agregar
            2. eliminar
            3. buscar por nombre
            4. buscar por categoria
            5. listar inventario
            6. salir */

        System.out.println("------MENU-------\n" +
                "1. Agregar\n" +
                "2. Eliminar \n" +
                "3. Buscar por nombre \n" +
                "4. Buscar por categoria \n" +
                "5. Listar inventario \n" +
                "6. Salir\n" +
                "Seleccione la opcion que desea: ");
        opcion = sc.nextInt();

        Inventario objInventario = new Inventario();

        switch (opcion){
            case 1:
                int id;
                String nombre;
                double precio;
                String categoria;
                String marca;

                System.out.println("Ingrese el id del producto: ");
                id = sc.nextInt();
                System.out.println("Ingrese el nombre del producto: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese el precio: ");
                precio = sc.nextDouble();
                System.out.println("Ingrese la categoria del producto: ");
                categoria = sc.nextLine();
                System.out.println("Ingrese la marca: ");
                marca = sc.nextLine();

                ProductoEspecifico objProducto = new ProductoEspecifico(id, nombre,precio,categoria,marca);
                objInventario.agregarProducto(objProducto);
                break;

            case 2:
                System.out.println("Ingrese el id del producto a eliminar:n ");
                objInventario.eliminarProducto(2);
                System.out.println("Despues de eliminar");
                objInventario.listarProductos();
                break;

            case 3:


        }







        if (objInventario.buscarPorNombre("lapiz")==null){
            System.out.println("No se encontro");
        }else {
            System.out.println(objInventario.buscarPorNombre("lapiz"));
        }

        System.out.println(objInventario.buscarPorNombre("Lapiz"));
    }
}