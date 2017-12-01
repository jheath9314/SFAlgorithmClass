import java.util.List;

public class InversionCounter {

	private long inversionCount = 0;

	public long getInversionCount() {
		return inversionCount;
	}

	public void mergeSort(int[] input) {
		if (input.length < 2) {
			return;
		}

		int[] leftArray = new int[input.length / 2];
		int[] rightArray = new int[input.length - (input.length / 2)];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = input[i];
		}

		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = input[(input.length / 2) + i];
		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, input);

	}

	public void merge(int[] leftArray, int[] rightArray, int[] input) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftArray.length && j < rightArray.length) {

			if (leftArray[i] < rightArray[j]) {
				input[k] = leftArray[i];
				k++;
				i++;

			} else {
				input[k] = rightArray[j];
				j++;
				k++;
				inversionCount += leftArray.length - i;
			}

		}

		while (i < leftArray.length) {
			input[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < rightArray.length) {
			input[k] = rightArray[j];
			k++;
			j++;
		}

	}

}