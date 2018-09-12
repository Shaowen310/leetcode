package lib.list.singlylinkedlistint;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class SinglyLinkedListInt extends AbstractSequentialList<Integer> implements List<Integer>, Serializable {

	private static final long serialVersionUID = 9147047983716440546L;

	ListNode head = null;
	ListNode tail = null;
	int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public boolean contains(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<Integer> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		int i = 0;
		for (ListNode x = head; x != null; x = x.next) {
			result[i++] = x.val;
		}
		return result;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(Integer e) {
		if (e == null) {
			return false;
		}
		if (head == null) {
			head = new ListNode(e);
			tail = head;
		} else {
			tail.next = new ListNode(e);
			tail = tail.next;
			if (head.next == null) {
				head.next = tail;
			}
		}
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		Optional<Boolean> existMutation = c.stream().map(this::add).reduce((x, y) -> x || y);
		if (existMutation.isPresent()) {
			return existMutation.get();
		} else {
			return false;
		}
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		while (head != null) {
			ListNode nextNode = head.next;
			head.next = null;
			head = nextNode;
		}
		size = 0;
		tail = null;
	}

	@Override
	public Integer get(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Integer set(int index, Integer element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(int index, Integer element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Integer remove(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<Integer> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	public ListNode getHead() {
		return head;
	}

}
