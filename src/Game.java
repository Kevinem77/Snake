import java.util.ArrayList;


public class Game {

    private Canvas canvas;
    private int xSize,ySize;
    ArrayList<Things> manyThings;
    public Game(int xSize, int ySize){
        this.xSize=xSize;
        this.ySize=ySize;
        manyThings = new ArrayList<Things>();
    }

    public void addThings(){
        manyThings.add(new Snake(xSize/2,ySize/2,true,1,1));
    }


}
