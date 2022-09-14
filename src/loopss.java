public class loopss {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0)
            System.out.println(i);
        }
        int numbers[] ={1,2,3,4,5,6,7,8,9,10};
        for(int n : numbers){
            if(n%2==0)
                System.out.println(n);
        }
        int[] arr= new int[5];
        System.out.println(arr[2]);
    }
}
