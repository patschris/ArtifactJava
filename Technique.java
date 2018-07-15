public enum Technique {
	OIL{
		@Override
		public String toString() {
			return "OIL";
		}
	}, 
	AQUARELLE{
		@Override
		public String toString() {
			return "AQUARELLE";
		}
	}, 
	TEMPERA{
		@Override
		public String toString() {
			return "TEMPERA";
		}
	};
	
	public static Technique getEnum(int x) {
		switch(x){
			case 0:
				return OIL;
			case 1:
				return AQUARELLE;
			case 2:
				return TEMPERA;
			default:
				return null;
		}
	}
}
