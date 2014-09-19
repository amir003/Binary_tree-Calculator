
public class Value implements Node {
	private double Val;
	
	public Value(double v)
	{
		Val=v;
	}
	
	public double getV()
	{
		return Val;
	}

	
	public double execute(){
		return Val;
	}

}
