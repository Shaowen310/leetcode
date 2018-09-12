package test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import lib.list.singlylinkedlistint.SinglyLinkedListInt;
import question.A143ReorderList;
import solution.A143O1SpaceO2NTime;

public class A143Test {
	A143ReorderList sol = new A143O1SpaceO2NTime();

	@Test
	public void testZeroElement() {
		List<Integer> list = Arrays.asList();
		SinglyLinkedListInt linkedList = new SinglyLinkedListInt();
		linkedList.addAll(list);
		sol.reorderList(linkedList.getHead());
		Object arr[] = linkedList.toArray();
		Object expected[] = {};
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testOneElement() {
		List<Integer> list = Arrays.asList(1);
		SinglyLinkedListInt linkedList = new SinglyLinkedListInt();
		linkedList.addAll(list);
		sol.reorderList(linkedList.getHead());
		Object arr[] = linkedList.toArray();
		Object expected[] = { 1 };
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testTwoElements() {
		List<Integer> list = Arrays.asList(1, 2);
		SinglyLinkedListInt linkedList = new SinglyLinkedListInt();
		linkedList.addAll(list);
		sol.reorderList(linkedList.getHead());
		Object[] arr = linkedList.toArray();
		Object expected[] = { 1, 2 };
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testFourElements() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		SinglyLinkedListInt linkedList = new SinglyLinkedListInt();
		linkedList.addAll(list);
		sol.reorderList(linkedList.getHead());
		Object[] arr = linkedList.toArray();
		Object expected[] = { 1, 4, 2, 3 };
		System.out.println(Arrays.toString(arr));
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testFiveElements() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		SinglyLinkedListInt linkedList = new SinglyLinkedListInt();
		linkedList.addAll(list);
		sol.reorderList(linkedList.getHead());
		Object[] arr = linkedList.toArray();
		Object expected[] = { 1, 5, 2, 4, 3 };
		assertArrayEquals(expected, arr);
	}
}
