public class HTreeNode {
  
  private char character;
  
  private int frequency;
  
  private HTreeNode next;
  
  //Used by queues only
  private HTreeNode previous;
  
  private HTreeNode left;
  
  private HTreeNode right;
  
  private String code;
  
  //this constructor used in building the HLinkedList
  public HTreeNode(char character, HTreeNode next) {
    
    this.character = character;
    frequency = 1;
    this.next = next;
    previous = null;
    left = null;
    right = null;
    code = null;
  }
  
  //this constructor used to make nonleaf nodes for the HTree
  public HTreeNode(int frequency, HTreeNode left, HTreeNode right) {
    character = (char) -1;
    this.frequency = frequency;
    next = null;
    previous = null;
    this.left = left;
    this.right = right;
    code = null;
  }
  
  //thus follows the getter and setter methods for each field
  
  public char getCharacter() {
    
    return character;
  }
    
  public int getFrequency() {
    
    return frequency;
  }
  
  public HTreeNode getNext() {
    
    return next;
  }
  
  public HTreeNode getPrevious() {
    return previous;
  }
  
  public HTreeNode getLeft() {
    
    return left;
  }
    
  public HTreeNode getRight() {
    
    return right;
  }
    
  public String getCode() {
    
    return code;
  }
  
  //instead of a setFrequency, since it will only ever increment by one anyway
  public void incrementFrequency() {
    
    frequency += 1;
  }
  
  public void setNext(HTreeNode next) {
    
    this.next = next;
  }
  
  public void setPrevious(HTreeNode node) {
    previous = node;
  }
  
  public void setLeft(HTreeNode left) {
    
    this.left = left;
  }
  
  public void setRight(HTreeNode right) {
    
    this.right = right;
  }
  
  public void setCode(String code) {
    
    this.code = code;
  }
}