
public class Deleteelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,4,6,4};
		int n=5;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
