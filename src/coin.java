public class coin {
	public static final String TAILS = "TAILS";
	public static final String HEADS = "HEADS";

	public String flip () {
		if (Math.random() < 0.5) {
			return TAILS;
		} else {
			return HEADS;
		}
	}
}




