class Question12 implements Runnable{
	public void run(){
		System.out.print("Running Man!!");
	}

	public static void main(String[] args){
		Thread t = new Thread(new Question12());
		t.run();
		t.run();
		t.start();
		// IllegalThreadStateException : t.start();
	}
}