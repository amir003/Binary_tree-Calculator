
public class Division extends BinaryNode {

	public Division(Node fg, Node fd) {
		super(fg, fd);
	}

	public double execute() {
		if (getfd().execute() != 0){
			return getfg().execute()/getfd().execute();
		}
		else return 0;
	}

}