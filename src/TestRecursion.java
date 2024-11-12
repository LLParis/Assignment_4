import java.io.PrintWriter;

public class TestRecursion {
    /**
    * Runs all tests for productOfEvens() method
    * @param outputStream - output stream, used to print into the screen
    * @return number of points the problem is worth if all the tests ran successfully. If any of the tests failed the method returns a 0.
    */
   public static boolean testProductOfEvens(PrintWriter outputStream)
   {
       int expectedCount = 3;
       int count = 0;
       outputStream.println("\r\n----productOfEvens() TEST SET -------------------------------------------------------\r\n");
       
      
// Test #1   
       if( Recursion.productOfEvens(1)==2 && Recursion.productOfEvens(3)==48 && Recursion.productOfEvens(5)==3840) 
       {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 01 productOfEvens() - regular functionality",  "PASSED");
           count++;
       }
       else outputStream.printf("%-80s%-10s\r\n", "TEST SET 01 productOfEvens() - regular functionality",  "FAILED");
//Test #2        
        try{
            int ignoreMe = Recursion.productOfEvens(0); //1
            outputStream.printf("%-80s%-10s\r\n", "TEST SET 01 productOfEvens() - IllegalArgumentException test #1",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 01 productOfEvens() - IllegalArgumentException test #1",  "PASSED");
           count++;             
        }
//Test #3        
        try{
            int ignoreMe = Recursion.productOfEvens(-1);
            outputStream.printf("%-80s%-10s\r\n", "TEST SET 01 productOfEvens() - IllegalArgumentException test #2",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 01 productOfEvens() - IllegalArgumentException test #2",  "PASSED");
           count++;             
        }    
       
        return count==expectedCount;
        
   }


   /**
    * Runs all tests for countDigitMatches() method
    * @param outputStream - output stream, used to print into the screen
    * @return number of points the problem is worth if all the tests ran successfully. If any of the tests failed the method returns a 0.
    */
   public static boolean testCountDigitMatches(PrintWriter outputStream)
   {
       int expectedCount = 3;
       int count = 0;
       outputStream.println("\r\n---- countDigitMatches() TEST SET -------------------------------------------------------\r\n");
   
      
// Test #1
       if( Recursion.countDigitMatches(3, 3)==1 && Recursion.countDigitMatches(3, 4)==0 && Recursion.countDigitMatches(123456, 1234)==0 && Recursion.countDigitMatches(33333, 3454)== 1) 
       {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 02 countDigitMatches() - regular functionality",  "PASSED");
           count++;
       }
       else outputStream.printf("%-80s%-10s\r\n", "TEST SET 02 countDigitMatches() - regular functionality",  "FAILED");
//Test #2        
        try{
            int ignoreMe = Recursion.countDigitMatches(-1, 3);
            outputStream.printf("%-80s%-10s\r\n", "TEST SET 02 countDigitMatches() - IllegalArgumentException test #1",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 02 countDigitMatches() - IllegalArgumentException test #1",  "PASSED");
           count++;             
        }
//Test #3        
        try{
            int ignoreMe = Recursion.countDigitMatches(3, -3);
            outputStream.printf("%-80s%-10s\r\n", "TEST SET 02 countDigitMatches() - IllegalArgumentException test #2",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 02 countDigitMatches() - IllegalArgumentException test #2",  "PASSED");
           count++;             
        }    
       
        return count==expectedCount;
  
   }
   
  /**
    * Runs all tests for generatePattern() method
    * @param outputStream - output stream, used to print into the screen
    * @return number of points the problem is worth if all the tests ran successfully. If any of the tests failed the method returns a 0.
    */
   public static boolean testGeneratePattern(PrintWriter outputStream)
   {
       int expectedCount = 3;
       int count = 0;
       
       outputStream.println("\r\n---- generatePattern() TEST SET -------------------------------------------------------\r\n");
      
// Test #1
       if( Recursion.generatePattern(1).equals("1")  && Recursion.generatePattern(2).equals("11") && Recursion.generatePattern(3).equals("212") && Recursion.generatePattern(7).equals("4321234") && Recursion.generatePattern(8).equals("43211234")) 
       {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 03 generatePattern() - regular functionality",  "PASSED");
           count++;
       }
       else outputStream.printf("%-80s%-10s\r\n", "TEST SET 03 generatePattern() - regular functionality",  "FAILED");
//Test #2        
        try{
            String ignoreMe = Recursion.generatePattern(0);
            outputStream.printf("%-80s%-10s\r\n", "TEST SET 03 generatePattern() - IllegalArgumentException test #1",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 03 generatePattern() - IllegalArgumentException test #1",  "PASSED");
           count++;             
        }
//Test #3        
        try{
            String ignoreMe = Recursion.generatePattern(-5);
            outputStream.printf("%-80s%-10s\r\n", "TEST SET 03 generatePattern() - IllegalArgumentException test #2",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 03 generatePattern() - IllegalArgumentException test #2",  "PASSED");
           count++;             
        }    
        
        return count==expectedCount;
        
   }
     /**
    * Runs all tests for findMin() method
    * @param outputStream - output stream, used to print into the screen
    * @return number of points the problem is worth if all the tests ran successfully. If any of the tests failed the method returns a 0.
    */
   public static boolean testFindMin(PrintWriter outputStream)
   {
       int expectedCount = 1;
       int count = 0;
       
       outputStream.println("\r\n---- findMin() TEST SET -------------------------------------------------------\r\n");
       
       int[] a1 = {1};
       int[] a2  ={1, 2};
       int[] a3  ={2, 1};        
       int[] a4  ={2, 1, 4, 3, 1, 5, -6};   
       int[] a5  ={2, 1, 4, 3, -4, 5, 6};
       
// Test #1 and ONLY
       if(Recursion.findMin(a1)== 0 && 
    		   Recursion.findMin(a2)== 0 && 
    		   Recursion.findMin(a3)== 1 && 
    		   Recursion.findMin(a4)== 6 && 
    		   Recursion.findMin(a5)== 4) 
       {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 04 findMin() - regular functionality",  "PASSED");
           count++;
       }
       else outputStream.printf("%-80s%-10s\r\n", "TEST SET 04 findMin() - regular functionality",  "FAILED");

        int val = 0;
        return count==expectedCount;
 
   }
   
     /**
    * Runs all tests for selectionSort() method
    * @param outputStream - output stream, used to print into the screen
    * @return number of points the problem is worth if all the tests ran successfully. If any of the tests failed the method returns a 0.
    */
   public static boolean testSelectionSort(PrintWriter outputStream)
   {
       int expectedCount = 1;
       int count = 0;
     
       outputStream.println("\r\n---- selectionSort() TEST SET -------------------------------------------------------\r\n");

       int[] a1 = {1};
       int[] a2  ={1, 2};
       int[] a3  ={2, 1};        
       int[] a4  ={2, 1, 4, 3, 1, 5, -6};   
       int[] a5  ={2, 1, 4, 3, -4, 5, 6};
       
// Test #1 and ONLY
       Recursion.selectionSort(a1);
       Recursion.selectionSort(a2);
       Recursion.selectionSort(a3);
       Recursion.selectionSort(a4);
       Recursion.selectionSort(a5);
       if(isSorted(a1) && 
    		   isSorted(a2) && 
    		   isSorted(a3) && 
    		   isSorted(a4) && 
    		   isSorted(a5)) 
       {
           outputStream.printf("%-80s%-10s\r\n", "TEST SET 05 selectionSort() - regular functionality",  "PASSED");
           count++;
       }
       else outputStream.printf("%-80s%-10s\r\n", "TEST SET 05 selectionSort() - regular functionality",  "FAILED");

        return count==expectedCount;
   }
   
   /**
    * Checks if array is sorted
    * @param array to be examined
    * @return true if array is sorted, false if it is not
    */
   public static boolean isSorted(int[] array)
   {
       for(int i = 0; i<array.length-1; i++)
       {
           if(array[i]>array[i+1]) return false;
       }
       return true;
   }
}
