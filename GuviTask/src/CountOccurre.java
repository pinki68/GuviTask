package classtask;

public class CountOccurre {

	public static void main(String[] args) {

		// Declare the array
		int[] arr = { 1, 2, 3, 1, 4, 1 };

		// Variables to track the highest frequency and the corresponding element
		int maxFrequency = 0;
		int mostFrequentElement = Integer.MAX_VALUE;

		// Outer loop to pick each element
		for (int i = 0; i < arr.length; i++) {
			int count = 0; // Count the occurrences of the current element

			// Inner loop to count occurrences of arr[i]
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			// Update the most frequent element based on conditions
			if (count > maxFrequency || (count == maxFrequency && arr[i] < mostFrequentElement)) {
				maxFrequency = count;
				mostFrequentElement = arr[i];
			}
		}

		// Output the result
		System.out.println("Most frequent element: " + mostFrequentElement + " (frequency: " + maxFrequency + ")");
	}

}
