// Task: Bubble Sort Implementation

package bubblesort;

public class BubbleSort 
{
    static void BubbleSort (int [] a)
    {
        int temp;
        for (int i = 0; i < a.length - 1; i++)
        {
            System.out.println("Pass : " +(i+1));
            
            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1]) 
                { 
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    printArray(a);
                } 
            }
            System.out.println("----------------");
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
        int [] a = {12,8,4,2,5,1,10};
        
        System.out.print("Unsorted Array : ");
        printArray(a);
        System.out.println("----------------");
        
        BubbleSort(a);
        
        System.out.print("Sorted Array : ");
        printArray(a);
    }
}