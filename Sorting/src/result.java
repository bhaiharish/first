
public class result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =  {8,9,10,7,6,5,4,3,2,1};
		select s = new select();
		s.selectSort(a);
		bubble b = new bubble();
		b.bubbleSort(a);
		Insertion i = new Insertion();
		i.insertionSort(a);
	}

}
