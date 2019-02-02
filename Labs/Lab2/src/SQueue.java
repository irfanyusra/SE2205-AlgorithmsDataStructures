
//using only 2 stacks
public class SQueue<E> implements Queue<E> {
	private int size = 0;
	private ArrayStack <E> stack1 = new ArrayStack<E>();
	private ArrayStack <E> stack2 = new ArrayStack<E>();


	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {	
		return (size==0);
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		if (!isEmpty()) return stack1.top();
		else 
		return null;
	}

	@Override
	public void enqueue(E node) {
		// add last
		
		for (int i=0; i<size; i++) {
			stack2.push(stack1.pop());
		}
		stack2.push(node);
		size++;
		for (int i=0; i<size; i++) {
			stack1.push(stack2.pop());
		}
		
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return stack1.pop();
	}

}
