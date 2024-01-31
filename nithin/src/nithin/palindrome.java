package nithin;

public class palindrome {
public void palindrome(String word) {
	
	char rev[] = word.toCharArray();
	String str = "";
	for(int i= rev.length-1;i>=0;i--) {
		str += rev[i];
	}
	
	if(word.equals(str)) {
		System.out.println("Its a palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
