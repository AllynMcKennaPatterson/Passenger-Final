package ie.atu;

public class Passenger {
    private String passengerTitle;
    private String passengerName;
    private long passengerId;
    private long passengerPhone;
    private int passengerAge;

    public Passenger(String passengerTitle, String passengerName, long passengerId, long passengerPhone, int passengerAge) {
        this.passengerTitle = passengerTitle;
        this.passengerName = passengerName;
        this.passengerId = passengerId;
        this.passengerPhone = passengerPhone;
        this.passengerAge = passengerAge;
    }
}