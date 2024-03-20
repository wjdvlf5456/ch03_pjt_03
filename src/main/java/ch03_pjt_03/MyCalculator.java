package ch03_pjt_03;

public class MyCalculator {
	public void calculate(int fNum, int sNum, ICalculator calculator) {
		int value = calculator.doOperation(fNum, sNum);

		System.out.println("result : " + value);

	}
}
