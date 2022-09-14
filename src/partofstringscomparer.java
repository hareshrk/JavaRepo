import java.util.Scanner;

public class partofstringscomparer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any 2 strings");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("enter the range for first string");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("enter the range for second string");
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        String subs1 = s1.substring(n1,n2);
        String subs2 = s1.substring(n3,n4);
        if(subs1.equalsIgnoreCase(subs2)) System.out.println("the substrings "+subs1+" is the same");
        else System.out.println("the substrings "+subs1+" and "+subs1+" are not the same");
    }
}
