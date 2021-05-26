package com.ojas.player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CricketStatistics {

	List<Player> playersList;

	public List<Player> getplayersList() {
		return playersList;
	}

	public void setplayersList(List<Player> playersList) {
		this.playersList = playersList;
	}

	public CricketStatistics(List<Player> playersList) {
		super();
		this.playersList = playersList;
	}

	@Override
	public String toString() {
		return "CricketStatistics [playersList=" + playersList + "]";
	}

}

public class PlayerFileRead {
	public static void main(String[] args) {

		try {

			File file = new File("C:\\Users\\Prasad\\Desktop\\Player.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String playerLines;
			ArrayList<Player> playersList = new ArrayList<Player>();
			while ((playerLines = br.readLine()) != null) {
				String[] values = playerLines.split(";");
				if (!values[0].equals("PlayerName")) {
					Player player = new Player();
					player.setName(values[0]);
					player.setCountry(values[1]);
					player.setTotalRuns(Integer.parseInt(values[2]));
					player.setHighestScore(Integer.parseInt(values[3]));
					playersList.add(player);
					System.out.println("Player : " + player.toString());
				}
			}
			CricketStatistics playersDetails = new CricketStatistics(playersList);
			System.out.println("playersDetails : " + playersDetails.toString());
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}