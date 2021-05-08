package game;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,"Enes","Haciosman","12345678999",LocalDate.parse("1986-12-12"));
		Gamer gamer2 = new Gamer(2,"John","Doe","123456789",LocalDate.parse("1986-12-12"));
		Gamer gamer3 = new Gamer(3,"Mehmet","Say","12345678911",LocalDate.parse("2005-12-01"));
		
		Game game1 = new Game(1,"FIFA 2021","Sports",300);
		Game game2 = new Game(2,"Need For Speed","Sports",299);
		
		Campaign campaign1 = new Campaign(1,"Yaz Kampanyasi",30);
		
		GamerManager gamerManager = new GamerManager(new ValidationManager());
		gamerManager.register(gamer2);
		gamerManager.login(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer3);
		
		System.out.println("****************************************");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		
		System.out.println("****************************************");
		
		GameManager gameManager = new GameManager();
		gameManager.sell(game2, gamer1);
		gameManager.sellWithCampaign(game1, gamer1, campaign1);

	}

}
