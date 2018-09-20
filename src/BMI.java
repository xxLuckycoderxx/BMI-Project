import java.util.Scanner;

public class BMI {
   public static void main(String [] args){


    int kg,wg;
     Scanner keyboard;

    //intilaize

   keyboard=new Scanner(System.in);

   //BMI=kg/m*m

System.out.println("Please enter your weight in kilograms below");
kg=keyboard.nextInt();

System.out.println("Please enter your height in meters below");
wg=keyboard.nextInt();




       System.out.println("Your BMI is "+ (kg/wg)+"!");

   }
}
