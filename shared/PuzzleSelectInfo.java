package mpjp.shared;

import java.util.Date;

public class PuzzleSelectInfo extends PuzzleInfo implements java.io.Serializable {
	//Fields
	private static final long serialVersionUID = 1L;
	private int percentageSolved; // Percentage of the puzzle solved
	private Date start; // Moment when the jigsaw started being solved
	
	//Constructors
	
	public PuzzleSelectInfo() {
		super();
	}
	
	// Creates an instance from a puzzle view and start date and percentage solved
	public PuzzleSelectInfo(PuzzleInfo info, Date start, int percentageSolved) {
		this.start = start;
		this.percentageSolved = percentageSolved;
	}

	
	//Methods
	
	// returns the percentage of the puzzle that is solved
	public int getPercentageSolved() {
		return percentageSolved;
	}
	
	// returns the moment when the puzzle start being solved
	public java.util.Date getStart() {
		return start;
	}

}
