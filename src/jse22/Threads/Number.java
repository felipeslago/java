package jse22.Threads;

import java.util.List;

public class Number implements Runnable {

	int start;
	int end;
	List<Integer> numbers;
	
	public Number(int start, int end, List<Integer> numbers) {
		this.start = start;
		this.end = end;
		this.numbers = numbers;
	}
	
	@Override
	public synchronized void run() {
		for(int i = start; i < end; i++) {
			synchronized (numbers) { // The synchronized command prevents the list, passed by argument, to be accessed by two or more threads at the same time
				numbers.add(i);
			}
		}
	}
	
}
