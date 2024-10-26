public class ZodiacAnimal {

    public static void main(String[] args) {

       /*  Task 3. Use a switch case to determine the zodiac animal given a number from
          1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
          
          Code Challenge: Delcare and use enum for your zodiac */

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
    

