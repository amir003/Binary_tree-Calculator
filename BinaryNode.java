
public abstract class BinaryNode implements Node {
	
	private Node Fg ;
	private Node Fd ;
  
	public BinaryNode(Node fg, Node fd) {
		Fg = fg;
		Fd = fd;
	}

	public Node getfg() {
	  return this.Fg;
	}
	
	public Node getfd() {
	  return this.Fd;
	}
	

}
