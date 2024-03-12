import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoundaryValueTest {

    @Test
    public void test_1() {
        assertEquals(-1, TicketPrice.getTicketPrice(0.3));
    }

    @Test
    public void test_2() {
        assertEquals(0, TicketPrice.getTicketPrice(0.4));
    }

    @Test
    public void test_3() {
        assertEquals(0, TicketPrice.getTicketPrice(0.5));
    }

    @Test
    public void test_4() {
        assertEquals(0, TicketPrice.getTicketPrice(0.8));
    }

    @Test
    public void test_5() {
        assertEquals(0, TicketPrice.getTicketPrice(0.9));
    }

    @Test
    public void test_6() {
        assertEquals(145000, TicketPrice.getTicketPrice(1.0));
    }

    @Test
    public void test_7() {
        assertEquals(145000, TicketPrice.getTicketPrice(1.3));
    }

    @Test
    public void test_8() {
        assertEquals(145000, TicketPrice.getTicketPrice(1.4));
    }

    @Test
    public void test_9() {
        assertEquals(170000, TicketPrice.getTicketPrice(1.5));
    }

    @Test
    public void test_10() {
        assertEquals(170000, TicketPrice.getTicketPrice(2.5));
    }

    @Test
    public void test_11() {
        assertEquals(170000, TicketPrice.getTicketPrice(2.6));
    }

    @Test
    public void test_12() {
        assertEquals(-1, TicketPrice.getTicketPrice(2.7));
    }

}
