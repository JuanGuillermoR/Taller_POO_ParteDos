import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para añadir un producto
    public void anadirProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto por id
    public void eliminarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }

    // Método para listar todos los productos
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Método para buscar productos por nombre
    public void buscarPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(producto);
            }
        }
    }

    // Método para buscar productos por categoría
    public void buscarPorCategoria(String categoria) {
        for (Producto producto : productos) {
            if (producto instanceof ProductoEspecifico) {
                ProductoEspecifico prodEsp = (ProductoEspecifico) producto;
                if (prodEsp.getCategoria().equalsIgnoreCase(categoria)) {
                    System.out.println(prodEsp);
                }
            }
        }
    }
}
