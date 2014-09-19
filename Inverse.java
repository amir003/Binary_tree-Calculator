
public class Inverse extends UnaryNode{


	public Inverse(Node n) {
		super(n);
	}

	public double execute() {
	  double a=0;
	  if (getNode().execute()!=0){
	    a=1/(getNode().execute());
	  }
	  else{
	    System.out.println("Inverse de 0 n'existe pas");
	  }
	  return a;
	}

}