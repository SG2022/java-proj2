
import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int deposit = 0;
        int balance = 0;
        int withdrawl = 0;
        String ans = "y";
        
        System.out.println(" Welocme to Net banking");
        System.out.println();
        while (flag) {

            
            System.out.println(" Menu : ");
            System.out.println();
            System.out.println();
            System.out.println("1: For Deposit");
            System.out.println();
            System.out.println("2: For Balance ");
            System.out.println();
            System.out.println("3: For Withdrawl ");
            System.out.println();

            System.out.println("4: Exit  ");
            System.out.println();
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("enter amount to be depositied");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("deposit succesful");
                    System.out.println("------------------------------");
                    break;
                }

                case 2: {
                    System.out.println("your current balance is " + balance);
                    System.out.println("------------------------------");

                    break;
                }

                case 3: {
                    System.out.println("enter amount to be withdrawn");
                    withdrawl = sc.nextInt();
                    if (withdrawl > balance) {
                        System.out.println("You do not have sufficient balance to withdraw");
                        System.out.println("------------------------------");
                        break;
                    } else {
                        balance = balance - withdrawl;
                        System.out.println("Withdraw succesful");
                        System.out.println("------------------------------");
                        break;

                    }

                }
                case 4: {
                    System.out.println("thanks for banking with us");
                    System.out.println("------------------------------");
                    flag = false;
                    break;
                }

                default: {
                    System.out.println("Wrong input ");
                    System.out.println("------------------------------");
                    break;
                }
                


            }
            ans = System.console().readLine("wish to continue  ?  ");
           if (!ans.equals("y"))
           {
                flag = false;
           }

            


            
        }

    }

}
