public class Question03{
	public static void main(String[] args){
		protected void run(){}
		Object obj = new Object();
		synchronized (Thread.currentThread()){
			obj.wait();
			obj.notify();
		}
	}
}