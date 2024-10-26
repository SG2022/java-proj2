
import java.util.*;

public class ControlFlow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = 0;
        int percentage = 0;
        boolean ans = true;
        String y = "y";
        /* if else
         * while(ans)
         * {
         * System.out.println("enter your age");
         * age = sc.nextInt();
         * if(age <18)
         * System.out.println("not eligible");
         * else if (age <30)
         * System.out.println("you can donate blood");
         * else if(age >30 && age <55)
         * {
         * System.out.println("first submit your blood report");
         * 
         * }
         * else if (age >55)
         * System.out.println("senior citizen cant donate");
         * // System.out.println("wish to continue ?");
         * y= System.console().readLine("wish to continue?");
         * ans= ( y.equals("y"))? true : false ;
         * }
         */


  /*  Nested if     
        while (ans) {

            System.out.println("enter your age");
            age = sc.nextInt();

            if (age > 18) {
                System.out.println("enter your marks in percentage");
                percentage = sc.nextInt();
                if (percentage > 85) {
                    System.out.println("You can apply for course with coe #101 to #105");

                } else if (percentage > 70)
                    System.out.println("you can apply froom #106 - #110");
                else if (percentage > 50)
                    System.out.println("you can only apply for #110 and #111");
                else
                    System.out.println("not eligibile to apply in our uni because marks doesnt mathc cur off");

            } else
                System.out.println("Sorry you cant apply as you are under age");

            y = System.console().readLine("wish to continue?");
            ans = (y.equals("y")) ? true : false;

        }

        System.out.println("Thanks for visiting our uni"); */
    }

    

}
