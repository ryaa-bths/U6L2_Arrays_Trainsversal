/// (Traversing Arrays) Question #2-4
import java.util.Arrays;

public class ArrayRunner
{
   public static void main(String[] args)
   {
     int[] numArray =  {2, 6, 7, 12, 5};
     multAll(numArray, 2);
     printValues(numArray);
     System.out.println(Arrays.toString(numArray));

   }

   // Static helper methods
   public static void multAll(int[] values, int amt)
   {
     for (int i = 0; i < values.length; i++)
     {
       values[i] = values[i] * amt;
     }
   }

   public static void printValues(int[] values)
   {
     for (int i = 0; i < values.length; i++)
     {
        System.out.print(values[i] + " ");
     }
     System.out.println();
   }
}

/*
* 2.  Analyze the code above and predict
*+  the output of this code will print when the main method is executed:
* Predicted output:
  4, 12, 14, 24, 10

3.  Test your prediction by copying/pasting the class above into the ArrayRunner.java file of a IntelliJ project) and executing it!
4.  Was your predicted output correct?
If not, what was your mistake?
  Yes

*/
