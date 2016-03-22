package pokerBase;

import java.util.UUID;

public class Player {
	private UUID Player;
	String PlayerName;
	int PlayerPosition;
	
	/**
	 * @param player
	 * @param playerName
	 * @param playerPosition
	 */
	public Player(UUID player, String playerName, int playerPosition) {
		super();
		Player = player;
		PlayerName = playerName;
		PlayerPosition = playerPosition;
	}
	/**
	 * @return the player
	 */
	public UUID getPlayer() {
		return Player;
	}
	/**
	 * @param player the player to set
	 */
	public void setPlayer(UUID player) {
		Player = player;
	}
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return PlayerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	/**
	 * @return the playerPosition
	 */
	public int getPlayerPosition() {
		return PlayerPosition;
	}
	/**
	 * @param playerPosition the playerPosition to set
	 */
	public void setPlayerPosition(int playerPosition) {
		PlayerPosition = playerPosition;
	}
	
}
