import java.util.Arrays;

public class Canvas {
    private String[][] border;

    public Canvas(int rows, int columns){
        border = new String[rows][columns];
        for (int i=0;i<rows;i++){
            for(int j=0; j<columns;j++){
                border[i][j]=" ";           //Whole canvas
                border[i][0]="#";           //left
                border[0][j]="#";           //top
                border[i][columns-1]="#";   //right
                border[rows-1][j]="#";      //bottom
                System.out.print(border[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Canvas canvas = new Canvas(8,20);
    }

}
