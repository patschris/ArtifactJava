public class Main {

	public static void main(String[] args) {
		/* Should give exactly three arguments */
		if(args.length != 3) {
			System.out.println("Should give exactly 4 arguments");
			System.exit(-1);
		}
		/* These three arguments should be integers */
		for (String s: args) {
			if (validate(s) == false) {
				System.out.println("Invalid arguments");
				System.exit(-1);
			}
		}
		int N = Integer.parseInt(args[0]);
		/* The arguments <mvmt> and <cond> should be between 0 and 2 */
		if (Integer.parseInt(args[1]) < 0 || Integer.parseInt(args[1]) > 2 || Integer.parseInt(args[2]) < 0  || Integer.parseInt(args[2]) > 2) {
			System.out.println("Arguments out of range");
			System.exit(-1);
		}
		Movement mvmt = Movement.getEnum(Integer.parseInt(args[1]));
		Condition cond = Condition.getEnum(Integer.parseInt(args[2]));
		/* Auction returns information about the artifacts */
		ArtifactHolder.initHolder(N, mvmt, cond);
		ArtifactHolder.auction();
		System.exit(0);
	}

	/*
     * Argumenents should be integers
	 */
	public static boolean validate(String s) {
		try {
			Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
