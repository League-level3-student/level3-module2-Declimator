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
		int min = array[0];
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] < min) {
				min = array[i];
				for(int j = i; j > 0; j--) {
					int x = array[j];
					array[j] = array[j-1];
					display.updateDisplay();
				}
				array[0] = array[i];


			}

		}
	}
	
}
