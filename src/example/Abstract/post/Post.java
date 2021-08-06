package example.Abstract.post;

// Abstract class Post
public abstract class Post {

	private String postName;
	private String postCategory;
	private String postContent;
	private String postDate;

	// Constructor
	public Post(String pn, String pcat, String pcont, String pdat) {
		this.postName = pn;
		this.postCategory = pcat;
		this.postContent = pcont;
		this.postDate = pdat;
	}

	// Abstract method Publish() declaration
	public abstract void Publish();

	// Overridden implementation of method toString()
	@Override
	public String toString () {
		return "Post name:" + this.postName + " Post Category:" + this.postCategory + " Post Content:" + this.postContent + " Post Date:" + this.postDate;
	}

}
