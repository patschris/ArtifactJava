public class Sculpture extends Masterpiece {
	private int volume;
	Material material;
	public Sculpture(int index, String creator, int year, Movement movement, Condition condition, int volume, Material material) {
		super(index, creator, year, movement, condition);
		this.volume = volume;
		this.material = material;
	}
	public void getInfo() {
		super.getInfo();
		String s = "Sculpture's volume: " + volume;
		s += "\nSculpture's material: " + material.toString();
		System.out.println(s);
	}
	public boolean evaluate(Movement desiredMovement) {
		return evaluate(desiredMovement, Condition.EXCELLENT);
	}

	public boolean evaluate(Movement desiredMovement, Condition desiredCondition) {
		if(desiredCondition == getCond() && desiredMovement == getMove()) {
			return true;
		}
		return false;
	}
}
