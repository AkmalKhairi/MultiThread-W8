package demo.ex3;

public class MultiThreadArrayOverload {
	
	
	public static void main(String[] args) {
		
		Runnable arrayS = new ArraySleep();
		Thread Word1 = new Thread(arrayS);
		Word1.setName("arraySleepThread");
		
		Thread arrT = new ArrayThread();
		arrT.setName("arrayThread");
		
		Word1.start();
		arrT.start();

	}

}
