class MyException extends Exception{void foo() throws MyException{throw new MyException();}}
class MysubException extends MyException{void foo() throws MysubException{throw new MysubException();}}
class MyruntimeException extends RuntimeException{void foo()throws MyruntimeException{throw new MyruntimeException();}}

class Test{
	public static void main(String[] args){
		new MyException();
		new MysubException();
		new MyruntimeException();
	}
}