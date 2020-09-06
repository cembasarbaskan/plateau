package entity;

public class Position {
    private int x;
    private int y;
    private char facing;

    public Position(int x, int y, char facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getFacing() {
        return facing;
    }

    public void setFacing(char facing) {
        this.facing = facing;
    }
}
