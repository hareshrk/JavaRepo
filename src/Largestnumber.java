public class Largestnumber {
    public static void main(String[] args) {
        int a = 21, b = 3, c = 42;
        if (a > b) {
            if (a > c)
                System.out.println(a + " is the greatest number");
        }
        else if (b > a) {
            if (b > c)
                System.out.println(b + " is the greatest number");
        }
        else
            System.out.println(c + " is the greatest number");

    }
}
