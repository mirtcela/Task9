import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.print("Введите размерность массива: \n");
        int length = input.nextInt();
        int array[] = new int[length];
        System.out.print("Введите элемент массива: \n");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Полученный массив: \n");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]*2 +" ");
        }
    }
}
