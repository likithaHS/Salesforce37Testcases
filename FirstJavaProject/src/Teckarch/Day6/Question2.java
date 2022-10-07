package Teckarch.Day6;

public class Question2 {
    public static int[] sortArray(int[] inputArray) {
    
    	for (int i=1;i<inputArray.length;i++) {
    		int currentValue=inputArray[i];
    		int j =i-1;
    		while (j >=0 && inputArray[j]>currentValue) {
    			inputArray[j+1] = inputArray[j];
    			j--;
    		}
    		inputArray[j+1] =currentValue;
    	}
    	return inputArray;
    }
    public static void binarySearch(int[] result,int key) {
    	int n = result.length;
    	boolean found = false;
    	int low = 0,high = n-1;
    
    	while (low <=high) { 	
    		int mid =(low+high)/2;
    		if(key < result[mid]) {
    			high = mid-1;
    		}
    		else if(key> result[mid]) {
    			low =mid+1;
    		}
    		else if (key == result[mid]) {
    			found = true;
    			System.out.println("The key "+key+" is present at index "+mid);
    			break;
    		}
    	}
    	if (!found) {
    	
    		System.out.println("The key "+key+" is not found is the given array");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {4,5,1,2,3};
		int n = a.length;
		int[] result = new int[n];
		result = sortArray(a);
		System.out.println("Sorted array is:");
		for (int i : result) {
			System.out.print(i+" ");
		}
		System.out.println();
		int key =8;
		binarySearch(result,key);

	}

}
