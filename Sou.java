
public class Sou extends BinaryNode {

	public Sou(Node fg, Node fd) {
	  super(fg, fd);
	}

	public double execute() {
	  return getfg().execute()-getfd().execute();
	
	}

}