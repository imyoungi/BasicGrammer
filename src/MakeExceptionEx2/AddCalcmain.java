package MakeExceptionEx2;

public class AddCalcmain {

	public static void main(String[] args) {
		AddCalculator addCalc = new AddCalculator();

		int ret = 0;
		try {
			ret = addCalc.add(1, -10);
		} catch (AddCalcException e) {
			e.printStackTrace();
		}
		System.out.println(ret);

	}

}
