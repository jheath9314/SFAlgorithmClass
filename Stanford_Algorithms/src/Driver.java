import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Driver.problemOne();
		Driver.problemTwo();
	}

	public static void problemOne() throws FileNotFoundException {

		int[] integerList = new int[100000];
		InversionCounter myCounter = new InversionCounter();

		Scanner s = new Scanner(new BufferedReader(new FileReader("List.txt")));

		int i = 0;
		while (s.hasNextInt()) {
			integerList[i++] = s.nextInt();
		}

		s.close();

		myCounter.mergeSort(integerList);

		System.out.print("Inversion Count: " + myCounter.getInversionCount());

	}
	
	public static void problemTwo() throws FileNotFoundException {
		
		int[] integerList = new int[10000];
		Scanner s = new Scanner(new BufferedReader(new FileReader("Quicksort.txt")));
		
		int i = 0;
		while (s.hasNextInt()) {
			integerList[i++] = s.nextInt();
		}

		s.close();
		
		QuickSort mySorter = new QuickSort();
		
		mySorter.partitionType = QuickSort.partitionTypeType.LAST;
		mySorter.quickSort(integerList, 0, integerList.length - 1);
		
		for(i = 0; i < integerList.length; i++) {
			
			System.out.println(integerList[i] + " ");
		}
		
		System.out.println("Total comparisons low: " + mySorter.getTotalLowComparisons());
		System.out.println("Total comparisons last: " + mySorter.getTotalLastComparisons());
		System.out.println("Total comparisons Mix: " + mySorter.getTotalMixComparisons());
	}
}
