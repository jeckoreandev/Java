class Threads2 implements Runnable{
	public void run(){
		System.out.println("run");
		throw new RuntimeException("Problem");
	}

	public static void main(String[] args){
		Thread t = new Thread(new Threads2());
		t.start();
		System.out.println("Ent of method");
	}
}

/*
Which two can be results?(choose two);

D. End of method.
   run.
   java.lang.RuntimeException:Problem

E  run
   java.lang.RuntimeException:Problem
   End of emthod.
   */