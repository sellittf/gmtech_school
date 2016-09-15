package ch.gmtech.school.queue;

interface Queue {

	public void enqueue(Object o);
	
	public Object dequeue();
	
	public boolean isEmpty();
}
