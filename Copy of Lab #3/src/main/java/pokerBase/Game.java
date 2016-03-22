package pokerBase;

import java.util.UUID;
import java.util.ArrayList;

public class Game {

	UUID GameID;
	UUID TableID;
	ArrayList<Player> GamePlayers = new ArrayList<Player>();
	/**
	 * @param gameID
	 * @param tableID
	 * @param gamePlayers
	 */
	public Game(UUID GameID, Table Table, ArrayList<Player> gamePlayers) { 
		super();
		GameID = UUID.randomUUID();
		TableID = Table.getTable();
		GamePlayers = gamePlayers;
	}
	/**
	 * @return the gameID
	 */
	public UUID getGameID() {
		return GameID;
	}
	/**
	 * @param gameID the gameID to set
	 */
	public void setGameID(UUID gameID) {
		GameID = gameID;
	}
	/**
	 * @return the tableID
	 */
	public UUID getTableID() {
		return TableID;
	}
	/**
	 * @param tableID the tableID to set
	 */
	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	/**
	 * @return the gamePlayers
	 */
	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}
	/**
	 * @param gamePlayers the gamePlayers to set
	 */
	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	public void AddPlayerToGame(Table Table, Player Player){
		// Note Table Size can be changed later, this is just temporal.
		int TableMax = 8;
		if (Table.getTablePlayers().size() < TableMax){
			GamePlayers.add(Player);
		}
		else {
			try{
				if (Table.getTablePlayers().size() >= TableMax){
					throw new Exception();
				}
			}
			catch(Exception e){
				System.out.println("There are too many players at this Table");
			}
			finally{
				
			}
		}
	}
}
