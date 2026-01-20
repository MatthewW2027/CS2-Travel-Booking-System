public class SkiTrip {
    // 1. INSTANCE VARIABLES (data) 
    private static int processFee = 100; // class variable 
    private String travelerName; // provided by client
    private String destination; // provided by client
    private int durationInDays; // provided by client
    private boolean needRentals; // provided by client
    private double totalCost; // calculated later 

    // 2. CONSTRUCTORS (default + parameterized) 
    public SkiTrip() {
        this.travelerName = "defaultClient";
        this.destination = "location"; 
        this.durationInDays = 1; 
        this.needRentals = false; 
        this.totalCost = processFee * this.durationInDays; // calculation  
    }

    public SkiTrip(String name, String destination, int duration, boolean rentals) {
        this.travelerName = name; // set instance variable to client-provided value 
        this.destination = destination; 
        this.durationInDays = duration; 
        this.needRentals = rentals; 
        this.totalCost = processFee * this.durationInDays; // calculation 
    }

     public String toString() {
        String state = "SkiTrip[" + travelerName + ", " + destination + ", " + durationInDays + ", " + needRentals + ", " + totalCost + "]"; 
        return state; 
    }
}