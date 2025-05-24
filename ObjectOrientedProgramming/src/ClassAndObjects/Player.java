package ClassAndObjects;

public class Player {

    int playerId;
    String playerName;

    public void setPlayerData(int id,String name){
        playerId=id;
        playerName=name;
    }

    public void getPlayer(){
        System.out.println("Player ID: "+playerId);
        System.out.println("Player Name: "+playerName);
    }

}
