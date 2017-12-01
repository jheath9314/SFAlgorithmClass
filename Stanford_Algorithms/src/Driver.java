import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		int[] integerList = new int[100000];
		InversionCounter myCounter = new InversionCounter();

		Scanner s = new Scanner(new BufferedReader(new FileReader("List.txt")));

		int i = 0;
		while (s.hasNextInt()) {
			integerList[i++] = s.nextInt();
		}

		myCounter.mergeSort(integerList);

		System.out.print("Inversion Count:" + myCounter.getInversionCount());

	}

}
