import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void testCalcularSubTotal() {
        int resultado = Inventario.calcularValorTotal(200, 84);
        assertEquals(116, resultado);
    }
}
