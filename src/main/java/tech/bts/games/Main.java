package tech.bts.games;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Game g1 = new Game("Chess", 2, 20);
        Game g2 = new Game("Domino", 2, 10);
        Game g3 = new Game("Parchis", 4, 15);
        Game g4 = new Game("Candy Crush", 1, 0);
        Game g5 = new Game("Bridge", 4, 5);
        Game g6 = new Game("Srcabble", 4, 10);

        List<Game> games = Arrays.asList(g1, g2, g3, g4, g5, g6);

        int columnWidth = 15;

        String header = StringUtil.padRight("| Game", columnWidth)
                + StringUtil.padRight("| Players", columnWidth)
                + StringUtil.padRight("| Price", columnWidth) + "|";

        String separator = StringUtil.repeat("-", columnWidth)
                + StringUtil.repeat("-", columnWidth)
                + StringUtil.repeat("-", columnWidth + 1);

        System.out.println(separator);
        System.out.println(header);
        System.out.println(separator);

        for (Game game : games) {
            System.out.println(StringUtil.padRight("| " + game.getName(), columnWidth)
                    + StringUtil.padRight("| " + Integer.toString(game.getNumPlayers()), columnWidth)
                    + StringUtil.padRight("| " + Double.toString(game.getPrice()), columnWidth) + "|");
        }

        System.out.println(separator);


    }
}
