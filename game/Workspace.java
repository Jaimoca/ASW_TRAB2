package mpjp.game;
import java.io.Serializable;
import java.util.Date;


import mpjp.game.*;
import mpjp.quad.*;
import mpjp.shared.*; 

public class Workspace implements Serializable{
	
	private static final long serialVersionUID =1L;
	Date start;
	PuzzleInfo info;
	static double heightF,widthF,radius;
	String workspaceId = null;
	PuzzleView puzzleView;
	PuzzleLayout puzzleLayout;
	PuzzleStructure puzzleStructure;

	/**
	 * 
	 * @param info
	 * @throws MPJPException
	 */
	public Workspace(PuzzleInfo info) throws MPJPException {
		super();
		widthF = 2;
		heightF = 2;
		radius = getSelectRadius() * 2;

		this.info = info;
		this.start = new Date();
	}
	
	/**
	 * Current proportion between board width and puzzle width. For instance, a factor 2 means that the boards are created with twice the puzzle's width.
	 * @return widthFactor ratio between workspace and puzzle widths
	 */
	public static double getWidthFactor() {
		return widthF;
	}
	/**
	 * Change proportion between board width and puzzle width. For instance, a factor 2 means that the boards are created with twice the puzzle's width.
	 * @param widthFactor
	 */
	public static void setWidthFactor​(double widthFactor) {
		Workspace.widthF = widthFactor;
	}
	
	/**
	 * Current proportion between board height and puzzle height. For instance, a factor 2 means that the boards are created with twice the puzzle's height.
	 * @return heightFactor ratio between workspace and puzzle heights
	 */
	
	public static double getHeightFactor() {
		return heightF;
	}
	
	/**
	 * Change proportion between board width and puzzle width. For instance, a factor 2 means that the boards are created with twice the puzzle's height.
	 * @param heightFactor
	 */
	
	public static void setHeightFactor​(double heightFactor) {
		Workspace.heightF = heightFactor;
	}
	
	/**
	 * Current radius for matching
	 * @return radius
	 */
	public static double getRadius() {
		return radius;
	}
	
	/**
	 * Set radius for matching pieces
	 * @param radius
	 */
	
	public static void setRadius​(double radius) {
		Workspace.radius = radius;
	}
	
	/**
	 * Creates a string ID for this solution by combining some of its features (e.g. image) and the start date. 
	 * This ID must be different for 2 workspaces created from the same data in different moments.
	 * @return id for this workspace
	 */
	public String getId(){
		if (workspaceId != null) {
			return workspaceId;
		}
		else {
			workspaceId = Workspace.generateID();
		}
		return workspaceId;
	}
	
	/**
	 * The radius from the "center" of the piece where it can be selected. This radius should be maximum of piece width and height.
	 * @return radius for piece selection
	 */
	double getSelectRadius() {
		double a=(puzzleStructure.getPieceWidth() * puzzleStructure.getPieceWidth());
		double b=(puzzleStructure.getPieceHeight() * puzzleStructure.getPieceHeight());
		
		return Math.sqrt(a+b)/ 2;

	}
	
	/**
	 * Information on this puzzle that may be used by a person to decide to help solving it. It is contains the data used to create the puzzle, 
	 * the moment when it started being solved, and the percentage that was already solved.
	 * @return puzzleSelectInfo
	 */
	
	PuzzleSelectInfo getPuzzleSelectInfo() {
		PuzzleSelectInfo puzzInf = new PuzzleSelectInfo(info, start, getPercentageSolved());
		return puzzInf;

	}
	
	/**
	 * Percentage in which puzzle is solved. This is computed as 100 * (p - b) / (p - 1) where
		p is the number of pieces and
		b is the number of blocks
	 * @return percentageComplete
	 */
	int getPercentageSolved() {
		return puzzleLayout.getPercentageSolved();
	}
	
	/**
	 * The visual part of the puzzle, sent to the client when the user starts solving the puzzle.
	 * @return PuzzleView
	 */
	
	PuzzleView getPuzzleView() {
		return puzzleView;
	}
	
	/**
	 * The current piece positions and blocks formed by connected pieces
	 * @return PuzzleLayout
	 */
	PuzzleLayout getCurrentLayout() {
		return puzzleLayout;
	}

	void scatter() {
		
	}
	
	void restore() {
		
	}

	java.lang.Integer selectPiece​(Point point){
		
	}
	
	PuzzleLayout connect​(int movedId, Point point) throws MPJPException{
		
	}
	
	PuzzleStructure getPuzzleStructure() {
		return puzzleStructure;
	}
}