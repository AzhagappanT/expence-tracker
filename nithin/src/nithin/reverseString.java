package nithin;

import java.util.Scanner;

public class reverseString {

public void rev(String word) {
	char rev[] = word.toCharArray();
	String str="";
	for(int i = rev.length-1;i>=0; i--) {
		 str += rev[i];
	 }
	System.out.println(str);
}
}
