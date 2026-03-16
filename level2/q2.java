import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            age[i] = input.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            height[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) youngestIndex = i;
            if (height[i] > height[tallestIndex]) tallestIndex = i;
        }

        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + height[tallestIndex]);
        
        input.close();
    }
}