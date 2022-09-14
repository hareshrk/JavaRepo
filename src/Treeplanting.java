import java.util.Scanner;

public class Treeplanting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter row, col, tree num:");
        int row= scanner.nextInt();
        int col= scanner.nextInt();
        int treenum= scanner.nextInt();
        if((treenum>0 && treenum<col) || (treenum%col==0) || treenum%col==1)
            System.out.println("yes");
        else System.out.println("no");
    }
}
