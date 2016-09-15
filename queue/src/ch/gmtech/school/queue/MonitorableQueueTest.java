package ch.gmtech.school.queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonitorableQueueTest {

	private MonitorableQueue monitorableQueue;
	
	@Before
	public void background(){
		this.monitorableQueue = new MonitorableQueue();
	}
	
	@Test
	public void initAsEmpty() {
		assertTrue(this.monitorableQueue.isEmpty());
	}

	@Test
	public void fifo() {
		this.monitorableQueue.enqueue(1);
		this.monitorableQueue.enqueue(2);
		this.monitorableQueue.enqueue("a");
		this.monitorableQueue.enqueue("b");

		assertFalse(this.monitorableQueue.isEmpty());

		assertEquals(this.monitorableQueue.dequeue(), 1);
		assertEquals(this.monitorableQueue.dequeue(), 2);
		assertEquals(this.monitorableQueue.dequeue(), "a");
		assertEquals(this.monitorableQueue.dequeue(), "b");

		assertNull(this.monitorableQueue.dequeue());
		initAsEmpty();
	}
	
}
