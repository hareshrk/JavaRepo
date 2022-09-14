public class stringcompare {
    public static void main(String[] args) {
        String s="hello1";
        String s1="hello1";
        int flag=0;
        for(int i=0;i<s.length() || i<s1.length();i++){
            if(s.charAt(i)!=s1.charAt(i))
                flag++;
        }
        if(flag>0)
            System.out.println("not equal");
        else System.out.println("equal");
    }
}
