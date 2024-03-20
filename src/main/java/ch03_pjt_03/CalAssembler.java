package ch03_pjt_03;

public class CalAssembler {

	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;

	public CalAssembler(MyCalculator calculator, CalAdd calAdd, CalSub calSub, CalMul calMul, CalDiv calDiv) {
		super();
		this.calculator = calculator;
		this.calAdd = calAdd;
		this.calSub = calSub;
		this.calMul = calMul;
		this.calDiv = calDiv;
	}


	public void assemble() {
		calculator.calculate(10, 5, calAdd);
		calculator.calculate(10, 5, calSub);
		calculator.calculate(10, 5, calMul);
		calculator.calculate(10, 5, calDiv);

	}
}