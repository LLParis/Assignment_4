/**
 * Recursion assignment solutions.
 * This class contains recursive solutions to the problems in Assignment 4.
 * Each method is designed to perform specific recursive tasks, such as,
 * calculating products, counting digit matches, generating patterns, finding minimum values,
 * and performing selection sorts.
 *
 * @author London Paris
 */
public class Recursion {
  public static void main(String[] args) {
    System.out.println("Product of the first even integer: " + productOfEvens(1));
    System.out.println("Product of the first two even integers: " + productOfEvens(2));
    System.out.println("Product of the first three even integers: " + productOfEvens(3));
    System.out.println("Product of the first four even integers: " + productOfEvens(4));

    int n1 = 1072503891;
    int n2 = 62530841;
    int n3 = 123456;
    int n4 = 1234;
    int n5 = 33333;
    int n6 = 3434;
    System.out.println();

    System.out.println("The number of digit matches between " + n1 + " and " + n2 + " are " + countDigitMatches(n1, n2));
  }

  /**
   * Calculates the product of the first n even integers using recursion.
   * @param n The number of even integers to multiply.
   * @return Product of the first n even integers.
   * @throws IllegalArgumentException if n is less than or equal to 0.
   */
  public static int productOfEvens(int n) throws IllegalArgumentException {
    if (n <= 0) {
      throw new IllegalArgumentException("Value must be greater than 0.");
    }
    if (n == 1) {
      return 2;
    }
    return 2 * n * productOfEvens(n - 1);
  }

  /**
   * Counts matching digits in the same positions from the end in two integers.
   * @param n1 The first non-negative integer
   * @param n2 The second non-negative integer
   * @return The number of matching digits
   * @throws IllegalArgumentException if either number is negative
   */
  public static int countDigitMatches(int n1, int n2) throws IllegalArgumentException {
    if (n1 < 0 || n2 < 0) {
      throw new IllegalArgumentException("Numbers must be non-negative.");
    }
    if (n1 == 0 && n2 == 0) {
      return 0;
    }
    int match = 0;
    if (n1 % 10 == n2 % 10) {
      match++;
    } else {
      match++;
    }
    return match * countDigitMatches(n1 / 10, n2 / 10);
  }

  /**
   * Generates a symmetric pattern sequence up to n.
   * @param n The integer parameter for pattern generation.
   * @return A symmetric string sequence.
   * @throws IllegalArgumentException if n is less than 1.
   */
  public static String generatePattern(int n) throws IllegalArgumentException {
    if (n < 1) {
      throw new IllegalArgumentException("Value must be at least 1 or greater.");
    }
    if (n == 1) {
      return "1";
    }
    String center = "";
    if (n % 2 == 0) {
      center = "1 1";
    } else {
      center = "1";
    }

    return generatePattern(n + 1);
  }

  /**
   *
   * @param array
   * @param cur
   * @param minLocation
   * @return
   */
  public static int recFindMin(int[] array, int cur, int minLocation) {
    if (cur == array.length) {
      return minLocation;
    }
    if (array[cur] < array[minLocation]) {
      minLocation = cur;
    }
    return recFindMin(array, cur + 1, minLocation);
  }

  public static int findMin(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Array must not be empty.");
    }
    return recFindMin(array, 0, 0);
  }

  /**
   *
   * @param array
   * @param startIndex
   */
  public static void recSelectionSort(int[] array, int startIndex) {
    if (startIndex == array.length - 1) {
      return; // Array is sorted
    }
    int minIndex = recFindMin(array, startIndex, startIndex);
    int temp = array[startIndex];
    array[startIndex] = array[minIndex];
    array[minIndex] = temp;
    recSelectionSort(array, startIndex + 1);

  }

  /**
   * Wrapper method for recursive selection sort.
   * @param array The array to sort
   */
  public static void selectionSort(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Array must contain values.");
    }
    return recSelectionSort(array, 0);
  }

}
