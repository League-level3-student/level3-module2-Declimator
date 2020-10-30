package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length-2; j >= 0; j--) {
				if(array[j] > array[j+1]) {
					int x = array[j];
					array[j] = array[j+1];
					array[j+1] = x;

				}
			}
			display.updateDisplay();
		}
	}
	
}
