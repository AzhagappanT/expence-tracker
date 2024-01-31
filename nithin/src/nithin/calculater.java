package nithin;

public class calculater extends palindrome{
	
	public static String operation;
	public static int [] values;
	public static int answer;

	public static int calculater(){
	switch(operation) {
	case "+":
		if(values.length == 1) {
			answer += values[0]; 
		}
		else {
			for(int value : values) {
				answer += value;
			}
		}
		break;
		
	case "-":
		if(values.length == 1) {
			answer -= values[0]; 
		}
		else {
			for(float value : values) {
				answer -= value;
			}
		}
		break;
	case"*":
		if(values.length == 1) {
			answer *= values[0]; 
		}
		else {
			answer = values[0];
			for(int i=1;i<values.length;i++) {
				answer -= values[1];
			}
		}
		break;
	case "/":
		if(values.length == 1) {
			if(values[0] == 0) {
				throw new ArithmeticException("can't divide" + answer+ "with" + values[0]);
			}
			answer /= values[0];
		}
		else {
			answer = values[0];
			for(int i=1;i<values.length;i++) {
				if(values[i] == 0) {
					throw new ArithmeticException("can't divide" + answer + "with" + values[i]);
				}
				answer /= values[i];
			}
		}
		break;
	}
	return answer;
	}

}
