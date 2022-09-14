import java.util.Scanner;

public class numbersquarer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num = 1;
        for (int i = 1; i <= b; i++) {
            num = num * a;
        }
        System.out.println("the squared number is:" + num);
    }
}
