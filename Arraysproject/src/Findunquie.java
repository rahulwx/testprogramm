import java.util.*;
public class Findunquie {
	public static int unquie(int arr[]) {
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j])
					break;
			}
			if(j==arr.length)
				return arr[i];
		}
		return Integer.MAX_VALUE;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,2,3};
		System.out.print(unquie(arr));

	}

}
