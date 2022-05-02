package javaapplication25;
import java.util.Scanner;
public class JavaApplication25
{
       public static int getYoungest(int age1, int age2, int age3){
       
        if (age1 < age2 && age1 < age3) {
            return age1;
           
        }else if (age2 < age3 && age2 < age1){
            return age2;
        }else {
            return age3;
        }
    }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
                System.out.print("Age 1: ");
                int age1 = scan.nextInt();
                System.out.print("Age 2: ");
                int age2 = scan.nextInt();
                System.out.print("Age 3: ");
                int age3 = scan.nextInt();
                System.out.print(getYoungest(age1, age2, age3));
        }
}