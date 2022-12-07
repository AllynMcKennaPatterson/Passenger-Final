package ie.atu;

public class Passenger {
    private String passengerTitle;
    private String passengerName;
    private long passengerId;
    private long passengerPhone;
    private int passengerAge;

    public Passenger(String passengerTitle1, String passengerName1, long passengerId1, long passengerPhone1, int passengerAge1) {
        setPassengerTitle(passengerTitle1);
        setPassengerName(passengerName1);
        setPassengerId(passengerId1);
        setPassengerPhone(passengerPhone1);
        setPassengerAge(passengerAge1);
    }

    public String getPassengerTitle() {
        return passengerTitle;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public long getPassengerPhone() {
        return passengerPhone;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerTitle(String passengerTitle) {
        if("Mr".equalsIgnoreCase(passengerTitle) || "Ms".equalsIgnoreCase(passengerTitle) || "Mrs".equalsIgnoreCase(passengerTitle)){
            this.passengerTitle = passengerTitle;
        }
        else{
            throw new IllegalArgumentException("Title must be Mr, Mrs, or Ms");
        }

    }

    public void setPassengerName(String passengerName) {
        if (passengerName.length() >= 3) {
            this.passengerName = passengerName;
        }
        else{
            throw new IllegalArgumentException("Name must have at least 3 characters");
        }
    }

    public void setPassengerId(long passengerId) {
        if(passengerId >= 0){
            this.passengerId = passengerId;
        }
        else{
            throw new IllegalArgumentException("Id must be a positive integer");
        }
    }

    public void setPassengerPhone(long passengerPhone) {
        if(String.valueOf(passengerPhone).length() == 8){
            this.passengerPhone = passengerPhone;
        }
        else{
            throw new IllegalArgumentException("Phone number must have 8 digits");
        }
    }

    public void setPassengerAge(int passengerAge) {
        if(passengerAge >= 16){
            this.passengerAge = passengerAge;
        }
        else{
            throw new IllegalArgumentException("Passenger must be at least 16 years old");
        }

    }

    public static void main(String[] args) {
        System.out.println("Docker is running this project");
    }
}
