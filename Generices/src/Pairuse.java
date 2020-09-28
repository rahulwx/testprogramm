
public class Pairuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,String> n=new Pair<String,String>("abc","abc");
		Pair<Integer,Integer> n1=new Pair<>(1,2);
		System.out.println(n1.getfirst());
		int a=30;
		int b=40;
		int c=45;
		//tripling the pair
		Pair<Integer,Integer> n4=new Pair<>(a,b);
		Pair<Pair<Integer,Integer>,Integer> n3=new Pair<>(n4,c);
		System.out.println(n3.getsecond());

	}

}
