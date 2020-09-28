
public class Pushzerotoend {
	public static void push(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,0,0,2,0,3};
		push(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
