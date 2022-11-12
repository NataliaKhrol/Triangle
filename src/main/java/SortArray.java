import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt(9);
            int[] newArray = new int[size];
            System.out.println("Enter the elements of the array");

            for(int i = 0; i<size; i++) {
                newArray[i] = sc.nextInt(9);
            }
            for(int i = 0; i<size-1; i++) {
                for (int j = i+1; j<newArray.length; j++) {
                    if(newArray[i] > newArray[j]) {
                        int temp = newArray[i];
                        newArray[i] = newArray[j];
                        newArray[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
    }

