public class HLinkedList {
  
  private HTreeNode head;
  
  private int length = 0;
  
  //constructor initializes a list with a head
  public HLinkedList(HTreeNode head) {
    
    this.head = head;
    if (head != null) {
      //a list with a null head still has length zero
      length += 1;
    }
  }
  
  public HTreeNode getHeadNode() {
    return head;
  }
  
  public void setHeadNode(HTreeNode node) {
    head = node;
  }
  
  public int getLength() {
    return length;
  }
  
  //position one is the head node itself
  public void insertIntoPosition(HTreeNode node, int position) {
    HTreeNode newNode = new HTreeNode(node.getCharacter(), null);
    HTreeNode listrunner = getHeadNode();
    int increment = 1;
    //if substatement handles the case of an empty list
    if (listrunner == null) {
      setHeadNode(newNode);
    }
    else {
      //loop advances listrunner to the node in position (position - 1)
      //excessively large position input will cause the node to be added to the end of the list
      while (listrunner.getNext() != null && increment < position - 1) {
        listrunner = listrunner.getNext();
        increment++;
      }
      //new node is inserted between positions (position - 1) and (position), thus becoming the new (position)
      HTreeNode temp = listrunner.getNext();
      listrunner.setNext(newNode);
      newNode.setNext(temp);
      length += 1;
    }
  }
  
  //basic linked list search function, returns null if the value is not in the list
  public HTreeNode find (char value) {
    HTreeNode listrunner = getHeadNode();
    while (listrunner != null && listrunner.getCharacter() != value) {
      listrunner = listrunner.getNext();
    }
    return listrunner;
  }
  
  //prints to screen the characters of the linked list with comma separators
  @Override
  public String toString() {
    
    StringBuilder sb = new StringBuilder();
    HTreeNode listrunner = getHeadNode();
    while (listrunner != null) {
      sb.append(listrunner.getCharacter());
      //no comma after the final element
      if (listrunner.getNext() != null) {
        sb.append(',');
        sb.append(' ');
      }
      listrunner = listrunner.getNext();
    }
    return sb.toString();
  }
}