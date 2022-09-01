import java.util.Random;

public class Driver extends AlexsSorting
{
   public static void main(String[] args)
   {  
      //make the sort arrays and swap/changes array
      int[] bValues = new int[50];
      int[] sValues = new int[50];
      int[] iValues = new int[50];
      int[] qValues = new int[50];
      int[] sc = { 0, 0};
      
      // call randomArrayGen to put the random numbers
      // into the arrays
      randomArrayGen(bValues,sValues,iValues,qValues);
      
      // call bSort to sort and display input/output
      bSort(bValues,sc);
      // call scReset to reset swap/changes array
      scReset(sc);
      // call sSort to sort and display input/output
      sSort(sValues,sc);
      // call scReset to reset swap/changes array 
      scReset(sc); 
      // call iSort to sort and display input/output
      iSort(iValues,sc);
      // call scReset to reset swap/changes array 
      scReset(sc);
      // call qSort to sort and display input/output 
      qSort(qValues,sc);               
   }// end main
   
   public static void randomArrayGen(int[] b, int[] s, int[] i, int[] q)
   {
      Random rand = new Random();
      
      // make the random array then put it in all of the other arrays
      for(int x = 0; x < 50 ; ++x)
      {
         b[x] = rand.nextInt((1000 - 0) + 1) + 0;
         s[x] = b[x];
         i[x] = b[x];
         q[x] = b[x];
      }
   }// end randomArrayGen
   
   public static void scReset(int[] sc)
   {
      // set sc[0] and sc[1] to 0
      sc[0] = 0;
      sc[1] = 0;
   }// end scReset
   
   public static void bSort(int[] bValues,int[] sc)
   {
	  // Display original array order
      System.out.print("Original order: ");
      for(int element : bValues)
         System.out.print(element + " ");
      
      // Call bubbleSort 
      AlexsSorting.bubbleSort(bValues, sc);
      
      // Display Sorted array
      System.out.print("\nBubble sorted order: ");
      for(int element : bValues)
         System.out.print(element + " ");
      
      // Display swaps and compares
      System.out.print("\nBubble swaps :" + sc[0] + "\nBubble compares :" +
         sc[1]);
   }// end bSort
   
   public static void sSort(int[] sValues,int[] sc)
   {
	  // Display original array order
      System.out.print("\nOriginal order: ");
      for(int element : sValues)
         System.out.print(element + " ");
       
      // Call selectionSort 
      AlexsSorting.selectionSort(sValues, sc);
        
      // Display Sorted array
      System.out.print("\nSelection sorted order: ");
      for(int element : sValues)
         System.out.print(element + " ");
         
      // Display swaps and compares
      System.out.print("\nSelection swaps :" + sc[0] + "\nSelection compares :" +
         sc[1]);
   }// end sSort
   
   public static void iSort(int[] iValues,int[] sc)
   {
	  // Display original array order
      System.out.print("\nOriginal order: ");
      for(int element : iValues)
         System.out.print(element + " ");
            
      // Call insertionSort 
      AlexsSorting.insertionSort(iValues, sc);
          
      // Display Sorted array
      System.out.print("\nInsertion sorted order: ");
      for(int element : iValues)
         System.out.print(element + " ");
         
      // Display swaps and compares
      System.out.print("\nInsertion swaps :" + sc[0] + "\nInsertion compares :" +
         sc[1]);
   }// end iSort
   
   public static void qSort(int[] qValues,int[] sc)
   {
	  // Display original array order
      System.out.print("\nOriginal order: ");
      for(int element : qValues)
         System.out.print(element + " ");
            
      // Call quickSort 
      AlexsSorting.quickSort(qValues, sc);

      // Display Sorted array 
      System.out.print("\nQuick sorted order: ");
      for(int element : qValues)
         System.out.print(element + " ");
         
      // Display swaps and compares
      System.out.print("\nQuick swaps :" + sc[0] + "\nQuick compares :" +
         sc[1]);
   }// end qSort
}// end Driver class
