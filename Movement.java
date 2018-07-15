/*
 * Enumeration for Movement (IMPRESSIONISM = 0, EXPRESSIONISM = 1, NATURALISM = 2)
 */
public enum Movement {
	IMPRESSIONISM{
		@Override
		public String toString() {
			return "IMPRESSIONISM";
		}
	}, 
	EXPRESSIONISM{
		@Override
		public String toString() {
			return "EXPRESSIONISM";
		}
	}, 
	NATURALISM{
		@Override
		public String toString() {
			return "NATURALISM";
		}
	};
	
	public static Movement getEnum(int x) {
		switch(x){
			case 0:
				return IMPRESSIONISM;
			case 1:
				return EXPRESSIONISM;
			case 2:
				return NATURALISM;
			default:
				return null;
		}
	}
}
