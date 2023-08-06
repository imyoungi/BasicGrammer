package MakeExceptionEx2;

public class AddCalculator {
	public int add(int n1, int n2) throws AddCalcException{
		int result = n1 + n2;
		if(result < 0) {
			throw new AddCalcException("result : "+result);
		}
		return result;
	}
}

/* 사용자화 예외(내가 만드는 예외)
 * if 결과가 0보다 작은 경우, 예외로 처리 하고 싶다!
 * 
 */

