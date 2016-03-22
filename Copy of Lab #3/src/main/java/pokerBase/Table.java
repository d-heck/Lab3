package pokerBase;

import java.util.UUID;
import java.util.ArrayList;

public class Table {
	
	private UUID Table;
	ArrayList<Player> TablePlayers = new ArrayList<Player>();
	
	/**
	 * @param table
	 * @param tablePlayers
	 */
	public Table(ArrayList<Player> tablePlayers) {
		super();
		Table = UUID.randomUUID();
		TablePlayers = tablePlayers;
	}
	/**
	 * @return the table
	 */
	public UUID getTable() {
		return Table;
	}
	/**
	 * @param table the table to set
	 */
	public void setTable(UUID table) {
		Table = table;
	}
	/**
	 * @return the tablePlayers
	 */
	public ArrayList<Player> getTablePlayers() {
		return TablePlayers;
	}
	/**
	 * @param tablePlayers the tablePlayers to set
	 */
	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}
	
	public void AddPlayerToTable(Player Player){
		TablePlayers.add(Player);
	}
	
}
