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

    // Getters 
    public String getTravelerName() {
        return travelerName; 
    }
    public String getDestination() {
        return destination; 
    }
    public int getDurationInDays() {
        return durationInDays; 
    }
    public boolean getNeedRentals() {
        return needRentals; 
    }

    // Setters 
    public void setTravelerName(String newTravelerName) {
        this.travelerName = newTravelerName; 
    }
    public void setDestination(String newDestination) {
        this.destination = newDestination; 
    } 
    public void setDurationInDays(int newDurationInDays) {
        this.durationInDays = newDurationInDays; 
    }
    public void setNeedRentals(boolean newNeedRentals) {
        this.needRentals = newNeedRentals; 
    }
    public void setTotalCost() {
        double rentalFee = 0.0; 
        if (needRentals == true) {
            rentalFee = 100.50;  
        }
        this.totalCost = processFee * this.durationInDays + rentalFee; 
    }

     public String toString() {
        String itinerary = "-----------------------------------------\n" +
                            "       ✨⛷️ Ski Trip ⛷️✨        \n" +
                            "-----------------------------------------\n" +
                            "GUEST NAME:    " + travelerName + "\n" +
                            "DESTINATION:   " + destination + "\n" +
                            "STAY DURATION: " + durationInDays + " Nights\n" +
                            "NEED RENTALS: " + needRentals + " \n " +
                            "-----------------------------------------\n" +
                            "TOTAL COST:  $" + totalCost + "\n" +
                            "-----------------------------------------\n" +
                            "  Thank you for booking with Wanderlust! \n";
        return itinerary;  
    }
}