
import java.util.Scanner;

public class ControlAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * 3.2.1 Determine if a number is divisible by 3, 5 or both.
          
          System.out.println("enter the number");
          int num = sc.nextInt();
          if(num %3 == 0 && num % 5 == 0)
          {
          System.out.println(num + " is both divisible by 3 and 5");
          }
          else if(num % 3 == 0)
          System.out.println(num + "only divisible by 3");
          else if(num % 5 ==0)
          System.out.println(num + "  only divisible by 5 ");
          else
         System.out.println("not divisible by either 3 or");
         */

        
        /*   Given a sample budget, determine what to ride given the following conditions:
          if budget is greater than 100, ride a taxi
         if budget is between 50 to 100, ride train
          if budget is between 20 to 49, ride bus
         if budget is between 0 to 19, walk 
         
         int budget =0;
         System.out.println("Enter your budget");
         budget = sc.nextInt();
         if(budget>100)
         System.out.println("ride a taxi");
         else if(budget>= 50 )
         System.out.println("ride a train");
         else if(budget>= 20 )
         System.out.println("ride a bus");
          else
         System.out.println("walk");



         
*/


/*
        
            Use a switch case to determine the zodiac animal given a number from 1 to 12.
     (1 - rat, 2 - ox, 3 - tiger, etc.)
 */
 System.out.println("Enter your zodiac number");
 int zodNum = sc.nextInt();
 switch(zodNum)
 {

    case (1): System.out.println("RAT");
    break;
    case (2): System.out.println("OX");
    break;
    case (13): System.out.println("Tiger");
    break;
    case (4): System.out.println("RAbbit");
    break;
    case (5): System.out.println("Dragon");
    break;
    case (6): System.out.println("Snake");
    break;
    case (7): System.out.println("Horse");
    break;
    case (8): System.out.println("Goat");
    break;
    case (9): System.out.println("Monkey");
    break;
    case (10): System.out.println("Rooster");
    break;
    case (11): System.out.println("Dog");
    break;
    case (12): System.out.println("Pig");
    break;
    default: System.out.println("wrong input");

    */


//--------------------------------------------------------------------------------------------------







 }

    
}
}

    /*
     * 
     *  float budget = 72.7f;
        enum TransportMode {
            TAXI,
            TRAIN,
            BUS,
            WALK
        }
        TransportMode mode = TransportMode.WALK;
        // Add code here

        if (budget > 100) {
            mode = TransportMode.TAXI;
        } else if (budget >= 50 && budget <= 100) {
            mode = TransportMode.TRAIN;
        } else if (budget >= 20 && budget < 50) {
            mode = TransportMode.BUS;
        } else if (budget >= 0 && budget < 20) {
            mode = TransportMode.WALK;
        }

        System.out.println("You should ride: " + mode);

        /*
         * Task 3. Use a switch case to determine the zodiac animal given a number from
         * 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         
        enum Zodiac {
            RAT,
            OX,
            TIGER,
            RABBIT,
            DRAGON,
            SNAKE,
            HORSE,
            GOAT,
            MONKEY,
            ROOSTER,
            DOG,
            PIG
        }

        int animalNumber = 7;

        // Add code here
        Zodiac zodiacAnimal = switch (animalNumber) {
            case 1 -> Zodiac.RAT;
            case 2 -> Zodiac.OX;
            case 3 -> Zodiac.TIGER;
            case 4 -> Zodiac.RABBIT;
            case 5 -> Zodiac.DRAGON;
            case 6 -> Zodiac.SNAKE;
            case 7 -> Zodiac.HORSE;
            case 8 -> Zodiac.GOAT;
            case 9 -> Zodiac.MONKEY;
            case 10 -> Zodiac.ROOSTER;
            case 11 -> Zodiac.DOG;
            case 12 -> Zodiac.PIG;
            default -> {
                System.out.println("Invalid number! Please enter a number between 1 and 12.");
                yield null;
            }
        };

        if (zodiacAnimal != null) {
            System.out.println("Your zodiac animal is: " + zodiacAnimal);
        }
    }
}
     * 
     * 
     * 
     */
