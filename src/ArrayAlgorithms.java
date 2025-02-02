/// Questiion#9 (Array Method Madness)

public class ArrayAlgorithms {
    static int i;
   /** Prints each String in wordList, on its own line, followed by “!”.
    *  Does NOT mutate (modify) wordList.
    *  PRECONDITION: wordList.length > 0
    *
    *  @param wordList  original array of Strings; does not get modified
    */
   public static void printExclamation(String[] wordList)
   { /*
       for (String word : wordList){
           System.out.println(word + "!");
       }
       for (int i = 0; i < wordList.length(); i++){
            System.out.println(wordList[i] + "!");
       }
       */
       i = 0;
       while (i < wordList.length){   //is more generalized than for loops since it can add more conditionals
           System.out.println(wordList[i] + "!");
           i++;
       }
   }

    /** Adds a “!” to the end of each String in wordList (does not print).
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList)
    {
        i = wordList.length - 1;   //a for loop doesn't keep the created i variable. In while lloops, will keep created variable in storage, unless I make it STATIC AND REUSABLE!!! figured out how to turn storage problem into reassignment thingy!
        while (i > 0){
            wordList[i] += "!";
            i--;
        }
    }

    /** Returns the sum of all values in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find sum
     *  @return  the sum of all numbers in the list
     */
    public static int sum(int[] numList)
    {
        int sum = 0;
        /*for (int num : numList){
            sum += num;
        }
        i = 0;  //i = numList.length - 1;
        while (i < numList.length){ //(i>=0)
            sum += numList[i];
            i++;   //i--;
        }
        */
        for (int i = 0; i < numList.length; i++){
            sum += numList[i];
        }
        return sum;

    }

    /** Returns the average of all values in numList, as a double.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find average
     *  @return  the average of all numbers in the list
     *
     *  Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList)
    {
        return (double) sum(numList) / numList.length;
    }

    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList)
    {
        int min = numList[0];
        /*
        for (int num : numList){
            if (num < min){
                min = num;
            }
        }
        */
        i = numList.length - 1;
        while (i != 0){           //could do this instead of >= in for.. or actually, how can I let it break if it reaches min early? I don't think it is possible, since it would still need to check everything
            if (min > numList[i]){
                min = numList[i];
            }
            i--;//I think for a while loop, there's the possibility of using it to break conditionals early
        }
        return min;
    }

    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList)
    {
        int max = numList[0];
        /*
        for (int num : numList){
            if (num > max){
                max = num;
            }
        }*/
        for (int i = 0; i != numList.length - 1; i++){   //hold up, for loop still works with != ?!
            if (max > numList[i]){
                max = numList[i];       //for loop is concise. It doesn't keep the created i variable
            }
        }
        return max; }

    /** Multiplies each number in numList by multiplier.
     *  DOES mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers, modified by method
     *  @param multiplier  number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier)
    {
        for (int i = 0; i < numList.length; i++){
            numList[i] = numList[i] * multiplier;
        }
    }

    /** Returns a NEW array containing the squares of the elements in the original
     *  numList array, in the same position.
     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers to be squared
     *  @return  new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList)
    {/* discovery notes: tried to use while loop as if it were a for each loop,
        aka without the incremental variable to see whether or not if loop would
        terminate by itself.
        - Then I forgot that I was testing that, and when I used the test code,
        I was very confused when the program refused to print anything, and did
        not terminate.
        - Situation did not change when altering math operation, moving element
        access statement to be stored in a variable, nor using Math.pow
        (returned a double, needed to be converted to int.)
        - So I converted to a for loop at the same time while trying out the
        Arrays.toString method (forgetting to import first). I then used a print
        statement within the loop so it would print the current element accessed.

        discovery 2: (detour)
        When googling if a while or a for loop affected program efficiency, a
        stray Stackoverflow.com comment said
        "Actually the for-loop is a little better because the ~i~ will be out of
        scope after the loop while the ~i~ will stick around in the ~while~ loop
        case"
        I interpreted this as the system would eliminate the i object in storage
        space, and keep it forever in the other loop. Save vs take up space

        https://stackoverflow.com/questions/1165457/java-for-loop-vs-while-loop-performance-difference

        discovery 1: (conclusion)
        Page also had a comment reminding me of termination requirements.
        *I forgot the increment variable in the while loop --> remembered forgotten experiment

        Conclusion, while loops do not terminate by themselves in this case.
        I swear in python it was easier to use/distinguish uses for the loop
        syntaxes. -2/1/2025 15:45
        * */
        int[] squares = new int[numList.length];
        for (int i = 0; i < numList.length;i++){
            //experiment to use math operator without math class.
            squares[i] = numList[i] * numList[i]; //(int)Math.pow(numList[i], 2);
            //System.out.print("_" + squares[i]);
        }
        return squares;
    }
//hint: creating a new empty array with the same length as numList is a good first step!

    /** Switches each boolean value in boolList to its opposite value; true values
     *  becomes false, and false values become true.
     *  DOES mutate (modify) original boolList.
     *  PRECONDITION: boolList.length > 0
     *
     *  //@param numList  original array of booleans, modified by method      ///@param numList flagged, maybe a typo? Or do I actually convert it? Test case says separate, so most likely a typo
     */
    public static void flipBool(boolean[] boolList)
    {
        for (int i =0; i< boolList.length; i++){
            if (boolList[i]){
                boolList[i] = false;
            }
            else{
                boolList[i] = true;
            }
        }
    }

    /** Returns a String representing the array of ints as a printable String,
     *  including open and closing brackets, with values separated by commas.
     *  This method should function identically to Arrays.toString()!

     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints to be represented in String form
     */
    public static String customToString(int[] numList)
    {
        /*need to figure out a way to add/separate a new line like the println function
        because if there is a print statement used above the println call
        of this method, will put on same line.
        But if I add a \n, will add unnecessary line in the output in a println*/
        // never mind, that's normal
        String string = "[";
        for (int num : numList){  //(int i = 0; i < numList.length; i++)
            string += num;
            if (!(num == numList[numList.length - 1])){  //(!(i == numList.length - 1))
                string += ", ";
            }
        }
        return string + "]";
    }
}
