import java.util.*;

public class TopKFrequency {
    /*
     * Given array [1,1,1,2,2,3], k=2, output [1,2]
     *
     */

    /**
     * To solve this problem, we need to find the k most frequent elements in the given array.
     * <p>
     * One approach to solve this is as follows:
     * <p>
     * Create a frequency map of the elements in the input array:
     * -> where the keys of the map represent the elements of the array
     * -> and the values represent their frequencies:
     * {1=3, 2=1, 3=1} here 1 occurs three times, 2 occurs once, 3 occurs once in the array, which is captured in the freqMap
     * Sort the elements based on their frequency.
     * Return the first k elements from the sorted list.
     *
     * @param args
     */

// We create a static method called topKFrequent with Return Type: List<Integer>, that will accept 2 args: int[] nums, int k;
    public static List<Integer> topKFrequency(int[] nums, int k) {
        // 1. We will use HashMap to create frequency map of each element in the input array:
        Map<Integer, Integer> freqMap = new HashMap<>();

        // 2. We will iterate through each element in the nums array
        for (int num : nums) {

            // to check the frequency of each num, we add 'num' into a map and with the help of getOrDefault() method we check whether it already exists in the freqMap:
            // if the element is not in the map yet, set frequency to 1, if it is - increment its frequency
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1); // 1=1+1+1, 2=1+1, 3=1
            /**
             * How this method works:
             * It returns the corresponding value to which the specified key is mapped, or a default value if the key is not present in the map.
             * Ex:   Map<String, Integer> map = new HashMap<>();
             *         map.put("apple", 1);
             *         map.put("banana", 2);
             *
             *         int value1 = map.getOrDefault("apple", 0);  this will Get the value for an existing key
             *         System.out.println(value1); // Output: 1
             *
             *         int value2 = map.getOrDefault("orange", 0); this will Get the value for a Non-existing key
             *         System.out.println(value2); // Output: 0
             */
        }


        // 3. We will convert the key set with the keySet() method from freqMap into a List.
        List<Integer> sortedNums = new ArrayList<>(freqMap.keySet());
        /**
         * How it works:
         * We will create ArrayList object called sortedNums that is initialized with the help of keySet()
         * this keySet() comes from Map interface, is used to get the set of all keys (unique elements) in the freqMap
         * We then pass this set to the constructor of an ArrayList, which creates a new ArrayList containing all unique elements in the freqMap
         * By passing the freqMap.keySet() to the ArrayList constructor, we initialize the list of unique elements to have the SAME SIZE as the freqMap
         * This is more efficient than creating an empty list and adding elements to it one by one, as it avoids the need for RESIZING the list as we add more elements to it
         *
         */

        // 4. Once we have this list of unique elements, we can sort it based on their frequency using Collections.sort()
        // that will help to get the top K frequent element in the array
        Collections.sort(sortedNums, (a, b) -> freqMap.get(b) - freqMap.get(a));
        /**
         * How it works with Lambda expression:
         * The Collection.sort() method has an overloaded version that takes arguments as list and Comparator,
         * However, instead of passing a Comparator object, we cna pass a Lambda expression that compares the frequency of two elements
         * Here we pass a lambda expression (a, b) -> freqMap.get(b) - freqMap.get(a) as the Second Argument to the Collection.sort()
         * This lambda expression compares the frequency of two elements a and b, by looking up their frequencies in the freqMap
         * and subtracting the frequency of 'a' from the frequency of 'b'
         * The Collections.sort() method uses this lambda expression to sort the list of unique elements sortedNums in descending order of frequency.
         */

        // 5. Once we have the list of unique elements sorted by their frequency, we want to return the top K frequent elements
        // To do this, we use the subList() method, which returns a view of the original list, containing only the elements between the specified start index (inclusive) and end index (exclusive).

        return sortedNums.subList(0, k);
        /**
         * How it works:
         * In the code sortedNums.subList(0, k), we specify the start index as 0 and the end index as k.
         * This means that we want to return a sublist of the first k elements of the sorted list.
         * The 0 in the first argument specifies that we want to start the sublist from the first element of the list (i.e., the element at index 0).
         * The k in the second argument specifies that we want to end the sublist after the 'k'th element of the list (i.e., the element at index k-1).
         * For example,
         * -> if k = 2 and the sorted list is [1, 2, 3, 4, 5], then sortedNums.subList(0, k) will return a new list
         *  containing the first k elements of the sorted list, which are [1, 2]
         * -> If k = 3 and the sorted list is [1, 1, 2, 2, 3], then sortedNums.subList(0, k) will return a new list
         *  containing the first k elements of the sorted list, which are [1, 1, 2].
         *
         *--------------------------------------------------------------------------------------------------------------
         *
         * this subList() comes from List interface and accepts two args: from certain index - to certain index
         * it will create new sublist that contains the elements in a specified range from the original list
         *  Example:
         *  List<Integer> list = new ArrayList<>();
         *         list.add(1);
         *         list.add(2);
         *         list.add(3);
         *         list.add(4);
         *         list.add(5);
         *
         *         List<Integer> subList = list.subList(1, 4);
         *
         *         System.out.println(subList); // Output: [2, 3, 4]
         *
         */

}
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = topKFrequency(nums, k);
        System.out.println(result); // Output: [1, 2]

        /**
         * THIS IS THE CLEAN CODE WITHOUT NOTES
         * 
         * public static List<Integer> topKFrequent(int[] nums, int k) {
         *         Map<Integer, Integer> freqMap = new HashMap<>();
         *         for (int num : nums) {
         *             freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
         *         }
         *
         *         List<Integer> sortedNums = new ArrayList<>(freqMap.keySet());
         *         Collections.sort(sortedNums, (a, b) -> freqMap.get(b) - freqMap.get(a));
         *
         *         return sortedNums.subList(0, k);
         *     }
         */

    }
}