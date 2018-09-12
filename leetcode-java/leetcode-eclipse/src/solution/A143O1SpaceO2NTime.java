package solution;

import lib.list.singlylinkedlistint.ListNode;
import question.A143ReorderList;

public class A143O1SpaceO2NTime implements A143ReorderList {

	@Override
	public void reorderList(ListNode head) {
		// Find middle position
		if (head == null || head.next == null) {
			return;
		}
		ListNode pSlow = head;
		ListNode pFast = head;
		while (pFast.next != null && pFast.next.next != null) {
			pSlow = pSlow.next;
			pFast = pFast.next.next;
		}

		ListNode pTailHead = pSlow.next;
		ListNode pTailIter = pTailHead.next;
		pTailHead.next = null;
		pSlow.next = null;
		// Tail reverse
		while (pTailIter != null) {
			ListNode iterNext = pTailIter.next;
			pTailIter.next = pTailHead;
			pTailHead = pTailIter;
			pTailIter = iterNext;
		}

		// Assembly
		while (head != null && pTailHead != null) {
			ListNode headNext = head.next;
			head.next = pTailHead;
			pTailHead = pTailHead.next;
			head = head.next;
			head.next = headNext;
			head = head.next;
		}
	}

}
