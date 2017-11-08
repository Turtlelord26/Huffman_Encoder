public class HTree {
  
  private HTreeNode root;
  
  //constructor initializes a tree with a root. The root may or may not have children.
  public HTree(HTreeNode root) {
    
    this.root = root;
  }
  
  public HTreeNode getRoot() {
    
    return root;
  }
}