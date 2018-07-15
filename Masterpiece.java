public abstract class Masterpiece extends Artifact {
	/* 
	 * Masterpiece's movement (Impressionism, Expressionism, Naturalism)
	 */
	private Movement movement;
	/* 
	 * Masterpiece's movement (Bad, Good, Excellent)
	 */	
	private Condition condition;
	
	/*
 	 * Constructor of class "Masterpiece"
 	 */
	public Masterpiece(int index, String creator, int year, Movement movement, Condition condition) {
		super(index, creator, year);
		this.movement = movement;
		this.condition = condition;
		System.out.println("Creating an instance of masterpiece");
	}
	
	/*
 	 * Returns information about the masterpiece's creator, the year of creation, the movement and the condition
 	*/
	public void getInfo() {
		super.getInfo();
		String s = "Masterpiece's movement: " + movement.toString();
		s += "\nMasterpiece's condition: " + condition.toString();
		System.out.println(s);
	}
	
	/*
 	 * Returns Masterpiece's movement
 	 */
	public Movement getMove() {
		return movement;
	}
	
	/*
 	 * Returns Masterpiece's condition
 	*/
	public Condition getCond() {
		return condition;
	}
}
