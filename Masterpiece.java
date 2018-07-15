public abstract class Masterpiece extends Artifact {
	private Movement movement;
	private Condition condition;
	public Masterpiece(int index, String creator, int year, Movement movement, Condition condition) {
		super(index, creator, year);
		this.movement = movement;
		this.condition = condition;
		System.out.println("Creating an instance of masterpiece");
	}
	public void getInfo() {
		super.getInfo();
		String s = "Masterpiece's movement: " + movement.toString();
		s += "\nMasterpiece's condition: " + condition.toString();
		System.out.println(s);
	}
	public Movement getMove() {
		return movement;
	}
	public Condition getCond() {
		return condition;
	}
}
