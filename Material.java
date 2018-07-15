

public enum Material {
	IRON{
		@Override
		public String toString() {
			return "IRON";
		}
	}, 
	STONE{
		@Override
		public String toString() {
			return "STONE";
		}
	}, 
	WOOD{
		@Override
		public String toString() {
			return "WOOD";
		}
	};
	public static Material getEnum(int x) {
		switch(x){
			case 0:
				return IRON;
			case 1:
				return STONE;
			case 2:
				return WOOD;
			default:
				return null;
		}
	}
}
