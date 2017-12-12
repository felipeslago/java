package jsez22.Threads;

public class ThreadClass {

	public static void main(String[] args) {
		
		// The Thread class helps to execute parallel tasks
		// To use Thread is necessary that the object implements the Runnable interface
		// The Runnable interface just needs to override the method run, indicating to the JVM what it needs to execute
		
		Numbers n1 = new Numbers("n1");
		Thread t1 = new Thread(n1);
		t1.run();
		
		Numbers n2 = new Numbers("n2");
		Thread t2 = new Thread(n2);
		t2.start();
		
		// The execution was not symmetric, because the PC has just one processor
		// In this case the JVM uses the thread scheduler to alternate from one to another thread
	}
	
}
