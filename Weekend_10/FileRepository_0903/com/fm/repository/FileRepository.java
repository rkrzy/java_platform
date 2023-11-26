package Weekend_10.FileRepository_0903.com.fm.repository;

import Weekend_10.FileRepository_0903.com.fm.unit.Player;

import java.io.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FileRepository implements IRepository {
    public static final String[] FILE_HEADER =
            { "sofifa_id", "short_name", "height_cm", "nationality", "club", "overall", "player_positions", "\n" };
    private static FileRepository instance = new FileRepository();
    public final String FILENAME =
            Thread.currentThread().getContextClassLoader().getResource("players_20_short.csv").getFile();
    private boolean loaded = false;
    private List<Player> players;

    private FileRepository(){
        load();
    }

    public static FileRepository getInstance() {return instance;}

    private Player create(String[] fields) {
        return PlayerFactory.createPlayers(fields);
    }
    //your code here
    private void load()
    {
        File file = new File(FILENAME);
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while((line = br.readLine())!=null)
            {
                Player p =create(line.split(","));
                players.add(p);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public int count() {
        return players.size();
    }

    @Override
    public void save(Player t) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true)))
        {
            bw.write(t.getId(),t.getName(),t.getHeight(),t.getNationality(),t.getClub()
            ,t.getOverall(),t.getPositions());
        }
        catch (Exception e)
        {

        }
    }

    @Override
    public void delete(Player t) {
        players.remove(t);
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public boolean existsById(int id) {
        return players.stream().filter(player -> player.getId()==id).collect(Collectors.toList())
                .size()>0;
    }

    @Override
    public Iterable<Player> findAll() {
        Iterable<Player> iterable = players;
        return iterable;
    }

    @Override
    public Optional<Player> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Player> findByConditions(List<Predicate<Player>> conditions) {
        return null;
    }
}
