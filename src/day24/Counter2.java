package day24;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {

	private AtomicInteger count;

	public Counter2() {
		count = new AtomicInteger(0);
	}

	public void increment() {
		count.getAndIncrement();

	}

	public AtomicInteger getCount() {
		return count;
	}
}
