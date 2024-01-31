package nithin;
import java.util.*;

public class mainapp extends calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
            System.out.println("1.calculater");
            System.out.println("2.palindrome");
            System.out.println("3.find prime");
            System.out.println("4.find odd or even number");
            System.out.println("enter" + "to exit"  + "to exit"); 
            Scanner num = new Scanner(System.in);
            String number = num.nextLine();
            if(number.equals("1")) {
            	 operation = num.nextLine();
            	System.out.println("enter any operators + - * / ");
            	int value =  num.nextInt();
            	for(int i=0;i<value;i++) {
            	values[i] = value;
            	mainapp j = new mainapp();
            	j.calculater();
            	}
            	System.out.println("Enter values");
                
                }
             else if(number.equals("2")){
                 System.out.println("enter a string");
                 String word = num.nextLine();
                 mainapp j = new mainapp();
                 j.palindrome(word);
             }   
            else if(number.equals("3")){
                  System.out.println("enter num");
                 int n = num.nextInt();
		        prime na = new prime();
		        if (na.isprime(n)) {
		            System.out.println("is prime");
		        } else {
		            System.out.println("not");
		        }
		                }
            else if(number.equals("to exit")){
               return;
            }
            }
	}

}
