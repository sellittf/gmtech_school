package ch.gmtech.school.queue;

import java.util.ArrayList;

public class MonitorableQueue implements Queue {

	private ArrayList<Object> objects = new ArrayList<Object>();
	
	public void enqueue(Object o) {
		objects.add(o);
	}

	public Object dequeue() {
		if(isEmpty()){
			return null;
		}else{
			return objects.remove(0);
		}
	}
	
	public boolean isEmpty(){
		return this.objects.isEmpty();
	}

}
