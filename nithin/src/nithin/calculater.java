package nithin;

class calculater {
	
	
	public static int answer;

	public static float calculater(int[] num1,String operation){
	
	switch(operation) {
	case "+":
		if(num1.length == 1) {
			answer += num1[0]; 
		}
		else {
			for(float value : num1) {
				answer += value;
			}
		}
		break;
		
	case "-":
		if(num1.length == 1) {
			answer -= num1[0]; 
		}
		else {
			answer = num1[0];
			for(int i=1;i<num1.length;i++) {
				answer -= num1[i];
			}
		}
		break;
	case"*":
		if(num1.length == 1) {
			answer *= num1[0]; 
		}
		else {
			answer = num1[0];
			for(int i=1;i<num1.length;i++) {
				answer *= num1[i];
			}
		}
		break;
	case "/":
		if(num1.length == 1) {
			if(num1[0] == 0) {
				throw new ArithmeticException("can't divide" + answer+ "with" + num1[0]);
			}
			answer /= num1[0];
		}
		else {
			answer = num1[0];
			for(int i=1;i<num1.length;i++) {
				if(num1[i] == 0) {
					throw new ArithmeticException("can't divide" + answer + "with" + num1[i]);
				}
				answer /= num1[i];
			}
		}
		break;
	}
	return answer;
	}

}