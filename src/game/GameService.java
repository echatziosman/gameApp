package game;

public interface GameService {

	void sell(Game game,Gamer gamer);
	void sellWithCampaign(Game game,Gamer gamer,Campaign campaign);
}
