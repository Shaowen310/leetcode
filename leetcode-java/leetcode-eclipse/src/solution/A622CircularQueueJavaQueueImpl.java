package solution;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

import question.A622DesignCircularQueueJavaQueue;

public class A622CircularQueueJavaQueueImpl<T> implements A622DesignCircularQueueJavaQueue<T> {

	private Object a[];
	private int s;
	private int e;
	private int size;

	/**
	 * Initialize your data structure here. Set the size of the queue to be
	 * capacity.
	 */
	public A622CircularQueueJavaQueueImpl(int capacity) {
		a = new Object[capacity];
		s = 0;
		e = 0;
		size = 0;
	}

	@Override
	public boolean add(T arg0) {
		if (size() >= a.length) {
			throw new IllegalStateException();
		}
		// else: size < a.length
		offerInternal(arg0);
		return true;
	}

	@Override
	public T element() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return peekInternal();
	}

	@Override
	public boolean offer(T arg0) {
		if (size() >= a.length) {
			return false;
		}
		// else: size < a.length
		offerInternal(arg0);
		return true;
	}

	private void offerInternal(T arg0) {
		// assert (size() < a.length)
		a[e++] = arg0;
		e %= a.length;
		size++;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		// else: !isEmpty()
		return peekInternal();
	}

	@SuppressWarnings("unchecked")
	public T peekInternal() {
		// assert (!isEmpty())
		return (T) a[s];
	}

	@Override
	public T poll() {
		if (isEmpty()) {
			return null;
		}
		// else: !isEmpty()
		return pollInternal();
	}

	private T pollInternal() {
		// assert (!isEmpty())
		@SuppressWarnings("unchecked")
		T val = (T) a[s++];
		s %= a.length;
		size--;
		return val;
	}

	@Override
	public T remove() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		// else: !isEmpty()
		return pollInternal();
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		s = 0;
		e = 0;
		size = 0;
	}

	@Override
	public boolean contains(Object arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty() {
		return size() <= 0;
	}

	@Override
	public Iterator<T> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] arg0) {
		throw new UnsupportedOperationException();
	}

}
