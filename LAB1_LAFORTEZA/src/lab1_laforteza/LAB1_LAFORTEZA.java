package lab1_laforteza;

import java.util.Random;

public class LAB1_LAFORTEZA {

    
    public static void main(String[] args) {
           int size = 100000; 
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        long startInsert = System.nanoTime();
        arr = insert(arr, 50000, 12345); 
        long endInsert = System.nanoTime();
        double insertTime = (endInsert - startInsert) / 1e6; 

        long startDelete = System.nanoTime();
        arr = delete(arr, 50000);
        long endDelete = System.nanoTime();
        double deleteTime = (endDelete - startDelete) / 1e6;

        long startSearch = System.nanoTime();
        boolean found = search(arr, 12345);
        long endSearch = System.nanoTime();
        double searchTime = (endSearch - startSearch) / 1e6;

        
        System.out.println("=================================");
        System.out.println("\tLABORATORY 1");
        System.out.println("================================="); 
        System.out.println("Execution Time Analysis:");
        System.out.println("-------------------------");
        System.out.println("Operation\tTime (ms)\tBig-O Notation");
        System.out.println("Insert\t\t" + insertTime + "\t\tO(n)");
        System.out.println("Delete\t\t" + deleteTime + "\t\tO(n)");
        System.out.println("Search\t\t" + searchTime + "\t\tO(n)");
    }

    public static int[] insert(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++)
            newArr[i] = arr[i];
        newArr[index] = value;
        for (int i = index; i < arr.length; i++)
            newArr[i + 1] = arr[i];
        return newArr;
    }

    public static int[] delete(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++)
            newArr[i] = arr[i];
        for (int i = index + 1; i < arr.length; i++)
            newArr[i - 1] = arr[i];
        return newArr;
    }

    public static boolean search(int[] arr, int value) {
        for (int num : arr) {
            if (num == value)
                return true;
        }
        return false;
    }
}
