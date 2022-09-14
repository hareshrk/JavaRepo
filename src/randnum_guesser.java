import java.util.Random;
import java.util.Scanner;

public class randnum_guesser {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner scanner=new Scanner(System.in);
        int a = rand.nextInt(10);
        int flag=0;
        do{
            System.out.print("enter a number within 10:");
            int i = scanner.nextInt();
            if(i==a){
                flag++;
                System.out.println("nice");
            }
            if(i<a) System.out.println("too low");
            else if(i>a) System.out.println("too high");
        }while (flag<1);
    }
}
