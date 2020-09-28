
public class Findfirstandlast {
	public static void find(int arr[],int n) {
		int start=-1,end=-1;
		for(int i=0;i<arr.length;i++) {
			if(n!=arr[i])
				continue;
			if(start == -1) //{} why is differnce is there
				start=i;
				end=i;
		}
		if(start!=-1) {
			System.out.print(start);
			System.out.print(end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,7,8,8,8,0,1};
		int n=8;
		find(arr,n);

	}

}
