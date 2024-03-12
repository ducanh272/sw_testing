import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionTableTest {

    @Test
    public void test_1() {
        assertEquals(-1, TicketPrice.getTicketPrice(0.2));
    }

    @Test
    public void test_2() {
        assertEquals(0, TicketPrice.getTicketPrice(0.6));
    }

    @Test
    public void test_3() {
        assertEquals(145000, TicketPrice.getTicketPrice(1.2));
    }

    @Test
    public void test_4() {
        assertEquals(170000, TicketPrice.getTicketPrice(1.8));
    }

    @Test
    public void test_5() {
        assertEquals(-1, TicketPrice.getTicketPrice(3.0));
    }

}
