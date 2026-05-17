class HotelRoom {

    private int roomNumber;
    private double pricePerNight;
    private boolean isAvailable;

    public void setRoomNumber(int number) {
        if(number > 0) {
            this.roomNumber = number;
        } else {
            System.out.println("Invalid room number! ❌");
        }
    }

    public void setPricePerNight(double price) {
        if(price > 0) {
            this.pricePerNight = price;
        } else {
            System.out.println("Price must be positive! ❌");
        }
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public int getRoomNumber() { return roomNumber; }
    public double getPricePerNight() { return pricePerNight; }
    public boolean isAvailable() { return isAvailable; }
}

public class HotelRoom {
    public static void main(String[] args) {

        HotelRoom r = new HotelRoom();
        r.setRoomNumber(101);
        r.setPricePerNight(2500);
        r.setAvailable(true);
        r.setRoomNumber(-5);  // invalid

        System.out.println("Room: " + r.getRoomNumber());
        System.out.println("Price: ₹" + r.getPricePerNight() + " per night");
        System.out.println("Available: " + r.isAvailable());
    }
}
