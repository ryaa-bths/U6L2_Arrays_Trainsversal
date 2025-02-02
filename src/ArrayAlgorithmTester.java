import java.util.Arrays;

public class ArrayAlgorithmTester {

    public static void main(String[] args)
    {

    System.out.println("___.-.___\t\tprintExclamation");                              //printExclamation
    String[] words = {"hello", "hola", "hi", "what's up?"};
    ArrayAlgorithms.printExclamation(words);

    System.out.println("----");

    // original word list NOT modified
    System.out.println(Arrays.toString(words));

    System.out.println("\n___.-.___\t\taddExclamation");             /// (///////)   //addExclamation
    ArrayAlgorithms.addExclamation(words);

    // original word list IS modified
    System.out.println(Arrays.toString(words));

    System.out.println("\n___.-.___\t\tsum");             /// (///////)   //sum
    int[] nums = {6, 4, 0, 3, 9, -2, 5};
    int sum = ArrayAlgorithms.sum(nums);
    System.out.println(sum);

    System.out.println("----");

    // original numbers list NOT modified
    System.out.println(Arrays.toString(nums));

    System.out.println("\n___.-.___\t\taverage");             ///  (///////)   //average
    int[] gums = {6, 4, 0, 3, 9};
    double avg = ArrayAlgorithms.average(gums);
    System.out.println(avg);
    int[] nums2 = {4, 6, 7};
    double avg2 = ArrayAlgorithms.average(nums2);
    System.out.println(avg2);

    System.out.println("----");

    // original numbers lists NOT modified
    System.out.println(Arrays.toString(gums));
    System.out.println(Arrays.toString(nums2));

    System.out.println("\n___.-.___\t\tminimum");              ///  (///////)   //minimum
    int[] bums = {6, 4, 3, 9, 2, 5};
    int min = ArrayAlgorithms.minimum(bums);
    System.out.println(min);
    int[] bums2 = {-4, 5, -7, 3};
    int min2 = ArrayAlgorithms.minimum(bums2);
    System.out.println(min2);

    System.out.println("----");

    // original numbers lists NOT modified
    System.out.println(Arrays.toString(bums));
    System.out.println(Arrays.toString(bums2));
/*
    System.out.println("\n___.-.___\t\tmaximum");              ///  (///////)   //maximum
    int[] nums = {6, 4, 3, 9, 2, 5};
    int max = ArrayAlgorithms.maximum(nums);
    System.out.println(max);
    int[] nums2 = {-8, -3, -7, -10};
    int max2 = ArrayAlgorithms.maximum(nums2);
    System.out.println(max2);

    System.out.println("----");

    // original numbers lists NOT modified
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums2));

    System.out.println("\n___.-.___\t\tmultiplyBy");              ///  (///////)   //multiplyBy
    int[] nums = {5, 10, 15, 12, 2, 6};
    ArrayAlgorithms.multiplyBy(nums, 6);

    // original numbers list IS modified
    System.out.println(Arrays.toString(nums));

    System.out.println("\n___.-.___\t\tsquares");              ///  (///////)   //squares
int[] nums = {5, -10, 8, 12, 2, -6, 0};
    System.out.println(Arrays.toString(nums));
    int[] squares = ArrayAlgorithms.squares(nums);
    System.out.println(Arrays.toString(squares));

    System.out.println("----");
    // original numbers list NOT modified
    System.out.println(Arrays.toString(nums));


        System.out.println("\n___.-.___\t\tflipBool");              ///  (///////)   //flipBool
        boolean[] bools = {false, true, true, false, true};
        ArrayAlgorithms.flipBool(bools);

        // original boolean list IS modified
        System.out.println(Arrays.toString(bools));


        System.out.println("\n___.-.___\t\tcustomToString");              ///  (///////)   //customToString

        int[] nums = {5, -10, 8, 12, 2, -6, 0};
        System.out.println(ArrayAlgorithms.customToString(nums));
        int[] nums2 = {15};
        System.out.println(ArrayAlgorithms.customToString(nums2));

        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));

 */
    }
}
