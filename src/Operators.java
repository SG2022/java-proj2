
import java.io.File;
public class Operators {

    public static void main(String[] args) {

 /*increment and decrement operators
        int x = 10;
        int y =10;
System.out.println("x: " + x);//10
System.out.println("y: " + y);//10

System.out.println("x++: " + x++); // 10
System.out.println("++y: " + ++y);//11

System.out.println("x: " + x);//11
System.out.println("y: " + y);//11
*/

/*Compound assignment operator
int compoundadd =8;
System.out.println(compoundadd+=10);//18
System.out.println(compoundadd-=5);//13 
*/


/*relational operators
int x =20;
int y =30;
System.out.println(x>y);
System.out.println(x<y);
System.out.println(x==y);
x instanceOf y*/

/*Logical Operators //conditional operators
boolean val1 = true;
boolean val2 =false;
int x =10;
int y = 20;
//System.out.println(val1 && val2);
//System.out.println(val1 || val2);
//System.out.println(!val1);
//val1 = x>20 && y<20;
//System.out.println(val2 = x<5 || y <10);
System.out.println(5 == 5.00f);
*/

/* equality operator
//boolean x=true==true;
//////System.out.println(x);
//boolean y = (x=true);
//System.out.println(y);
File x = new File("java1.java");
File z , y = new File("java2.java");
z=x;
System.out.println(x==z);
*/


/*Ternary operator
int a =9;
int b=5;
int c=10;
int largest = (a>b)? (a) : (b);
System.out.println((4>5)? "dont know": 100);
*/
    
    int noOfVisits = 10;
    String memberShipStatus= (noOfVisits>20)? "vip" : "member";
    System.out.println(memberShipStatus);
    


    
}}
