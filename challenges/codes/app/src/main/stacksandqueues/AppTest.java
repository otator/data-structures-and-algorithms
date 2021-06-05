package codes.app.src.main.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest {

  @Test
  public void testPushOneIntoStack() {
    Stack stack = new Stack();
    Integer actual = 5;
    stack.push(5);
    assertEquals("test pushing one value into stack", actual, stack.pop());
  }

  @Test
  public void testPushManyIntoStack() {
    Stack stack = new Stack();
    Integer actual = -7;
    stack.push(5);
    stack.push(4);
    stack.push(-7);
    assertEquals("test pushing one value into stack", actual, stack.peek());
  }

  @Test
  public void testPopToEmptyStack() {
    Stack stack = new Stack();
    stack.push(5);
    stack.push(4);
    stack.push(-7);
    stack.pop();
    stack.pop();
    stack.pop();
    assertNull(stack.peek());
  }

  @Test
  public void testPopEmptyStack() {
    Stack stack = new Stack();
    assertNull(stack.pop());
  }

  @Test
  public void testOneEnqueue() {
    Queue queue = new Queue();
    Integer actual = 12;
    queue.enqueue(12);
    assertEquals("test enqueuing one value into queue", actual, queue.dequeue());
  }

  @Test
  public void testManyEnqueue() {
    Queue queue = new Queue();
    Integer actual = 100;
    queue.enqueue(100);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertEquals("test enqueuing one value into queue", actual, queue.peek());
  }

  @Test
  public void testEmptyQueue() {
    Queue queue = new Queue();
    queue.enqueue(96);
    queue.enqueue(2020);
    queue.enqueue(2021);
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    assertNull(queue.peek());
  }

  @Test
  public void testEmptyQueue2() {
    Queue queue = new Queue();
    assertNull(queue.dequeue());
  }

  //test of PseudoQueue class (queue with stacks)

  @Test
  public void testEnqueue(){
    PseudoQueue queue = new PseudoQueue();
    queue.enqueue(10);
    queue.enqueue(15);
    queue.enqueue(20);
    String expected = "front -> {10} -> {15} -> {20} -> rare";
    assertEquals("test enqueue method", expected, queue.toString());
  }

  @Test
  public void testDequeue(){
    PseudoQueue queue = new PseudoQueue();
    queue.enqueue(10);
    queue.enqueue(15);
    queue.enqueue(20);
    Integer expected = 10;
    assertEquals("test dequeue method", expected, queue.dequeue());
  }

  @Test
  public void testMultiDequeue(){
    PseudoQueue queue = new PseudoQueue();
    queue.enqueue(10);
    queue.enqueue(15);
    queue.enqueue(20);
    queue.dequeue();
    queue.dequeue();
    String expected = "front -> {20} -> rare";
    assertEquals("test multi dequeue method", expected, queue.toString());
  }

  @Test
  public void testDequeueUntilEmpty(){
    PseudoQueue queue = new PseudoQueue();
    queue.enqueue(10);
    queue.enqueue(15);
    queue.enqueue(20);
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    assertNull(queue.dequeue());
  }

}
