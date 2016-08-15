import java.util.Random;

public class Map {
    
    private String name;
    private String[] games;
    
    public Map(String mapName, String[] gametypes) {
        name = mapName;
        games = gametypes;
    }
    
    public String toString() {
        return name;
    }
    
    public String getRandomGametype() {
        Random rand = new Random();
        int gametypeIndex = rand.nextInt(games.length);
        return games[gametypeIndex];
    }
    
}