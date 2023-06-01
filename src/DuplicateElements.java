import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    /*
Duplicate elements

Create a method that will take an array of nums and return all the elements that are duplicates values. The result should only include one occurence of the duplicates:
        Input: {1, 3, 5, 1, 9, 5, 6, 4}
        Output: {1, 5, 9}
 */
    public static int[] findDups(int ... arr){
        // 1. make new arr that will hold duplicates and define original size
        int[] duplicates = new int[arr.length];
        //2. make index for storing elements in new array
        int index = 0;
        //3. make ArrayList as a placeholder to hold duplicate elements that already been checked
        ArrayList<Integer> checked = new ArrayList<>();

        // 4. make a loop that will iterate through original array
        for (int each: arr){

            // 5. set the condition to skip the rest of the code
            if (checked.contains(each)){
                continue;
            }

            // 6. make counter to count duplicates:
            int count = 0;

            // 7. make another (inner) loop to compare each element with each other: {1 with 3, 1 with 5, 1 with 1, 1 with 9...
            for (int eachOther: arr){
                // 8. set the condition to compare and to find matching elements:
                if (each == eachOther){
                    // 9. count those matched elements:
                    count++;
                }
            }
            // By this point we will learn how many matching elements found therefore:
            // 10. set the condition to see if there are any elements that are found/counted more than 1:
            if (count > 1){
                // 11. store them in the new array duplicates and to store them in new arr we have to give/define index of new arr at global level on line 15
                duplicates[index++] = each; // every time we assign 'each' to 'duplicates' we increment index by 1, that's why [index++]
                // 12. add each duplicate elements to 'checked' ArrayList:
                checked.add(each);
            }
        }
        // If I find there are 3 duplicates, that's how big is my 'checked' ArrayList
        // 13.make a copy of 'duplicates' array and make a size of 3,that will return the first 3 elements of the array that we get back as a return
        return Arrays.copyOf(duplicates, checked.size());
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDups(1, 3, 5, 1, 9, 5, 9, 6, 4)));
    }
}
