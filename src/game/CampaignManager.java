package game;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + "%" + campaign.getCampaignRate() + " oranla eklenmistir..");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " bilgileri guncellenmistir..");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " basariyla silinmistir");
		
	}



}
