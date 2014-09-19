public class Oppose extends UnaryNode{


	public Oppose(Node n) {
		super(n);
	}

	public double execute() {
	  double a=0;
	  a = -(getNode().execute());
	  return a;
	}

}