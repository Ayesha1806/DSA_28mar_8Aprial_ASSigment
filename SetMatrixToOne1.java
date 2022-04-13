package DSAAssg1;

public class SetMatrixToOne1 {
    public static void main(String[] args) {
        //int[][] a = {{0, 0, 0}, {0, 0, 1}};
        int[][] a={{1,0},{0,0}};
        //int [][] a={{1,0,0,1},{0,0,1,0},{0,0,0,0}};
        int colSize = a[0].length;
        int row=-1;
        int col=-1;
        boolean found=false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<colSize;j++){
                if(a[i][j]==1){
                    found=true;
                    row=i;
                    col=j;
                }
            }
        }
        if(found==true){
            for(int j=0;j<colSize;j++){
                a[row][j]=1;
            }
            for(int i=0;i<a.length;i++){
                a[i][col]=1;
            }
        }
        for(int i=0;i<a.length;i++){
           // int cloSize;
            for(int j = 0; j<colSize; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}

