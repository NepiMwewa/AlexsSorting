public class AlexsSorting
{
   public static void bubbleSort(int[] array, int[] sc)
   {
      int lastPos;// Last element position to compare
      int index;// Element index to compare
      int temp;// Used to swap two elements
      
      // The outer loop positions lastPos at the last element
      // to compare during each pass through the array. Initially
      // lastPos is the index of the last element in the array.
      // During each iteration, it is decreased by one.
      for(lastPos = array.length - 1; lastPos >= 0; lastPos--)
      {
         // The inner loop steps through the array, comparing
         // each element with its neighbor. All of the elements
         // first index 0 through lastPos are involved in the 
         // comparison. If two elements are out of order, they
         // are swapped.
         for(index = 0; index <= lastPos - 1; index++)
         {
            // Compare an element to its right
            if(array[index] > array[index + 1])
            {
               // Swap two elements
               temp = array[index];
               array[index] = array[index + 1];
               array[index + 1] = temp;
               
               sc[0]++;// increase swapping by 1
            }// End if
            sc[1]++;// increase compare by 1
         }// End inner for
      }// End outer for
   }// End bubbleSort
   
   public static void selectionSort(int[] array, int[] sc)
   {
      int startScan;// Starting position of the scan
      int index;// To hold a subscript value
      int minIndex;// Element with smallest value in the scan
      int minValue;// The smallest value found in the scan
      
      // The outer loop iterates once for each element in the
      // array. The startScan variable marks the postion where
      // the scan should begin.
      for(startScan = 0; startScan < (array.length - 1); startScan++)
      {
         // Assume the first element in the scannable area
         // is the smallest value
         minIndex = startScan;
         minValue = array[startScan];
         
         // Scan the array, starting at the 2nd element in
         // the scannable area. We are looking for the smallest
         // value in the scannable area.
         for(index = startScan + 1; index < array.length; index++)
         {
            if(array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
               sc[0]++;// increase swapping by 1
            }// End if
            sc[1]++;// increase compare by 1
         }// End inner for
         
         // Swap the element with the smallest value 
         // with the first element in the scannable area.
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }// End outer for
   }// End selectionSort
   
   public static void insertionSort(int[] array, int[] sc)
   {
      int unsortedValue;// The first unsorted value
      int scan; // Used to scan the array
      
      // The outer loop steps the index variable through each
      // subscript in the array, starting at 1. The portion of the
      // array consisting of element 0 by itself is already sorted.
      
      for(int index = 1; index < array.length; index++)
      {
         // The first element outside the sorted portion is
         // array[index]. Store the value of this element
         // in the unsortedValue.
         unsortedValue = array[index];
         
         // Start scan at the subscript of the first element
         // in the still unsorted part.
         scan = index;
         
         // Move the first element in the still unsorted part
         // into its proper position within the sorted part.
         while(scan > 0 && array[scan - 1] > unsortedValue)
         {
            array[scan] = array[index - 1];
            scan--;
            sc[0]++;// increase swapping by 1
            sc[1]++;// increase compare by 1
         }
         sc[1]++;// increase compare by 1
         
         // Insert the unsorted value in its proper position 
         // within the sorted part.
         array[scan] = unsortedValue;
      }// End for
   }// end insertionSort
   
   public static void quickSort(int array[], int sc[])
   {
      doQuickSort(array, 0, array.length - 1, sc);
   }
   
   private static void doQuickSort(int array[], int start, int end, int sc[])
   {
      int pivotPoint;
      
      if(start< end)
      {
         // Get the pivot point.
         pivotPoint = partition(array, start, end, sc);
         
         // Sort the first sublist.
         doQuickSort(array, start, pivotPoint - 1, sc);
         
         // Sort the second sublist.
         doQuickSort(array, pivotPoint + 1, end, sc);
      }// End if
   }// end quickSort
   
   private static int partition(int array[], int start, int end, int sc[])
   {
      int pivotValue;// To hold the pivot value.
      int endOfLeftList;// Last element in the left sublist.
      int mid;// To hold the mid-point subscript.
      
      // Find the subscript of the middle element.
      // This will be out pivot value.
      mid = (start + end) / 2;
      
      // Swap the middle element with the first element.
      // This moves the pivot value to the start of 
      // the list.
      swap(array, start, mid);
      
      // Save the pivot value for comparisons.
      pivotValue = array[start];
      
      // For now, the end of the left sublist is
      // the first element.
      endOfLeftList = start;
      
      // Scan the entire list and move any values that
      // are less than the pivot value to the left
      // sublist
      for(int scan = start + 1; scan <= end; scan++)
      {
         if(array[scan] < pivotValue)
         {
            endOfLeftList++;
            swap(array, endOfLeftList, scan);
            sc[0]++;// increase swapping by 1
         }// End if
         sc[1]++;// increase compare by 1
      }// End for
      
      // Move the pivot value to the end of the
      // left sublist.
      swap(array, start, endOfLeftList);
      
      // Return the subscript of the pivot value.
      return endOfLeftList;
   }// End partition 
   
   private static void swap(int[] array, int a, int b)
   {
      int temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }// End swap
}