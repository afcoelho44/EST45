package QuickisortProf;

public class QuickSortrecursivo {

	
	public static void swap(int[] values, int i, int j){
		int aux   = values[i];
		values[i] = values[j];
		values[j] = aux;
	}
	
	public static int partition(int[] values, int left, int right) {

		int pivot = values[left];
		int i = left;

		for (int j = left + 1; j <= right; j++) {
			if (values[j] <= pivot) {
				i += 1;
				swap(values, i, j);
			}
		}

		// troca pivot (values[left]) com i.
		swap(values, left, i);

		return i;
	}

	public static void quickSort(int[] values, int left, int right) {
		if (left < right) {
			int index_pivot = partition(values, left, right);
			quickSort(values, left, index_pivot - 1);
			quickSort(values, index_pivot + 1, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {1,5,3,2,4};
		
		quickSort(values, 0, values.length-1);
		
		for (int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");

	}

}
