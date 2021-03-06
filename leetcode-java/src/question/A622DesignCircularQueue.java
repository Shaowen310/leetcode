package question;

public interface A622DesignCircularQueue {

	/**
	 * Insert an element into the circular queue. Return true if the operation is
	 * successful.
	 */
	public boolean enQueue(int value);

	/**
	 * Delete an element from the circular queue. Return true if the operation is
	 * successful.
	 */
	public boolean deQueue();

	/** Get the front item from the queue. */
	public int Front();

	/** Get the last item from the queue. */
	public int Rear();

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty();

	/** Checks whether the circular queue is full or not. */
	public boolean isFull();
}
