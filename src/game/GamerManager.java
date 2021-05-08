package game;

public class GamerManager implements GamerService {

	private ValidationService validationService;
	
	public GamerManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void register(Gamer gamer) {
		if(validationService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " Basarili Kayit");
		}
		else {
			System.out.println("Error...Check your credentials");
		}
		
	}

	@Override
	public void login(Gamer gamer) {
		if(validationService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " Hosgeldin");
		}
		else {
			System.out.println("Error...Check your credentials");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(validationService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " bilgileriniz basariyla guncellendi");
		}
		else {
			System.out.println("Bilgileriniz guncellenemedi");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(validationService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " basariyla silindi");
		}
		else {
			System.out.println("Silme islemi basarisiz");
		}
		
		
	}

}
