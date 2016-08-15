import java.util.ArrayList;
import java.util.Random;

public class GameSelector {

	static ArrayList<Map> maps = new ArrayList<Map>();

    public static void main(String []args) {
        
        // Populate maps.
        makeMaps();
        
        // Make the RNG.
        Random rand = new Random();
        
        // Get the first map and gametype.
        Map first = getRandomMap(rand);
        String firstGame = first.getRandomGametype();
        System.out.println("The first game is " + firstGame + " on " + first);
        
        // Get the second map and gametype.
        Map second = getRandomMap(rand);
        String secondGame = second.getRandomGametype();
        System.out.println("The second game is " + secondGame + " on " + second);
        
        // Get the third map and gametype.
        Map third = getRandomMap(rand);
        String thirdGame = third.getRandomGametype();
        System.out.println("The third game is " + thirdGame + " on " + third);
        
        
    }
    
    
    /*
    * Gametype rules:
    * All games shall be played with AR/BR spawns and standard Red vs Blue teams.
    * Slayer: Standard Team Slayer.
    * Oddball: Team Oddball - Up points to 200.
    * Lowball: Lowball - Up points to 50.
    * Crazy King: Choose Team King, change hill movement to on and random. Make the points 250.
    * Multi Flag: Standard Multi Flag.
    * One Flag: Standard One Flag.
    * Assault: Standard Assault.
    * Neutral Assault: Standard Neutral Bomb.
    * One Bomb: Standard One Bomb.
    * Territories: Standard Territories.
    * Land Grab: Standard Land Grab (a territories sup-option).
    * VIP: Standard VIP.
    */
    public static void makeMaps() {
        maps.add(new Map("Assembly", new  String[] {"Slayer", "Oddball", "Crazy King", "Multi CTF", "Neutral Assault", "VIP"}));
        maps.add(new Map("Blackout", new String[] {"Slayer", "Oddball", "Lowball", "Crazy King"}));
        maps.add(new Map("Citadel", new String[] {"Slayer", "Multi Flag", "Oddball", "Lowball"}));
        maps.add(new Map("Cold Storage", new String[] {"Slayer", "Crazy King", "VIP"}));
        maps.add(new Map("Construct", new String[] {"Slayer", "Crazy King"}));
        maps.add(new Map("Epitaph", new String[] {"Slayer", "Crazy King", "VIP"}));
        maps.add(new Map("Foundry (Default)", new String[] {"Slayer"}));
        maps.add(new Map("Ghost Town", new String[] {"Slayer", "Oddball", "Crazy King", "One Flag", "One Bomb", "VIP"}));
        maps.add(new Map("Guardian", new String[] {"Slayer", "Oddball", "Lowball", "Crazy King", "VIP"}));
        maps.add(new Map("High Ground", new String[] {"Slayer", "One Flag", "One Bomb"}));
        maps.add(new Map("Isolation", new String[] {"Slayer", "Crazy King"}));
        maps.add(new Map("Last Resort", new String[] {"Slayer", "One Flag", "One Bomb"}));
        maps.add(new Map("Narrows", new String[] {"Slayer", "Multi Flag", "VIP"}));
        maps.add(new Map("Orbital", new String[] {"Slayer", "One Flag", "One Bomb", "VIP"}));
        maps.add(new Map("Rat's Nest", new String[] {"Slayer", "Multi Flag", "Neutral Assault", "Assault", "One Flag", "One Bomb"}));
        maps.add(new Map("Sandbox (Default)", new String[] {"Slayer", "Multi Flag", "Neutral Assault", "Assault"}));
        maps.add(new Map("Snowbound", new String[] {"Slayer", "Multi Flag", "Crazy King"}));
        maps.add(new Map("Standoff", new String[] {"Slayer", "Multi Flag", "Assault", "Territories", "Land Grab"}));
        maps.add(new Map("The Pit", new String[] {"Slayer", "Multi Flag", "Crazy King", "Oddball", "Lowball", "VIP"}));
        maps.add(new Map("Valhalla", new String[] {"Slayer", "Multi Flag", "One Flag", "Assault", "Neutral Assault", "One Bomb", "Territories"}));
    }
    
    public static Map getRandomMap(Random rand) {
        int mapIndex = rand.nextInt(maps.size());
        return maps.remove(mapIndex);
    }
    
}