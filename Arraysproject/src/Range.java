
public class Range {
	public static int[] range(int arr[],int n) {
		int first=-1,last=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				first=i;
				break;
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==n) {
				last=i;
				break;
			}
		}
		return new int[] {first,last};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,7,8,8,0,1};
		int n=8;
		int arr1[];
		arr1=range(arr,n);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}

	}

}
