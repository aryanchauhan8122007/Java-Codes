class FlightTicket {

    private String passengerName;
    private String destination;
    private double ticketPrice;

    public void setPassengerName(String name) {
        this.passengerName = name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTicketPrice(double price) {
        if(price > 0) {
            this.ticketPrice = price;
        } else {
            System.out.println("Ticket price must be positive! ❌");
        }
    }

    public String getPassengerName() { return passengerName; }
    public String getDestination() { return destination; }
    public double getTicketPrice() { return ticketPrice; }
}

public class FlightTicket {
    public static void main(String[] args) {

        FlightTicket t = new FlightTicket();
        t.setPassengerName("Rahul");
        t.setDestination("Dubai");
        t.setTicketPrice(15000);
        t.setTicketPrice(-500);  // invalid

        System.out.println("Passenger: " + t.getPassengerName());
        System.out.println("Destination: " + t.getDestination());
        System.out.println("Price: ₹" + t.getTicketPrice());
    }
}
