package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> pearls) {
		int counter = 0;
		for(int i = 0; i < pearls.size(); i++) {
			if(pearls.get(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	public static double findTallest(List<Double> peeps) {
		double maximum = 0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > maximum)
				maximum = peeps.get(i);
		}
		return maximum;
	}
}
