package sorting;

public class Quicksort {
	public static void quickSort(int[] input, int startIndex, int endInedx) {
        if(startIndex >= endInedx) {
            return;
        }
        int partitionIndex = partition(input, startIndex, endInedx);
        quickSort(input, startIndex, partitionIndex-1);
        quickSort(input, partitionIndex+1, endInedx);
    }
	public static int partition(int[] input, int startIndex, int endInedx) {
        int pivot = input[startIndex];
        int count = 0;
        for(int i = startIndex+1; i <= endInedx; i++) {
            if(input[i] <= pivot) { 
                count++;
            }
        }
        int pivotIndex = startIndex + count;
        input[startIndex] = input[pivotIndex];
        input[pivotIndex] = pivot;
        int i = startIndex, j = endInedx;
        while(i < j) {

            while(i <= endInedx && input[i] <= pivot) {
                i++;
            }
            while(input[j] > pivot) {
                j--;
            }
            if(i <= j) {
               int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,6,2,1,3};
		quickSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(arr[i]+" ");
		}

	}

}
