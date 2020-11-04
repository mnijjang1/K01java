package ex03operator;

public class E05ShortCircuitEvaluation {
	
	/*
	 SCE(Short-Circuit Evaluation)
	  - 하나의 조건 검사만으로 결과를 알 수 있는 경우
	  	java컴파일러는 그 이후의 조건을 수행하지 않고 건너뛰게 된다.
	  - 이로 인해 변수의 값이 변경되는 코드가 뒷부분에 들어있다면 실행되지 않으므로 주의해야한다.
	  - 따라서 변수의 값을 변화시키는 코드는 조건문 위에서 작성하고 조건문 내부에 포함하여 쓰지 않는 것을 권장한다.  
	 */
	public static void main(String[] args) {
		
		int num1=0, num2=0;
		boolean result;
		
		/*
		 num1이 false이며 &&을 읽는 순간 결과값은 뒷부분과 관계없이 false이므로
		 && 뒷부분은 스킵(무시)하여 실행되지 않는다
		 */
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+ result);
		System.out.println("num1="+num1+", num2="+num2);
		
		/*
		 num1이 true이며 ||을 읽는 순간 결과값은 뒷부분과 관계없이 true이므로
		 || 뒷부분은 스킵(무시)하여 실행되지 않는다
		 */
		result =(num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+ result);
		System.out.println("num1="+ num1+ ", num2="+num2);
		
		/*
		 개발자는  num2의 값을 10씩 증가시킬 의도가 있었으나 SCE에 의해 num2는 전혀 실행되지 않고 무시됨.
		 최종적으로 num2의 값은 20이 아닌 0을 유지한다.
		 */
	}

}
