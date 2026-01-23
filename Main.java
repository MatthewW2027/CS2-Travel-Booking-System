public class Main {

   public static void main(String []args) {
      SkiTrip trip1 = new SkiTrip(); 
      SkiTrip trip2 = new SkiTrip("Bob", "Snow Bird", 14, true); 
      System.out.println(trip2); 
      trip2.setDurationInDays(10);
      System.out.println(trip2); 
      trip2.setTotalCost();
      System.out.println(trip2); 
   }
}
