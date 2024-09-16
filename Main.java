
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        //Our first Programme
        System.out.println("Hello World");

        // Variable
        String name="Aman";
        String neighbour= "Akku";
        

        //primitive Data type 
        byte age= 30;
        int phone=1234567890;
        long phone2=12345678900L;
        float pi=3.14F;
        char letter='@';
        boolean isAdult= true;

        //Non-primitive Data type 
        String name2 ="Samim";
        String brother= new String("Sadik");
        System.out.println(name2.length());

        //casting
        //implicit casting
        double price =100.00;
        double finalPrice=price+10;

        System.out.println(finalPrice); //110.0

        //explicit typecasting
        int p=100;
        int fp=p+(int)18.92;
        System.out.println(fp);//118
        
        //constraint
        final float PI=3.14F; //we use final leyword for definig constraint

        //operators


        //Math library
        System.out.println(Math.max(4,5));
        System.out.println(Math.min(4,5));
        System.out.println(Math.random());

        //Taking input

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age1= sc.nextInt();
        System.out.println(age1);

        //taking string input
        System.out.println("Enter your name");
        String Name=sc.next();
        System.out.println(Name);

        //to input a line
        System.out.println("Enter your line");
        String line1=sc.nextLine();
        System.out.println(line1);


    }
}