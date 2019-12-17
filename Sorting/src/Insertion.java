
public class Insertion {

	public void insertionSort(int[] arr) {
		 	for(int i=1;i<arr.length;i++) {
		 		int temp = arr[i];
		 		int hole = i;
		 	while(hole>0 && arr[hole-1]>temp) {
		 		arr[hole] = arr[hole-1];
		 		hole--;
		 	}
		 	arr[hole]=temp;
		 }
		 	for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
	}
}
