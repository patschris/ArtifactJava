import java.util.Random;

public class ArtifactHolder {
	/*
	 * Array that holds artifacts
	 */
	private static Artifact[] array;
	/*
	 * Amount of artifacts 
	 */
	private static int N;
	/*
	 * Artifact's condition for evaluation
	 */
	private static Condition cond;
	/*
	 * Artifact's movement for evaluation
	 */
	private static Movement mvmt;

	/*
	* Creates an array of pointers to artifacts 
	*/	
	public static void initHolder(int n, Movement m, Condition c) {
		N = n;
		mvmt = m;
		cond = c;
		array = new Artifact[N];
		for (int i = 0; i < N; i++) {
			/* Creator's name */
			String rName = "Creator" + (i+1);
			/* Random year of creation */
			int rYear = new Random().nextInt(318)+1700;
			/* Random movement and condition */
			Movement rMove = Movement.getEnum(new Random().nextInt(3)); /* 0:Impessionism, 1:Expressionism, 2:Naturalism */
			Condition rCond = Condition.getEnum(new Random().nextInt(3)); /* 0:Bad, 1:Good, 2:Excellent */
			if (new Random().nextInt(2) == 0) { /* 0:Painting, 1: Sculpture */
				/* Creating Painting with random dimension and technique */
				int length = new Random().nextInt(100);
				int width = new Random().nextInt(100);
				Technique t = Technique.getEnum(new Random().nextInt(3)); /* 0:Oil, 1:Aquarelle, 2:Tempera */
				array[i] = new Painting(i+1, rName, rYear, rMove, rCond, length, width, t);
			}
			else {
				/* Creating Sculpture with random colume and material */
				int volume = new Random().nextInt(100);
				Material material = Material.getEnum(new Random().nextInt(3)); /* 0: Iron, 2:Stone, 3:Wood */
				array[i] = new Sculpture(i+1, rName, rYear, rMove, rCond, volume, material);
			}
		}
	}

	/*
	* Returns information about artifacts regardless their type (Paintings, Sculptures)
	*/	
	public static void auction() {
		System.out.println("------------------------------------------");
		for (int i = 0; i < N; i++) {
			array[i].getIndex();
			array[i].getInfo();
			System.out.print("Evaluation: ");
			if (array[i].evaluate(mvmt, cond))
				System.out.println("Approved");
			else
				System.out.println("Not approved");
			System.out.println("------------------------------------------");
		}		
	}
}