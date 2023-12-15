import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TorreHanoiTest {

    @Test
    public void testHanoiComUmDisco() {
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.hanoi(1, 'A', 'C', 'B');
        assertEquals(1, torreHanoi.getMovimentos());
    }

    @Test
    public void testHanoiComTresDiscos() {
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.hanoi(3, 'A', 'C', 'B');
        assertEquals(7, torreHanoi.getMovimentos());
    }

    @Test
    public void testHanoiComCincoDiscos() {
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.hanoi(5, 'A', 'C', 'B');
        assertEquals(31, torreHanoi.getMovimentos());
    }
}