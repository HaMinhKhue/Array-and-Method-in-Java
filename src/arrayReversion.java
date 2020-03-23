import java.util.Scanner;

public class arrayReversion {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j=0;j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.printf("%-20s%s","Reverse array: ", "");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
    }
}
