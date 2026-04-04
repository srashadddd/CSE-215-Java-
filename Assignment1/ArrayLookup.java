import java.util.Scanner;

public class ArrayLookup {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = (int) (Math.random() * 10000);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        try {
            int index = sc.nextInt();
            System.out.println("Value: " + a[index]);
        } catch (Exception e) {
            System.out.println("Index is out of array size");
            sc.nextLine();
        }
    }
}
