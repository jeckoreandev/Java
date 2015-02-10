package ExceptionList;

public class AgeInputException extends Exception{
	public AgeInputException(){
		super("間違えた数値を入力しました。");
	}
}