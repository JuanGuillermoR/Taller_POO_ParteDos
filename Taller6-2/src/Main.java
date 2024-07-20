public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        ProductoEspecifico prod1 = new ProductoEspecifico(1, "Lapiz", 1.50, "Papeleria", "Norma");
        ProductoEspecifico prod2 = new ProductoEspecifico(2, "Cuaderno", 2.50, "Papeleria", "Norma");
        ProductoEspecifico prod3 = new ProductoEspecifico(3, "sacapuntas", 0.50, "Papeleria", "Gillete");

        inventario.anadirProducto(prod1);
        inventario.anadirProducto(prod2);
        inventario.anadirProducto(prod3);

        System.out.println("Listar todos los productos:");
        inventario.listarProductos();

        System.out.println("\nBuscar productos por nombre 'Cuaderno':");
        inventario.buscarPorNombre("Cuaderno");

        System.out.println("\nBuscar productos por categoría 'Papeleria':");
        inventario.buscarPorCategoria("Papeleria");

        System.out.println("\nEliminar producto con id 1");
        inventario.eliminarProducto(1);

        System.out.println("\nListar todos los productos después de eliminar:");
        inventario.listarProductos();
    }
}
