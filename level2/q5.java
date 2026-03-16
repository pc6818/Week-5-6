import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int temp = number;
        int count = 0;
        
        // Find count of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        
        // Save digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reverseArray = new int[count];
        
        // Store in reverse array
        for (int i = 0; i < count; i++) {
            reverseArray[i] = digits[count - 1 - i];
        }

        System.out.print("Array in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();
        input.close();
    }
}