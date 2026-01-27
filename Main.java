import java.util.Scanner;
import java.util.Scanner; 
public class Main {

   public static void main(String []args) {
      SkiTrip trip1 = new SkiTrip(); 
      SkiTrip trip2 = new SkiTrip("Bob", "Snow Bird", 14, true); 
      System.out.println(trip2); 
      trip2.setDurationInDays(10);
      System.out.println(trip2); 
      trip2.setTotalCost();
      System.out.println(trip2); 

      Scanner input = new Scanner(System.in); 
      // LOOP for booking trips with client input 
      boolean continueBooking = true; // flag to control loop 
      while (continueBooking) {
         // 1. Call static bookTravel method to create object 
         SkiTrip currentTrip = bookTrip(input); 
         // 2. Display the objects details 
         System.out.println(currentTrip); 
         // 3. Ask user if they want to continue booking 
         System.out.println("Do you want to book another Ski tip? (y/n):");  
         String response = input.nextLine(); 
         if (response.equals("n")) {
            continueBooking = false; // end the loop 
         }
      }
   }

   // Methods don't have to just be for object classes! 
   // Write a reusable process for creating objects 
   public static SkiTrip bookTrip(Scanner scan) {
      // 1. Create a blank travel object
      SkiTrip newTrip = new SkiTrip(); 

      // 2. Ask client for details 
      System.out.println("What is your name?: ");
      String clientName = scan.nextLine();
      System.out.println("Where do you want to go?");
      String clientDestination = scan.nextLine(); 
      System.out.println("How many days?: ");
      int clientDuration = scan.nextInt(); 
      System.out.println("Do you need rentals? type true or false: "); 
      boolean clientRentals = scan.nextBoolean(); 
      // reset the scanner fix: 
      scan.nextLine(); 
      
      // 3. call mutator methods (setters) to update the object 
      newTrip.setTravelerName(clientName);
      newTrip.setDestination(clientDestination);
      newTrip.setDurationInDays(clientDuration);
      newTrip.setNeedRentals(clientRentals);

      // 4. Return the completed travel object 
      return newTrip;
   }
}
