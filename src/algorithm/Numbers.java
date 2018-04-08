package algorithm;

import databases.ConnectDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10];
		storeRandomNumbers(num);
		ConnectDB connectDB = new ConnectDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Come to conclusion about which Sorting Algo is better in given data set.

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time " + num.length + " numbers in Insertion Sort takes: " + insertionSortExecutionTime + " milli sec");

		// Bubble Sort
		algo.insertionSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time " + num.length + " numbers in Bubble Sort takes: " + bubbleSortExecutionTime + " milli sec");

		// Quick Sort
//		algo.quickSort(num, findLow[num], findHigh[num]);
//		long quickSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time " + num.length + " numbers in Quick Sort takes: " + quickSortExecutionTime + " milli sec");

		// Heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time " + num.length + " numbers in Heap Sort takes: " + heapSortExecutionTime + " milli sec");

		// Bucket Sort
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time " + num.length + " numbers in Bucket Sort takes: " + bucketSortExecutionTime + " milli sec");
	}
	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10);
		}
	}
	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static int findLow(int[]array){
		int low = array[0];
		for (int n:array){
			if (array[n] < low){
				low = array[n];
			}
		}
		return low;
	}

	public static int findHigh(int[]array){
		int high = array[0];
		for (int n:array){
			if (array[n] > high){
				high = array[n];
			}
		}
		return high;
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
