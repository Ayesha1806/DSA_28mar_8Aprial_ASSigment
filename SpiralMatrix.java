package DSAAssg1;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int rowSize=a.length;
        int colSize=a[0].length;
        int top=0;
        int right=colSize-1;
        int bottom=rowSize-1;
        int left=0;
        int dir=1;
        while (top<=bottom && left<=right){
            //top
            if(dir==1){
                for(int i=left;i<=right;i++){
                    System.out.print(a[top][i]+" ");
                }
                top++;
                dir=2;
            }
            //right
            else if(dir==2){
                for(int i=top;i<=bottom;i++){
                    System.out.print(a[i][right]+" ");

                }
                right--;
                dir=3;
            }
            //bottom
            else if(dir==3){
                for(int i=right;i>=left;i--){
                    System.out.print(a[bottom][i]+" ");
                }
                bottom--;
                dir=4;
            }
            else if(dir==4){
                for(int i=bottom;i>=top;i--){
                    System.out.print(a[i][left]+" ");
                }
                left++;
                dir=1;
            }
        }
    }
}
