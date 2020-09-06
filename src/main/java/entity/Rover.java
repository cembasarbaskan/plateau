package entity;

import static tool.Constant.*;

public class Rover {
    private final int edgeX;
    private final int edgeY;
    private final char[] moves;
    private Position position;

    public Rover(int edgeX, int edgeY, Position position, char[] moves) {
        this.edgeX = edgeX;
        this.edgeY = edgeY;
        this.position = position;
        this.moves = moves;
    }

    public Position findPosition() {
        for (char move : moves) {
            switch (move) {
                case LEFT:
                    if (position.getFacing() == NORTH) {
                        position.setFacing(WEST);
                    } else if (position.getFacing() == WEST) {
                        position.setFacing(SOUTH);
                    } else if (position.getFacing() == SOUTH) {
                        position.setFacing(EAST);
                    } else if (position.getFacing() == EAST) {
                        position.setFacing(NORTH);
                    }
                    break;
                case RIGHT:
                    if (position.getFacing() == NORTH) {
                        position.setFacing(EAST);
                    } else if (position.getFacing() == EAST) {
                        position.setFacing(SOUTH);
                    } else if (position.getFacing() == SOUTH) {
                        position.setFacing(WEST);
                    } else if (position.getFacing() == WEST) {
                        position.setFacing(NORTH);
                    }
                    break;
                case MOVE:
                    position = motion(position.getX(), position.getY(), position.getFacing());
                    break;
            }
        }

        return position;
    }

    private Position motion(int x, int y, char facing) {
        if (facing == NORTH && y < edgeY) {
            y++;
        } else if (facing == SOUTH && y > 0) {
            y--;
        } else if (facing == EAST && x < edgeX) {
            x++;
        } else if (facing == WEST && x > 0) {
            x--;
        }

        return new Position(x, y, facing);
    }
}
