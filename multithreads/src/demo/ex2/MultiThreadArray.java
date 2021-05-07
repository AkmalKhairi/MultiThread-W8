package demo.ex2;

public class MultiThreadArray {
	public static void main(String args[]) {
		Runnable arrayPrinter1 = new ArrayThread();
		Runnable arrayPrinter2 = new ArrayThread();
		
		Thread  t1 = new Thread(arrayPrinter1, "Thread [txt]");
		Thread t2 = new Thread(arrayPrinter2, "Thread [word1]");
		
		t1.start();
		t2.start();
    }
}
