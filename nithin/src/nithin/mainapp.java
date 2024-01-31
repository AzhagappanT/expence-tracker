package nithin;
import java.util.*;
public class mainapp{
	public static String operation;
	
   public static int num1[];
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
            System.out.println("1.calculater");
            System.out.println("2.palindrome");
            System.out.println("3.reverse string");
            System.out.println("4.find prime number or not");
            System.out.println("enter to exit to stop the program");
            Scanner num = new Scanner(System.in);
            String number = num.nextLine();
            if(number.equals("1")) {
            	while(true) {
            	System.out.println("enter any operators + - * / ");
                 operation = num.nextLine();
                 System.out.println("Enter how many num to calculate");
                int count = num.nextInt();
                num1 = new int[count];
                 for(int i=0;i<count;i++) {
                	 System.out.println("Enter values");
                	 int value = num.nextInt();
            		 num1[i] = value; 
            	}
            	
            	calculater t = new calculater();
                @SuppressWarnings("static-access")
				float ans = t.calculater(num1,operation);
                  System.out.println(ans);
                  System.out.println("enter exit to exit from calculater to continue enter yes");
                  String exit = num.next();
                  exit.toLowerCase();
                  if(exit.equals("exit")) {
                	  break;
                  }
            	}
            }
                 
            
            else if(number.equals("2")) {
            	while(true) {
            	System.out.println("Enter a word");
            	String words = num.nextLine();
            	palindrome ta = new palindrome();
            	ta.palindrome(words);
            	System.out.println("enter exit to exit from palindrome to continue enter yes");
            	  String exit = num.next();
                  exit.toLowerCase();
                if(exit.equals("exit")) {
              	  break;
                }
                else {
                	continue;
                }
            	}
            }
            
            else if(number.equals("3")) {
           while(true) {
            	System.out.println("Enter a String");
            	Scanner n = new Scanner(System.in);
            	String w = n.next();
            	reverseString e = new reverseString();
            	e.rev(w);
            	System.out.println("enter exit to exit from reverse string to continue enter yes");
            	  String exit = num.next();
                  exit.toLowerCase();
                if(exit.equals("exit")) {
              	  break;
                }
           }
            }
            else if(number.equals("4")) {
            	while(true) {
            	System.out.println("Enter a number");
            	int number1 = num.nextInt();
            	prime a = new prime();
            		
            	boolean an = a.isprime(number1);
            	if(an) {
            		System.out.println("is a prime");
            	}
            	else {
            		System.out.println("not a prime");
            	}
            	System.out.println("enter exit to exit from prime finder to continue enter yes");
            	  String exit = num.next();
                  exit.toLowerCase();
                if(exit.equals("exit")) {
              	  break;
                }
            }
            }
            if(number.equals("to exit")) {
            	return;
            }
	   }
		
		
	}
	}


