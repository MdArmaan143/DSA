package array;

import java.util.Scanner;

public class linearSearch {
    public static int lSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 30, 12, 4, 17 };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your key value : ");
        int key = sc.nextInt();
        int index = lSearch(arr, key);

        if (index == -1) {
            System.out.println("element is not present : ");
        } else {
            System.out.print("element is found at index : " + index);
        }
    }

}
