
public class Main_p2 {

	public static void main(String[] args) {
	  Node val1 = new Value(6);
	  Node val2 = new Value(5);
	  Node val3 = new Value(7);
	  Node val4 = new Value(2);
	  
	  Node res1 = new Plus(val1,val2);
	  double add1;
	  add1=res1.execute();
	  System.out.println("Premiere addition : " +add1);
	  
	  Node res2 = new Division(val3,val4);
	  double div;
	  div=res2.execute();
	  System.out.println("Resultat de la division : " +div);
	  
	  Node res_fin= new Plus(res1,res2);
	  double res;
	  res=res_fin.execute();
	  System.out.println("Le résultat du calcul est : " +res);
	  
	  
	  Node val5 = new Value(64);
	  
	  Node rac = new Racine(val5);
	  double r;
	  r= rac.execute();
	  System.out.println("La racine de : " +val5.getV()+" est "+ r);
  
	}
}
