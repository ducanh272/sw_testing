public class TicketPrice {

    public static int getTicketPrice(double height) {
        if (height < 0.4 || height > 2.6) {
            return -1;
        }

        if (height >= 0.4 && height <= 0.9) {
            return 0;
        } else if (height > 0.9 && height <= 1.4) {
            return 145000;
        } else return 170000;
    }

}
