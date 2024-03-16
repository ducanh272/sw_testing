public class TicketPrice {

    public static int getTicketPrice(double height) {
        if (height < 0.4 || height > 2.6) {
            return -1;
        }

        int price;

        if (height >= 0.4 && height <= 0.9) {
            price = 0;
        } else if (height > 0.9 && height <= 1.4) {
            price = 145000;
        } else price = 170000;

        return price;
    }

}
