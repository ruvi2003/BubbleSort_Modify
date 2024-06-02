package Bubblemodify;

public class ModifiedBubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int ar[] = {36, 6, 37, 68, 43};
		        int n = ar.length;

		        modifiedBubbleSort(ar, n);
		        System.out.println("Sorted Array:");
		        for (int i = 0; i < n; i++) {
		            System.out.println(ar[i]);
		        }
		    }

	
		    public static void modifiedBubbleSort(int[] ar, int n) {
		        boolean swapped;
		        int temp;

		        for (int i = 0; i < n - 1; i++) {
		            swapped = false;

		            for (int j = 0; j < n - 1 - i; j++) {
		                if (ar[j] > ar[j + 1]) {
		                 
		                    temp = ar[j];
		                    ar[j] = ar[j + 1];
		                    ar[j + 1] = temp;

		                    
		                    swapped = true;
		                }
		            }

		            
		            if (!swapped) {
		                break;
		            }
		        }
		    }
		

	}


