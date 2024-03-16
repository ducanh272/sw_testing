import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlFlowTest {
    @Test
    public void test_1() {
        assertEquals(-1, TicketPrice.getTicketPrice(0.3));
    }

    @Test
    public void test_2() {
        assertEquals(0, TicketPrice.getTicketPrice(0.8));
    }

    @Test
    public void test_3() {
        assertEquals(145000, TicketPrice.getTicketPrice(1.0));
    }

    @Test
    public void test_4() {
        assertEquals(170000, TicketPrice.getTicketPrice(2.0));
    }
}
