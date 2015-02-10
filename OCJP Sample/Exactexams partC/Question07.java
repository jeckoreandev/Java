class simpleCalc{
	public int value;
	public void calculate(){value +=7;}
}

class MultiCalc extends simpleCalc{
	public void calculate(){value -= 3;}
	public void calculate(int multiplier){
		calculate();
		super.calculate();
		value *= multiplier;
	}
	public static void main(String[] args){
		MultiCalc calculator = new MultiCalc();
		calculator.calculate(2);
		System.out.println("Value is : " + calculator.value);
	}
}