package model;

public class ParserInput {
	private String myInput;

	public ParserInput(String input) {
		myInput=input;
	}

	public void skipWhiteSpace() {
		while (notAtEndOfString() && Character.isWhitespace(currentCharacter())) {
			myInput=myInput.substring(1);
		}
	}

	public char currentCharacter() {
		return myInput.charAt(0);
	}

	public boolean notAtEndOfString() {
		return 0 < myInput.length();
	}
	
	public String getMyInput() {
		return myInput;
	}

	public String substring(int start) {
		return myInput.substring(start);
	}

	public String substring(int start, int end) {
		return myInput.substring(start, end);
	}

	public void move(int offset) {
		myInput = myInput.substring(offset);
	}
}