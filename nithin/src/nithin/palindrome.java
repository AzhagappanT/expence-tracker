package nithin;

public class palindrome {
  public static void palindrome(String words) {
        char rev = ' ';
	  for(int i = words.length()-1;i>0;i--) {
		  rev = (char) (rev + words.charAt(i));
	  }
	  if(words.equals(rev)) {
	  System.out.println("is a palin");
	  }
	  else {
		  System.out.println("is not a palin");
				  
	  }
  }
}
