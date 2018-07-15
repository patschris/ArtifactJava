public abstract class Artifact {
	/* 
	 * Artifact's index
	 */
	private int index;
	/* 
	 * Artifact's creator
	 */
	private String creator;
	/* 
	 * Artifact's year of creation 
   	 */
	private int year;
	
	/*
 	 * Constructor of class "Artifact"
 	 */
	public Artifact(int index, String creator, int year) {
		this.creator = new String();
		this.creator = creator;
		this.index = index;
		this.year = year;
		System.out.println("Creating an instance of artifact");
	}

	/*
	 * Returns information about the artifact's creator and the year of creation
	 */
	public void getInfo() {
		System.out.println(this.toString());
	}

	/*
	 * Returns artifact's index
	 */	
	public void getIndex() {
		System.out.println("Artifact's index number: " + index);
	}

	/*
	 * Creates a string with object's data
	 */
	@Override
	public String toString() {
		String s = "Artifact's creator: " + creator;
		s += "\nYear of creation: " + year;
		return s;
	}

	/*
 	 * Returns artifact's evaluation
 	 */
	public boolean evaluate(Movement m, Condition c) {
		System.out.println("Never should be here");
		return true;
	}
}