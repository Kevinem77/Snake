public class Snake {

    boolean snakeAlive;
    int snakeSpeed;
    int snakeSize;

    /**
     * Snake constructor
     * @param snakeAlive
     * @param snakeSpeed
     * @param snakeSize
     */
    public Snake(boolean snakeAlive, int snakeSpeed, int snakeSize){
        this.snakeAlive=snakeAlive;
        this.snakeSpeed=snakeSpeed;
        this.snakeSize=snakeSize;
    }

    public String toString() {
        String result = "Snake || Speed = " + snakeSpeed + " | Size = " + snakeSize;
        return result;
    }
    public static void main(String[] args) {
        Snake playerSnake = new Snake(true, 10, 20);
        System.out.println(playerSnake.toString());
    }
}
