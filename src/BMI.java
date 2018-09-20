import java.util.Scanner;

public class BMI {
   public static void main(String [] args){



    double height ;
    double weight;


     Scanner keyboard;

    //intilaize

   keyboard=new Scanner(System.in);

   //BMI=kg/m*m


System.out.println("Please enter your height(only feet) below");

height =keyboard.nextDouble();
height=height*(1/0.025);


System.out.println("Please enter your weight(only pounds)below");
weight=keyboard.nextDouble();
weight= weight*(1/0.453592);

       System.out.println("Your weight is " + weight+" in kilograms");
       System.out.println("Your height is "+ height+" in meters");


       System.out.println("Your BMI is "+(weight/height));


   }
}
