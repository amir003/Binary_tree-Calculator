
public class Racine extends UnaryNode{


	public Racine(Node n) {
		super(n);
	}

	public double execute() {
	  double a;
	  a=Math.sqrt(getNode().execute());
	  return a;
	}

}