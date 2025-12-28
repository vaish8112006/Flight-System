package FlightSystem;

public abstract class BaseFunctionality implements BaseFunctionalityInterface{
    private int flightId;
    private int fare;

    public int getFlightId(){
        return this.flightId;
    }
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
    public int getFare(){
        return this.fare;
    }
    public void setFare(int fare){
        this.fare=fare;
    }
}
