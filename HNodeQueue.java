//The queue is used to build the HTree
public class HNodeQueue {
  
  private HTreeNode front;
  
  private HTreeNode rear;
  
  private int length;
  
  //constructor initializes an empty queue
  public HNodeQueue() {
    front = null;
    rear = null;
    length = 0;
  }
  
  //add a node to the queue
  public void add(HTreeNode node) {
    //addition to an empty queue
    if (front == null) {
      front = node;
      rear = node;
      length += 1;
    }
    //addition to a populated queue
    else {
      rear.setNext(node);
      node.setPrevious(rear);
      rear = node;
      length += 1;
    }
  }
  
  //returns the node in the front of the queue
  public HTreeNode look() {
    return front;
  }
  
  //deletes the node in the front of the queue
  public void remove() {
    //deletion from an empty queue does nothing
    if (front == null) {
      return;
    }
    //deletion from a single-element queue
    else if (front == rear) {
      front = null;
      rear = null;
      length -= 1;
      return;
    }
    //deletion from a populated queue
    else {
      front.getNext().setPrevious(null);
      front = front.getNext();
      length -= 1;
    }
  }
  
  //having the length as a field saves some expensive comparisons elsewhere
  public int getLength() {
    return length;
  }
}