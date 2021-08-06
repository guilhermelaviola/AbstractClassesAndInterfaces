package example.Abstract.post;

// ContestPost class
public class ContestPost extends Post {

	private String contestWinner;
	
	// Constructor
	public ContestPost(String pn, String pcat, String pcont, String pdat, String winner) {
		super(pn, pcat, pcont, pdat);
		this.contestWinner = winner;
	}

	@Override
	public void Publish() {
		if(contestWinner != null) {
			System.out.println("Post published succesfully!");
		}
		else {
			System.out.println("Post not published. There's no winner.");
		}
	}
	
	// Test
	public static void main(String[] args) {
		Post post1 = new ContestPost(" Fan Of The Month: August of 2020! ", " Contests ", " Lorem ipsum ", " 08/04/2021 ", " Joe Nielsen ");
		post1.Publish();
		System.out.println(post1);
	}
}
