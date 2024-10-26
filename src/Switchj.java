public class Switchj {
    public static void main(String[] args) {

        
/*String direction =
System.console().readLine("Enter direction");

switch(direction)
{

  case "North":
  System.out.println("you have entered north");
  break;
  case "South":
  System.out.println("you have chosen southern direction");
  break;
  case "East":
  case "West":
  System.out.println("you have chosen east or west");
  break;
  default:
  System.out.println("wrong input");



}*/
String s = System.console().readLine("enter the word");


switch(s.substring(0,1))
{
    case "a":
    case "e":
    case "i":
    case "o":
    case "u":
    System.out.println(s + " starts with a vowel");
    break;
    default:
    System.out.println(s + "doesnt start with a vowel");
}

switch(s.substring(0, 1))
{
    case "a" ->System.out.println("starts with a");
    case "b"->System.out.println("starts with b");
    case "c" ,"d","e"-> System.out.println("starts with either c,d,or e");
    default -> System.out.println("invalid input");
    System.console().readLine("Enter your string");

}



        
}




}

