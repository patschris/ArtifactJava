public class Painting extends Masterpiece {
	/* 
	 * Painting's length
	 */
	private int length;
	/* 
	 * Painting's width
	 */
	private int width;
	/* 
	 * Painting's technique (Oil, Aquarelle, Tempera)
	 */
	private Technique technique;

	/*
 	 * Constructor of class "Painting"
 	*/
	public Painting(int index, String creator, int year, Movement movement, Condition condition, int length, int width, Technique technique) {
		super(index, creator, year, movement, condition);
		this.length = length;
		this.width = width;
		this.technique = technique;
		System.out.println("Creating an instance of painting");
	}

	/*
 	 * Destructor of class "Painting"
 	 */
	public void getInfo() {
		super.getInfo();
		String s = "Painting's surface: " + (length*width);
		s += "\nPanting's technique: " + technique.toString();
		System.out.println(s);
	}

	/*
	 * Painting's evaluation based on program arguments for desired movement and condition
	 */	
	public boolean evaluate(Movement desiredMovement) {
		return evaluate(desiredMovement, Condition.GOOD);
	}
	
	/*
	 * Painting's evaluation based on program arguments for desired movement and condition
	 */	
	public boolean evaluate(Movement desiredMovement, Condition desiredCondition) {
		if (desiredMovement == getMove()) {
			if(desiredCondition == getCond() || (desiredCondition == Condition.GOOD && getCond() == Condition.EXCELLENT)) {
				return true;
			}
		}
		return false;
	}
}