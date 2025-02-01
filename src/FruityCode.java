/// Part 8 (Fix the Buggy Code)
public class FruityCode
{
    public static void main(String[] args)
    {
        String[] fruit = {"apple", "banana", "pineapple", "grapes"};
        for (int i = 0; i < fruit.length; i++)  /// i=1 → 0, will now include first element
        {
            System.out.println(fruit[i]);
        }

        int[] fruitCounts = {5, 6, 2, 25};
        for (int i = 0; i <= fruitCounts.length - 1; i++) /// i<fruitCounts → <=, will now include & access last element
        {
            System.out.println(fruitCounts[i]);
        }

        double[] fruitPrices = {0.55, 0.25, 2.99, 0.99};
        for (int i = 0; i < fruitPrices.length; i++) /// i<=fruitCounts → <, will now not be not out of bounds
        {
            System.out.println(fruitPrices[i]);
        }

        boolean[] fruitInStock = {true, false, false, true};
        int counter = 0;
        while (counter <= fruitInStock.length - 1)
        {
            ///Statement lines order of placement for runtime swapped to now  traverse without excluding first element
            System.out.println(fruitInStock[counter]);
            counter++;
        }
    }
}
