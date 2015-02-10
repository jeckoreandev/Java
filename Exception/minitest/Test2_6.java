class MyException extends Exception{
	public MyException(String message){
		super(message);
	}
}

class Calc{
	private int result;
	public void div(int x , int y) throws MyException{
		if(y!=0){
			this.result = x / y;
		}else{
			throw new MyException("ZERO");
		}
	}
	public int getResult(){
		return result;
	}
}

class Test2_6{
	public static void main(String[] args){
		int x = 10 , y =0;

		int result = 0;

		Calc calc = new Calc();
		try{
			calc.div(x,y);
			result = calc.getResult();
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}catch(RuntimeException e){
			System.out.println("RuntimeException");
		}catch(MyException e){ // -------------------------------catch
			new MyException("message");
			System.out.println("MyException");
		}
		catch(Exception e){
			System.out.println("Exception");
		} //----------------------------------------------------output String "end"
		System.out.println("end");
	}
}