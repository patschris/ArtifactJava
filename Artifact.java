public abstract class Artifact {
	private int index;
	private String creator;
	private int year;
	public Artifact(int index, String creator, int year) {
		this.creator = new String();
		this.creator = creator;
		this.index = index;
		this.year = year;
		System.out.println("Creating an instance of artifact");
	}
	public void getInfo() {
		System.out.println(this.toString());
	}
	public void getIndex() {
		System.out.println("Artifact's index number: " + index);
	}
	@Override
	public String toString() {
		String s = "Artifact's creator: " + creator;
		s += "\nYear of creation: " + year;
		return s;
	}
	public boolean evaluate(Movement m, Condition c) {
		System.out.println("never should be here");
		return true;
	}
}
