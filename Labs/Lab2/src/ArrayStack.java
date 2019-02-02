
public class ArrayStack<E> implements Stack<E> {
	private int size = 0;
	@SuppressWarnings("unchecked")
	private E[] stack = (E[]) new Object[100];

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public void push(E e) {
		if (size == stack.length) {
			@SuppressWarnings("unchecked")
			E[] larger = (E[]) new Object[stack.length * 2];

			for (int index = 0; index < stack.length; index++)
				larger[index] = stack[index];
			stack = larger;
		}

		stack[size] = e;
		size++;

	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if (isEmpty())
			return null;
		else
			return (E) stack[0];
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			E elem = stack[0];
			for (int index = 1; index < stack.length; index++)
				stack[index - 1] = stack[index];
			size--;
			return elem;
		} else
			return null;

	}

}
