package FlightSystem;

public abstract class FlightClass extends BaseFunctionality implements FlightClassInterface{


    public void bookFlight(int bags) {
        int setsFare=bags*500+5000;
        System.out.println("Flight booked");
        System.out.println("fare:"+this.getFare());
    }

    public void cancelFlight(){
        System.out.println("Flight cancelled");
    }

}
