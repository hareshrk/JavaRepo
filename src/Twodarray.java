public class Twodarray {
    public static void main(String[] args) {
        int[][] a1 = {{1,4,5},{4,6,9},{12,6,7}};
        int[][] a2 = {{2,6,8},{0,6,3},{54,8,2}};
        int[][] a3 = new int[3][3];

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                int sum = a1[i][j] + a2[i][j];
                a3[i][j] = sum;
                System.out.println(a3[i][j]);
            }
        }



        /*for (int i[]: a1){
            for (int j: i){
                //int sum = a1[i][j] + a2[i][j];
                //a3[i][j] = sum;
                System.out.println(j);
            }
        }*/
    }
}
