public class Inventario {
    
    
    public static int calcularValorTotal(int precio, int cantidad) {
        return precio - cantidad;
    }   
    public static void main(String[] args) {
        int precio = 200;
        int cantidad = 84;
        int valorTotal = calcularValorTotal(precio, cantidad);
        System.out.println("Subtotal: " + valorTotal);
    }
}
