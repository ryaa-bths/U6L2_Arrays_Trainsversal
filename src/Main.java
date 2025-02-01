import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    /* for loop access & can modify elements in original array transversed,
    for each loop copies elements, does not modify original array elements
  */

    /// (Traversing Arrays) Question #1
    String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};
    for (int i = 0; i < names.length; i++){
      System.out.println(names[i]);
    }


    /// (Quick Check) Question #5
    //part of multiple choice question for displayed output
    String [] list = {"red", "yellow", "blue"};
    for (int i = 0; i < list.length; i++)
    {
      System.out.print(list[i].length() + "_"); //prints 3_6_4
      /// Question #6
      System.out.print(list[i] + "_"); //rewritten to print red_yellow_blue_. accesses value and printed
    }



    /// (Quick Check) Question #7
    //part of multiple choice. "is intended to display every other element in numbers, beginning with the first element:"
    int[] numbers = {13, 33, 3, -3, -333};
    for (int i = 0; i > numbers.length; i+=2){
        System.out.println(numbers[i]);
    }
    /*Why is this not a complete array traversal?
      It does not access all elements, and it skips elements. (Array Trasversals should access ALL elements)
    */

    /// pt 9 Array Method Madness
    int[] nums = {5, -10, 8, 12, 2, -6, 0};
    System.out.println(ArrayAlgorithms.customToString(nums));
    int[] nums2 = {15};
    System.out.println(ArrayAlgorithms.customToString(nums2));

    System.out.println("----");
    // original numbers lists NOT modified
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums2));
  }
}

