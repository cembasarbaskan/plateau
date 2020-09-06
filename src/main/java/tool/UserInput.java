package tool;

import entity.Position;
import entity.Rover;

public class UserInput extends Rover {
    private final int x;
    private final int y;
    private final int edgeX;
    private final int edgeY;
    private final char facing;
    private final char[] moves;

    private UserInput(Builder builder) {
        super(builder.edgeX, builder.edgeY, new Position(builder.x, builder.y, builder.facing), builder.moves);
        this.x = builder.x;
        this.y = builder.y;
        this.edgeX = builder.edgeX;
        this.edgeY = builder.edgeY;
        this.moves = builder.moves;
        this.facing = builder.facing;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getEdgeX() {
        return edgeX;
    }

    public int getEdgeY() {
        return edgeY;
    }

    public char getFacing() {
        return facing;
    }

    public char[] getMoves() {
        return moves;
    }

    public static class Builder {
        private int x;
        private int y;
        private int edgeX;
        private int edgeY;
        private char facing;
        private char[] moves;

        public Builder positionX(int x) {
            this.x = x;
            return this;
        }

        public Builder positionY(int y) {
            this.y = y;
            return this;
        }

        public Builder edgeX(int edgeX) {
            this.edgeX = edgeX;
            return this;
        }

        public Builder edgeY(int edgeY) {
            this.edgeY = edgeY;
            return this;
        }

        public Builder facing(char facing) {
            this.facing = facing;
            return this;
        }

        public Builder moves(char[] moves) {
            this.moves = moves;
            return this;
        }

        public UserInput build() {
            return new UserInput(this);
        }
    }
}
