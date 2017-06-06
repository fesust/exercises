package workingwithobjects.enumexample;

public enum Color {	
	RED(5455, "string"),
	BLUE(5346, "a"),
	GREEN(56, "'dd")
	;
	
	private int number;
	private String srt;

	private Color(int number, String srt) {
		this.number = number;
		this.srt = srt;
	}
	
	
	
}	