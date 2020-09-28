import java.util.*;
public class missingandrepating {
	public static void two(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int abc=Math.abs(arr[i]);
			if(arr[abc-1]>0)
				arr[abc-1]=-arr[abc-1];
			else {
				System.out.print(abc);
			}
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>0){
				System.out.print(i+1);
			}
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,4,6};
		int n=arr.length;
		two(arr,n);

	}

}
