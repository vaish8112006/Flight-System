package FlightSystem;

public class Main {
    public static void main(String[] args)
    {
       Passenger passenger=new Passenger();
        System.out.println("Economy");
       //economyClass
        passenger.setClassType("Economy Class");
        passenger.setBags(2);

        EconomyClass economyClass=new EconomyClass();
        economyClass.setFlightId(12345);
        economyClass.setFare(6000);
        passenger.setFlightId(economyClass.getFlightId());
        economyClass.bookFlight(passenger.getBags());
        economyClass.selectSeat();
         System.out.println("Business");
        //BusinessClass
        passenger.setClassType("Business Class");
        passenger.setBags(2);

        BusinessClass businessClass=new BusinessClass();
        businessClass.setFlightId(12345);
        businessClass.setFare(16000);
        passenger.setFlightId(businessClass.getFlightId());
        businessClass.bookFlight(passenger.getBags());
        businessClass.accessLounge();


    }

}
