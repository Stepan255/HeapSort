package HeapSort;

import java.util.Random;

public class ArrayHeapSort {
	int[] array = new int[0];
	int length = 0;

	public ArrayHeapSort(int length) {
		this.length = length;
		array = new int[length];
		Random rnd = new Random(System.currentTimeMillis());
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + rnd.nextInt(30 - 1);
		}
	}

	public void sort() {

		for (int i = this.length / 2 - 1; i >= 0; i--)
			pile(this.array, this.length, i);

		for (int i = this.length - 1; i >= 0; i--) {
			int temp = this.array[0];
			this.array[0] = this.array[i];
			this.array[i] = temp;

			pile(this.array, i, 0);
		}
	}

	void pile(int array[], int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && array[left] > array[largest])
			largest = left;

		if (right < n && array[right] > array[largest])
			largest = right;
		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;

			pile(array, n, largest);
		}
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += ((Integer)(array[i])).toString() + ", ";
		}
		return str;
	}
}