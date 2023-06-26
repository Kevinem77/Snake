public class Things {

    public int xPos,yPos,speed,length,id;
    public static int count;
    public boolean isAlive;

    public Things(int xPos, int yPos, boolean isAlive, int speed, int length){
        this.xPos = xPos;
        this.yPos = yPos;
        this.isAlive=isAlive;
        this.speed=speed;
        this.length=length;
        id=count++;
    }

    public Things(int xPos, int yPos, boolean isAlive){
        this.xPos = xPos;
        this.yPos = yPos;
        this.isAlive=isAlive;
        id=count++;
    }

    public String toString() {
        String result = "Thing id=" + id + " | X=" + xPos + " | Y=" + yPos + " | Alive?=" + isAlive + " | Speed=" + speed + " | Length=" + length  ;
        return result;
    }

    public static void main(String[] args) {
        Things snake = new Things(2,3,true,10,10);
        Things apple = new Things(4,4,true);
        System.out.println(snake.toString());
        System.out.println(apple.toString());
    }

}
