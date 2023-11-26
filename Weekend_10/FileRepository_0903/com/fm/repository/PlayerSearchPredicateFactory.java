package Weekend_10.FileRepository_0903.com.fm.repository;



import Weekend_10.FileRepository_0903.com.fm.unit.Player;
import Weekend_10.FileRepository_0903.com.fm.game.SearchCondition;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayerSearchPredicateFactory {
    public static List<Predicate<Player>> makeConditions(List<SearchCondition> searchConditions) {

        List<Predicate<Player>> P_List = new ArrayList<>();


        for(int i =0;i<searchConditions.size();i++)
        {
            String field1 =  searchConditions.get(i).getField();
            String condition = searchConditions.get(i).getCondition();
            Predicate<Player> pl = null;
            if(field1.equals("name"))
            {
                pl = player ->player.getName().contains(condition);
            }
            else if(field1.equals("nationality"))
            {
                pl = player ->player.getNationality().contains(condition);

            }
            else if(field1.equals("club"))
            {
                pl = player ->player.getClub().contains(condition);
            }
            else if(field1.equals("position"))
            {
                pl = new Predicate<Player>() {
                    @Override
                    public boolean test(Player player) {
                        List<String> str = player.getPositions().stream().filter(str1->str1.equals(condition))
                                .collect(Collectors.toList());
                        return str.size()>0;
                    }
                };
            }
            P_List.add(pl);
        }

        return P_List;
    }



}