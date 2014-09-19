
public class Plus extends BinaryNode {

	public Plus(Node fg, Node fd) {
		super(fg, fd);
	}

	public double execute() {
		return getfg().execute()+getfd().execute();
	}

}
