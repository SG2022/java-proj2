public class datatypes {
    public static void main(String[] args) {
        // System.out.println("sanj " + Integer.parseInt(args[0]));

        // System.out.println(11+ "11");

        /*
         * explicit casting
         * int a=10;
         * double b =20;
         * a += (int)b;
         */

        /*
         * implicit casting
         * int x =10;
         * double b =15;
         * b+=x;
         * int x = 50;
         * double d =x;
         * System.out.println(d);
         */

        /*
         * narrow casting
         * double d = 10.50;
         * int i = (int) d;
         * System.out.println(i);
         */

        /*
         * Data Types
         * double d =3.5d;
         * boolean b , c =true;
         * String s1= "abc" ,s2;
         * float f =3.5f;
         * d=f;
         * f = (float)d;
         * char ch = '9';
         * int z =ch;
         * System.out.println(z);
         * z = Character.getNumericValue(ch);
         * 
         * 
         * double d =2.5;
         * float f =3.5f;
         * 
         * int num1=10;
         * int num2 = Integer.parseInt(args[0]);
         * System.out.println(num1+=num2);
         * float x =3.5f;
         * System.out.println(x);
         */

        // convert integer to String
        int x1 = 10;
        String s = Integer.toString(x1);
        s = String.valueOf(x1);

        System.out.println(s);

    }

}
