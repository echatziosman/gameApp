package game;

public class GameManager implements GameService{

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+game.getName()+" oyununu"+game.getPrice()+" fiyatina satin almistir");
		
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+game.getName()+" oyununa"+game.getPrice()+" TL uzerinden "+campaign.getName()+" uygulanmistir");
	}

}
