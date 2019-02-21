//-- implement stack using a queue
public class QStack<E> implements Stack<E> {

	private int size = 0;
	private  SQueue<E> queue = new SQueue<E>();
	private  SQueue<E> queue2 = new SQueue<E>();

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	@Override
	public void push(E e) {
		if (!queue.isEmpty()) {
		while (!queue.isEmpty()) {
			queue2.enqueue( queue.dequeue());
			
		}
		queue.enqueue(e);
		while (!queue2.isEmpty()) {
			queue.enqueue(queue2.dequeue());
		}
		
		}
		else queue.enqueue(e);
		size++;
		
		
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		
		if (!isEmpty()) 
			return queue.first();
		return null;
	
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (queue.isEmpty()) return null;
		size--;
		return queue.dequeue();
	}

}
