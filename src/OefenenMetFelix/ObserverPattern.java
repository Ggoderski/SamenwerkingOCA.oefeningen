package OefenenMetFelix;

import java.util.ArrayList;

public class ObserverPattern {

	public static void main(String[] args) {
		
		Page page = new Page();
		page.addNewPost("You feel lucky PUNK");
		
		// De gebruiker wordt genotificeerd
		User user = new User(page);
		page.addNewPost("Well do you feel lucky.....punk");
		
		// De recruiter en official volgen ook de post
		Recruiter recuiter = new Recruiter(page);
		Official official = new Official(page);
		// Alle Drie krijgen een notificatie van deze activiteitS
		page.addNewPost("I feel lucky!");
	}
}

class Page {
	
	/* Hierin hebben we een lijst met volgers
	 * Wanneer een volger een pagina wilt volgen dan wordt deze geregistreerd
	 */
	private ArrayList<Follower> followers;
	String latestPost;
	
	public Page() {
		followers = new ArrayList();
	}
	
	// Registreerd de volger
	public void registerFollower(Follower f) {
		followers.add(f);
	}
	
	// Notificeerd de volger dat de pagina een nieuwe post heeft
	public void notifyFollowers() {
		for (int i = 0; i < followers.size(); i++) {
			Follower follower = followers.get(i);
			follower.update();
		}
	}
	
	// getLatestPost en addNewPost zijn getters en setters voor de latest post
	public String getLatestPost() {
		return latestPost;
	}
	
	public void addNewPost(String post) {
		this.latestPost = post;
		notifyFollowers();
	}
	
}


interface Follower {
	// De Update() methode wordt opgeroepen als the subject een notificatie stuurt naar de gene die observeert over de verandering	
	public void update();

}


class User implements Follower {

	/* Wanneer een nieuw gebruikersobject wordt gemaakt, 
	 * neemt het de pagina die het wil volgen en registreert het zich daarvoor. 
	 * Wanneer de pagina een nieuw bericht toevoegt, wordt de gebruiker hiervan op de hoogte gesteld 
	 * via de methode update() die de gebruiker op zijn eigen manier kan implementeren.
	 */
	Page page;
	public User(Page page) {
		this.page = page;
		page.registerFollower(this);
	}
	
	public void update() {
		System.out.println("Laatste post gezien door normale gebruiker: " + page.getLatestPost());
	}

}

// Recruiter aangemaakt om ook de pagina te volgen
class Recruiter implements Follower {
	String company;
	
	Page page;
	public Recruiter(Page page) {
		this.page = page;
		page.registerFollower(this);
	}
	
	public void update() {
		System.out.println("Laatste post gezien door recruiter: " + page.getLatestPost());
	}
}

// Official aangemaakt om ook de pagina te volgen
class Official implements Follower {
	String designation;
	
	Page page;
	public Official(Page page) {
		this.page = page;
		page.registerFollower(this);
	}
	
	public void update() {
		System.out.println("Laatste post gezien door official: " + page.getLatestPost());
	}
}
