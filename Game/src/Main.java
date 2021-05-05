
public class Main {

	public static void main(String[] args) {
	     Gamer gamer1=new Gamer();
			gamer1.setId(1);
			gamer1.setName("Tugce");
			gamer1.setSurname("Durmaz");
		
			Game game1=new Game();
			game1.setId(1);
			game1.setGameName("pubg");
			
			
			Campaign campaign1=new Campaign();
			campaign1.setId(1);
			campaign1.setCampaignName("pubg");
			campaign1.setDiscount(50);
			
			GamerManager gamerManager=new GamerManager();
			gamerManager.add(gamer1);
	        gamerManager.update(gamer1);
	        gamerManager.delete(gamer1);
				
			CampaignManager campaignManager=new CampaignManager();
	        campaignManager.CamAdd(campaign1);
	        campaignManager.CamUpdate(campaign1);
	        campaignManager.CamDelete(campaign1);
			
			GameManager gameManager=new GameManager();
	        gameManager.Gameadd(game1);
	        gameManager.Gameupdate(game1);
	        gameManager.Gamedelete(game1);

	}

}
