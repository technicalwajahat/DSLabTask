// Task: Insertion Sort Implementation 

package insertionsort;

public class InsertionSort 
{
    static void InsertionSort (int [] a)
    {
        for (int i = 1; i < a.length; i++) 
        { 
            int val = a[i]; 
            int j; 
  
            for (j = i; j > 0 && val < a[j - 1]; j--)
            { 
                a[j] = a[j - 1];
            } 
            
            a[j] = val;
            printArray(a);              // Print values after each sorted step
        }
    }
       
    static void printArray(int [] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int [] a = {9,12,5,8,3,10,2,18};
        
        System.out.print("Unsorted Array : ");        
        printArray(a);
        System.out.println("------------------");

        InsertionSort(a);
        
        System.out.println("------------------");
        System.out.print("Sorted Array : ");
        printArray(a);
    }
}