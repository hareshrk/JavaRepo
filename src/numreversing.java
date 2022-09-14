import java.util.Scanner;

public class numreversing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        String num = scanner.nextLine();
        String num2 ="";
        for(int i=(num.length()-1);i>=0;i--){
            num2 = num2.concat(String.valueOf(num.charAt(i)));
        }
        System.out.println(num2);
    }
}
