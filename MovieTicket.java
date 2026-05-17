class MovieTicket {

    private String movieName;
    private int seatNumber;
    private double ticketPrice;

    public void setMovieName(String name) {
        this.movieName = name;
    }

    public void setSeatNumber(int seat) {
        if(seat > 0 && seat <= 200) {
            this.seatNumber = seat;
        } else {
            System.out.println("Seat number must be between 1 and 200! ❌");
        }
    }

    public void setTicketPrice(double price) {
        if(price > 0) {
            this.ticketPrice = price;
        } else {
            System.out.println("Price must be positive! ❌");
        }
    }

    public String getMovieName() { return movieName; }
    public int getSeatNumber() { return seatNumber; }
    public double getTicketPrice() { return ticketPrice; }
}

public class MovieTicket {
    public static void main(String[] args) {

        MovieTicket m = new MovieTicket();
        m.setMovieName("Avengers");
        m.setSeatNumber(45);
        m.setTicketPrice(250);
        m.setSeatNumber(300);   // invalid
        m.setTicketPrice(-50);  // invalid

        System.out.println("Movie: " + m.getMovieName());
        System.out.println("Seat: " + m.getSeatNumber());
        System.out.println("Price: ₹" + m.getTicketPrice());
    }
}
