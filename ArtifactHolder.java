import java.util.Random;

public class ArtifactHolder {
	private static Artifact[] array;
	private static int N;
	private static Condition cond;
	private static Movement mvmt;
	public static void initHolder(int n, Movement m, Condition c) {
		N = n;
		mvmt = m;
		cond = c;
		array = new Artifact[N];
		for (int i = 0; i < N; i++) {
			String rName = "Creator" + (i+1);
			int rYear = new Random().nextInt(318)+1700;
			Movement rMove = Movement.getEnum(new Random().nextInt(3));
			Condition rCond = Condition.getEnum(new Random().nextInt(3));
			if (new Random().nextInt(2) == 0) {
				int length = new Random().nextInt(100);
				int width = new Random().nextInt(100);
				Technique t = Technique.getEnum(new Random().nextInt(3));
				array[i] = new Painting(i+1, rName, rYear, rMove, rCond, length, width, t);
			}
			else {
				int volume = new Random().nextInt(100);
				Material material = Material.getEnum(new Random().nextInt(3));
				array[i] = new Sculpture(i+1, rName, rYear, rMove, rCond, volume, material);
			}
		}
	}
	public static void auction() {
		System.out.println("------------------------------------------");
		for (int i = 0; i < N; i++) {
			array[i].getIndex();
			array[i].getInfo();
			System.out.print("Evaluation: ");
			if (array[i].evaluate(mvmt, cond) == true)
				System.out.println("Approved");
			else
				System.out.println("Not approved");
			System.out.println("------------------------------------------");
		}		
	}
}
