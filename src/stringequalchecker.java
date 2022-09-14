import java.util.Scanner;

public class stringequalchecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 2 strings: ");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if(s1.equals(s2)) System.out.println("equal ");
        else{
            int a = s1.compareTo(s2);
            System.out.println("not equal "+ a);
        }
        if(s1.equalsIgnoreCase(s2)) System.out.println("equal using ignore case ");
        else System.out.println("not equal using ignore case");
    }
}
