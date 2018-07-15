public class Sculpture extends Masterpiece {
	/* 
	 * Sculpture's volume
	 */
	private int volume;
	/* 
	 * Sculpture's material (Iron, Stone, Wood)
	 */
	Material material;
	
	/*
	 * Constructor of class "Sculpture"
	 */
	public Sculpture(int index, String creator, int year, Movement movement, Condition condition, int volume, Material material) {
		super(index, creator, year, movement, condition);
		this.volume = volume;
		this.material = material;
	}
	
	/*
	 * Returns information about the sculpture's volume and material
	 */	
	public void getInfo() {
		super.getInfo();
		String s = "Sculpture's volume: " + volume;
		s += "\nSculpture's material: " + material.toString();
		System.out.println(s);
	}
	
	/*
	 * Sculpture's evaluation based on program arguments for desired movement and condition
	 */	
	public boolean evaluate(Movement desiredMovement) {
		return evaluate(desiredMovement, Condition.EXCELLENT);
	}

	/*
	 * Sculpture's evaluation based on program arguments for desired movement and condition
	 */	
	public boolean evaluate(Movement desiredMovement, Condition desiredCondition) {
		if(desiredCondition == getCond() && desiredMovement == getMove()) {
			return true;
		}
		return false;
	}
}