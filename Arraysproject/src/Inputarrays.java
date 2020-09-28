import java.util.Scanner;

public class Inputarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
