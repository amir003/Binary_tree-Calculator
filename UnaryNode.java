
public abstract class UnaryNode implements Node{
	private Node n;
	
	public UnaryNode(Node nod) {
		n=nod;
	}
	
	public Node getNode(){
		return n;
	}

}
