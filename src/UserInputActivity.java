public class UserInputActivity {
    public static void main(String[] args) {

        String userName = "";
      
        int ctr =0;
        do
        {
            userName = System.console().readLine("Enter your name");
            if(userName.equals("admin"))
            {
            System.out.println("Welcome admin");
            break;
            }
            else
            {
                System.out.println("wrong input ");
               
                ctr++;
                
            }
         
        }while(ctr<3);
    }
    
    

}
