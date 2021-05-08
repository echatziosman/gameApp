package game;

public class ValidationManager implements ValidationService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		try {
			if(gamer.getNationalityId().length() == 11 && gamer.getDateOfBirth().getYear() < 2000) {
				
				return true;
			}
			else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
