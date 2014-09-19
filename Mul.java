
public class Mul extends BinaryNode {

	public Mul(Node fg, Node fd) {
	  super(fg, fd);
	}

	public double execute() {
	  return getfg().execute()*getfd().execute();
	}

}
