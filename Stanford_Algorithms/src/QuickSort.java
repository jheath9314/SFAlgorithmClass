
public class QuickSort {

	private int totalLowComparisons = 0;
	private int totalLastComparisons = 0;
	private int totalMixComparisons = 0;

	public enum partitionTypeType {
		FIRST, LAST, MIX
	};

	public partitionTypeType partitionType = partitionTypeType.FIRST;

	public int getTotalLowComparisons() {

		return totalLowComparisons;
	}

	public int getTotalLastComparisons() {

		return totalLastComparisons;
	}

	public int getTotalMixComparisons() {

		return totalMixComparisons;
	}

	public void quickSort(int[] arr, int low, int high) {
		if (high - low <= 0) {

			return;
		}

		else {

			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);

			totalMixComparisons = totalMixComparisons + high - low;
		}

	}

	public int partition(int[] arr, int low, int high) {

		int p;
		int partitionIndex;
		if (partitionType == partitionTypeType.FIRST) {

			p = arr[low];
			partitionIndex = low;
		}

		else if (partitionType == partitionTypeType.LAST) {
			p = arr[high];
			partitionIndex = high;
		} else {

			// the mix condition
			int middleIndex = (high + low) / 2;
			int middleValue = arr[middleIndex];
			int firstValue = arr[low];
			int lastValue = arr[high];

			if ((middleValue < firstValue && middleValue > lastValue)
					|| (middleValue > firstValue && middleValue < lastValue)) {

				// middle index is median
				partitionIndex = middleIndex;
				p = arr[middleIndex];

			} else if ((firstValue < middleValue && firstValue > lastValue)
					|| (firstValue > middleValue && firstValue < lastValue)) {
				// first is the median
				partitionIndex = low;
				p = arr[low];
			}

			else {
				// last is the median
				partitionIndex = high;
				p = arr[high];

			}

		}

		swap(arr, low, partitionIndex);

		int i = low + 1;
		for (int j = low + 1; j <= high; j++) {

			if (arr[j] < p) {

				swap(arr, i, j);
				i++;

			}
		}

		swap(arr, low, i - 1);
		return i - 1;
	}

	public void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
