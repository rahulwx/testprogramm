import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<>();
		System.out.println(list1.size());
		list1.add(15);
		list1.add(25);
		list1.add(35);
		list1.add(2,50);
		list1.set(3, 40);
		//System.out.println(list1.size());
		//System.out.println(list1.get(2));
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		for(int i:list1) {
			System.out.print(i+" ");
		}

	}

}
