package org.example.sandbox.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListQueueTest {

    @Test
    public void testOffer() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        assertTrue(queue.offer("first"));
        assertTrue(queue.offer("second"));
        //assertEquals(2, queue.size());
    }

    @Test
    public void testPoll() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.poll());
        assertEquals("second", queue.poll());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.peek());
        assertEquals("first", queue.peek()); // Ensure peek does not remove the element
    }

    @Test
    public void testIsEmpty() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        assertTrue(queue.isEmpty());
        queue.offer("first");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testOfferNull() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        assertThrows(NullPointerException.class, () -> queue.offer(null));
    }

    @Test
    public void testPollEmptyQueue() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        assertNull(queue.poll());
    }

    @Test
    public void testPeekEmptyQueue() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        assertNull(queue.peek());
    }

    @Test
    public void testToString() {
        ArrayListQueue<String> queue = new ArrayListQueue<>();
        queue.offer("first");
        queue.offer("second");
        assertEquals("Queue [first, second]", queue.toString());
    }
}


