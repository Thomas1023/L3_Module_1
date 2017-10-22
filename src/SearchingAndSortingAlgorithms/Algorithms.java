package SearchingAndSortingAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
//		SearchingAndSortingAlgorithms.
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
		
		
	}

	public static Object countPearls(List<Boolean> oysters) {
		int e=0;
		for (int i = 0; i < oysters.size(); i++) {
		if(oysters.get(i)) {
			e++;
			
		}else {
		}
		}
		return e;
	}

	public static double findTallest(List<Double> peeps) {
		double e=0;
		for (int i = 0; i < peeps.size(); i++) {
		if(peeps.get(i)>e) {
			e=peeps.get(i);
		}
		}
		return e;
	}

	public static String findLongestWord(List<String> words) {
		int e=0;
		String s = null;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>e) {
				e=words.get(i).length();
				s=words.get(i);
			}else {
				
			}
		}
		return s;
	}

	public static Object containsSOS(List<String> message2) {
		for (int i = 0; i < message2.size(); i++) {
		if(message2.get(i).contains("... --- ...")) {
			return true;
		}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double x;
		Double y;
		Double t;
		
		List<Double> r = Arrays.asList(new Double[] {});
		r=results;
		for (int i = 0; i < results.size(); i++) {
			for (int e = 0; e < results.size(); e++) {
		x=results.get(i);
		y=results.get(i+e);
		t=x;
			if(results.get(i)>results.get(i+e)) {
				r.set(i, y);
			}else {
				
			}
		}
		}
		return r;
	}

	
	//Add other methods here
}