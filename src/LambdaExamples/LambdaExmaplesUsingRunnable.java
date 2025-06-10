package LambdaExamples;

public class LambdaExmaplesUsingRunnable {
	
	// syntax: () -> {};
	//       input params -> {statements}

	public static void main(String[] args) {
		
		//runnable interface in lambda

		
//		new Thread((name) -> {System.out.println(name);};).start();
		Runnable runnable1 = () -> System.out.println("runnable 1");
		new Thread(runnable1).start();
		new Thread(() -> {
			System.out.println("runnable 2 line1");
			System.out.println("runnable 2 line2");
		}).start();

	}

}
