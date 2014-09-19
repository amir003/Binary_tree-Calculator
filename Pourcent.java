public class Pourcent extends UnaryNode {
	/*
	public Pourcent(Node fg, Node fd) {
		super(fg, fd);
	}
	*/
	public Pourcent(Node n) {
		super(n);
	}
	
	public double execute() {
		return (getNode().execute())/100;
	}

}