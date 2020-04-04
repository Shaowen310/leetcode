package lib.list.singlylinkedlistint;

import java.io.Serializable;

public class ListNode implements Serializable {
	private static final long serialVersionUID = -3127496909000809556L;

	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
