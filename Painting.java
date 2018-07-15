public class Painting extends Masterpiece {
	private int length;
	private int width;
	private Technique technique;
	public Painting(int index, String creator, int year, Movement movement, Condition condition, int length, int width, Technique technique) {
		super(index, creator, year, movement, condition);
		this.length = length;
		this.width = width;
		this.technique = technique;
		System.out.println("Creating an instance of painting");
	}
	public void getInfo() {
		super.getInfo();
		String s = "Painting's surface: " + (length*width);
		s += "\nPanting's technique: " + technique.toString();
		System.out.println(s);
	}
	
	public boolean evaluate(Movement desiredMovement) {
		return evaluate(desiredMovement, Condition.GOOD);
	}
	
	public boolean evaluate(Movement desiredMovement, Condition desiredCondition) {
		if (desiredMovement == getMove()) {
			if(desiredCondition == getCond() || (desiredCondition == Condition.GOOD && getCond() == Condition.EXCELLENT)) {
				return true;
			}
		}
		return false;
	}
}
