package Weekend_10.KA_Sports_football_Game_0902.com.fm.repository;

import Weekend_10.KA_Sports_football_Game_0902.com.fm.unit.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayerQuery {
    public static List<Player> query(List<Player> players, List<Predicate<Player>> conditions){

        List<Player> pl = players;
        for(int i =0;i<conditions.size();i++)
        {
            pl = pl.stream().filter(conditions.get(i)).collect(Collectors.toList());
        }


        return pl;
    }
}
