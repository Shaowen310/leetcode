package question;

import lib.list.singlylinkedlistint.ListNode;

/**
 * <p>
 * Given a singly linked list L: L0¡úL1¡ú¡­¡úLn-1¡úLn,<br>
 * reorder it to: L0¡úLn¡úL1¡úLn-1¡úL2¡úLn-2¡ú¡­
 * </p>
 * 
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be
 * changed.
 * </p>
 * 
 * <p>
 * Example 1:
 * </p>
 * 
 * <p>
 * Given 1->2->3->4, reorder it to 1->4->2->3.
 * </p>
 * 
 * <p>
 * Example 2:
 * </p>
 * 
 * <p>
 * Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 * </p>
 */
public interface A143ReorderList {
	public void reorderList(ListNode head);
}
