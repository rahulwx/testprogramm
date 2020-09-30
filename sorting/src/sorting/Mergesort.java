package sorting;

public class Mergesort {
	public static void mergesort(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=(si+ei)/2;
		mergesort(arr,si,mid);
		mergesort(arr,mid+1,ei);
		merge(arr,si,ei);
	}
	private static void merge(int arr[],int si,int ei) {
		int mid=(si+ei)/2;
		int ans[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei) {
			if(arr[i]<=arr[j]) {
				ans[k]=arr[i];
				i++;
				k++;
			}
			else {
				ans[k]=arr[j];
				k++;
				j++;
			}
		}
			while(i<=mid) {
				ans[k]=arr[i];
				i++;
				k++;
			}
			while(j<=ei) {
				ans[k]=arr[j];
				k++;
				j++;
				
			}
			for(int ix=0;ix<ans.length;ix++) {
				arr[si+ix]=ans[ix];
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,8,9,1};
		mergesort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
