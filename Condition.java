

public enum Condition {
	BAD{
		@Override
		public String toString() {
			return "BAD";
		}
	}, 
	GOOD{
		@Override
		public String toString() {
			return "GOOD";
		}
	}, 
	EXCELLENT{
		@Override
		public String toString() {
			return "EXCELLENT";
		}
	};
	public static Condition getEnum(int x) {
		switch(x){
			case 0:
				return BAD;
			case 1:
				return GOOD;
			case 2:
				return EXCELLENT;
			default:
				return null;
		}
	}
}
