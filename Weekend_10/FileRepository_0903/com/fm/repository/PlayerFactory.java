package Weekend_10.FileRepository_0903.com.fm.repository;

import Weekend_10.FileRepository_0903.com.fm.unit.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerFactory {
    public static Player createPlayersWithoutID(String[] fields){
        Player player = new Player(getId(fields), getName(fields), getHeight(fields),
                getNationality(fields), getClub(fields), getOverall(fields), getPosition(fields));
        return player;
    }

    public static Player createPlayers(String[] fields){
        Player player = new Player(getId(fields), getName(fields), getHeight(fields),
                getNationality(fields), getClub(fields), getOverall(fields), getPosition(fields));
        return player;
    }
    private static List<String> getPosition(String[] fields) {
        List<String> positions = new ArrayList<>();
        if (fields[Player.POSITION].startsWith("\"")) {
            for (int i = Player.POSITION; i < fields.length; i++)
                positions.add(fields[i].replace("\"", "").trim());
        } else {
            positions.add(fields[Player.POSITION]);
        }
        return positions;
    }

    private static int getOverall(String[] arr) {
        return Integer.parseInt(arr[Player.OVERALL]);
    }

    private static String getClub(String[] fields) {
        return fields[Player.CLUB];
    }

    private static String getNationality(String[] fields) {
        return fields[Player.NATIONALITY];
    }

    private static int getHeight(String[] fields) {
        return Integer.parseInt(fields[Player.HEIGHT]);
    }

    private static String getName(String[] fields) {
        return fields[Player.NAME];
    }

    private static int getId(String[] fields) {
        return Integer.parseInt(fields[Player.ID]);
    }
}
