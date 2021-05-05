

    public class CampaignManager implements CampaignService {

    public void CamAdd(Campaign campaign) {
	        System.out.println("Eklendi: " + campaign.getCampaignName());
	        
	    }

    public void CamUpdate(Campaign campaign) {
	   System.out.println("Güncellendi: " + campaign.getCampaignName());
	        
	    }

 
	    public void CamDelete(Campaign campaign) {
	        System.out.println("Silindi: " + campaign.getCampaignName());
	      
	
	

}
}