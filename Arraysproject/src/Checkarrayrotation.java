
public class Checkarrayrotation {
	public static int check(int arr[]) {
		int mid=arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<mid) {
				mid=arr[i];
				index=i;
			}
		}
		return index;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,9,11,12,5};
		System.out.print(check(arr));

	}

}
