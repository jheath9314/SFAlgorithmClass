
public class QuickSort {

	private static int totalLowComparisons = 0;
	private static int totalLastComparisons = 0;

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

	public void quickSort(int[] arr, int low, int high) {
		if (high - low <= 0) {

			return;
		}

		else {

			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);

			totalLastComparisons = totalLastComparisons + high - low;
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
			p = 4;
			partitionIndex = 4;
		}

		swap(arr, low, partitionIndex);

		int i = low + 1;
		for (int j = low + 1; j <= high; j++) {

			if (arr[j] < p) {

				swap(arr, i, j);
				i++;

			}
		}

		swap(arr, low, i - 1); // i - 1?
		return i - 1;
	}

	public void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
