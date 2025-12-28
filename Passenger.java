package FlightSystem;

public class Passenger extends BaseFunctionality implements PassengerInterface{

    private String classType;
    private int bags;

    public String getClassType(){
        return this.classType;
    }
    public void setClassType(String classType){
        this.classType=classType;
    }
    public int getBags(){
        return this.bags;
    }
    public void setBags(int bags) {
        this.bags = bags;
    }

}
