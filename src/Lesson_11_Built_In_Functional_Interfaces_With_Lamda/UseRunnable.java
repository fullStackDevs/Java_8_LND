package Lesson_11_Built_In_Functional_Interfaces_With_Lamda;

public class UseRunnable {

	public static void main(String[] args) {
		
//		Runnable r1 = new Runnable(){
//			public void run(){
//				System.out.println("Thread 1 running");
//			};
//		};
//		
//		
//		Runnable r2 = new Runnable(){
//			public void run(){
//				System.out.println("Thread 2 running");
//			};
//			
//		};
		
		Runnable r1 = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1 running");
			
		};
		
		Runnable r2 = () -> System.out.println("Thread 2 running");
		
		new Thread(r1).start();
		new Thread(r2).start();
		
		
	}

}
