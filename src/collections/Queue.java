package collections;

import java.io.Serializable;

/**
 * @author Gavin Lumsden
 * @param <T>
 */
public class Queue<T extends Comparable<T>> implements Serializable {

    // properties of the class
    private Node head;
    private Node tail;
    private int length;

    /**
     * Default constructor for the class
     */
    public Queue() {
        finalize();
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            length--;
            T data = (T) head.data;
            if (tail == head) {
                finalize();
            } else {
                head = head.next;
                head.previous.next = null;
                head.previous = null;
                System.gc();
            }
            return data;
        }
    }

    public boolean enqueue(T data) {
        if (data == null) {
            return false;
        }
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = tail;
            tail.previous = node;
            tail = node;
        }
        length++; 
        return true;
    }
    
    public T front() {
        if (isEmpty()) return null; 
        return (T)head.data; 
    }
    
    public T back() {
        if (isEmpty()) return null; 
        return (T)tail.data; 
    }

    /**
     *
     */
    @Override
    public final void finalize() {
        head = tail = null;
        length = 0;
        System.gc();
    }

    /**
     *
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    /**
     *
     *
     * @return
     */
    @Override
    public Queue clone() {
        return this;
    }

    /**
     *
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     *
     *
     * @return
     */
    public boolean isEmpty() {
        return length == 0;
    }

    /**
     *
     *
     * @return
     */
    public int size() {
        return length;
    }

}
