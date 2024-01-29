package nithin;
import java.util.*;

public class mainapp extends subclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("1.calculater");
            System.out.println("2.palindrome");
            System.out.println("3.reverse string");
            System.out.println("4.find odd or even number");
            Scanner num = new Scanner(System.in);
            int number = num.nextInt();
            if(number == 1) {
            	String operation = num.nextLine();
            	System.out.println("enter any operators + - * / ");
            	float value = num.nextInt();
            	System.out.println("Enter values");
                float ans =  subclass.calculater();
            }
	}

}
