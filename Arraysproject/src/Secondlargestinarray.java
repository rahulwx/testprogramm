
public class Secondlargestinarray {
	public static int largest(int arr[]) {
		int i=0;
		for(i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}

		return arr[i-2];
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,20,50};
		System.out.print(largest(arr));
		

	}

}
