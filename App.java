package HeapSort;

public class App {

	public static void buttonStart() {
		int length = new ConsoleScaner().getLength("Введите длинну массива: ", 1, 30);
		ArrayHeapSort array = new ArrayHeapSort(length);
		System.out.println("Несортированный массив: " + array);
		array.sort();
		System.out.println("Отсортированный массив: " + array);
	}
}
