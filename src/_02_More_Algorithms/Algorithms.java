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
	public static String findLongestWord(List<String> words) {
		int max = words.get(0).length();
		String str = words.get(0);
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > max) {
				max = words.get(i).length();
				str = words.get(i);
			}
		}
		return str;
	}
	public static boolean containsSOS(List<String> message) {
		for(int i = 0; i < message.size(); i++) {
			if(message.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results){
		for(int j = 0; j < results.size(); j++) {
			for(int i = results.size()-2; i >= 0; i--) {
			if(results.get(i) > results.get(i+1)) {
				Double x = results.get(i);
				results.set(i, results.get(i+1));
				results.set(i+1, x);
			}
			}
		}
		return results;
	}
	public static List<String> sortDNA(List<String> sequence){
		for(int i = 0; i < sequence.size(); i++) {
			for(int j = sequence.size()-2; j >=0; j--) {
				if(sequence.get(j).length() > sequence.get(j+1).length()) {
					String str = sequence.get(j);
					sequence.set(j, sequence.get(j+1));
					sequence.set(j+1, str);
				}
			}
		}
		return sequence;
	}
	public static List<String> sortWords(List<String> words){
		for(int i = 0; i < words.size(); i++) {
			for(int j = words.size()-2; j >=0; j--) {
				if(words.get(j).compareTo(words.get(j+1)) > 0) {
					String str = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, str);
				}
			}
		}
		return words;
	}
}
