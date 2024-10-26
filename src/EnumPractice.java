public class EnumPractice {
    public static void main(String[] args) {
        

       /*  enum ZodiacSign
        {
            RAT,
            OX,
            TIGER
        }
        int num =2;

    ZodiacSign zSign =    switch(num)
        {
            case 1 -> ZodiacSign.RAT;
            case 2 ->ZodiacSign.OX;
            case 3-> ZodiacSign.TIGER;
            default-> {
                System.out.println("Invalid number! Please enter a number between 1 and 12.");
                 yield null;
        }

        };
        System.out.println(zSign);
        */

    enum Direction
    {
        SOUTH,
        NORTH,
        EAST,
        WEST
    }

    String d ="N";

  Direction direction =  switch(d)
    {
        case "N"-> Direction.NORTH;
        case "S"-> Direction.SOUTH;
        case "E" -> Direction.EAST;
        case "W" -> Direction.WEST;
        default -> {yield null;}



    };
System.out.println(direction);
String weather ="hot";

String month ="January";
String  quarter ="";

switch(month)
{

  case "Jan":
  case "feb":
  case "march":
  quarter = "q1";
  break;
  case "april":
  case "may":
  case "june":
  quarter = "q2";
  break;
  default:
  {
    quarter = "unknown";
 
  }

}

//switch expression can return value also
String month1 = "jun";
String quarter1 = switch(month1)
{

   case "Jan" , "Feb" ,"March" -> "q1";
   case "apr" -> "q2";
   case "may"-> "q3";
   case "jun" ,"july" -> "q4";
   default -> { yield "invalid input" + month1;}
};
System.out.println(quarter1);

// enum
enum CompassDirection
{
  N , S, W,E
}
CompassDirection direction1 = CompassDirection.E;
switch(direction1)
{
  case N-> System.out.println("North");
    case E -> System.out.println("ease");

    default-> System.out.println("Invalid input");
  
}

}




    }
    

