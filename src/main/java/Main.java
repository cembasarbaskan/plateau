import entity.Position;
import entity.Rover;
import tool.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Position> result = new ArrayList<>();
        final Scanner scan = new Scanner(System.in);

        final int edgeX = scan.nextInt();
        final int edgeY = scan.nextInt();

        for (int x = 0; x < 2; x++) {
            final Rover rover = new UserInput.Builder()
                    .edgeX(edgeX)
                    .edgeY(edgeY)
                    .positionX(scan.nextInt())
                    .positionY(scan.nextInt())
                    .facing(scan.next().charAt(0))
                    .moves(scan.next().toCharArray())
                    .build();
            result.add(rover.findPosition());
        }

        result.forEach(position -> System.out.println(position.getX() + " " + position.getY() + " " + position.getFacing()));
    }

}
