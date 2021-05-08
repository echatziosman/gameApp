package game;

public interface GamerService {

	void register(Gamer gamer);
	void login(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
