package string;


import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String a1 = "race";
        String a2 = "care";

        // Step 1: Convert to char array
        char[] arr1 = a1.toCharArray();
        char[] arr2 = a2.toCharArray();

        // Step 2: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 3: Compare
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes, it is an anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}

