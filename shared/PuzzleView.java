package mpjp.shared;

import mpjp.shared.geom.Point;
import mpjp.shared.geom.PieceShape;
import java.lang.String;
import java.util.Date;
import java.util.Map;
import java.lang.Integer;


public class PuzzleView extends java.lang.Object implements java.io.Serializable {
	//Fields
	private static final long serialVersionUID = 1L;
	private String image;								 	     // Name of the image on the puzzle background
	private Map<Integer,Point> locations;    // Map of pieces IDs to their location on the standard puzzle
	private double pieceHeight;									 // Height of piece rectangle on the puzzle structure
	private double pieceWidth;									 // Width of piece rectangle on the puzzle structure
	private double puzzleWidth;									 // Width of the puzzle
	private double puzzleHeight;								 // Height of the puzzle
	private Map<Integer, PieceShape> shapes; // Map of pieces IDs to their shapes
	private Date start;											 // Moment when the jigsaw puzzle started being solved
	private double workspaceHeight;								 // Height of the workspace where the puzzle is solved
	private double workspaceWidth;                               // Width of the workspace where the puzzle is solved
	
	//Constructors
	

	public PuzzleView() {
		super();
	}
	
	public PuzzleView( Date start,double workspaceWidth, double workspaceHeight, double puzzleWidth, double puzzleHeight, 
						double pieceWidth, double pieceHeight, String image,  Map<Integer, PieceShape> shapes,
						Map<Integer,Point> locations) {
		super();
		this.image = image;
		this.locations = locations;
		this.pieceHeight = pieceHeight;
		this.pieceWidth = pieceWidth;
		this.puzzleWidth = puzzleWidth;
		this.puzzleHeight = puzzleHeight;
		this.shapes = shapes;
		this.start = start;
		this.workspaceHeight = workspaceHeight;
		this.workspaceWidth = workspaceWidth;
	}



	// Methods
	
	// returns the name of the image on the puzzle background
	public String getImage() {
		return image;
	}

	// returns the map of pieces IDs to their location on the standard puzzle
	public Map<Integer, Point> getLocations() {
		return locations;
	}

	// returns the height of the puzzle being solved
	public double getPieceHeight() {
		return pieceHeight;
	}
	
	// returns the width of the puzzle being solved
	public double getPieceWidth() {
		return pieceWidth;
	}

	// returns the date when this puzzle was started being solved
	public Date getStart() {
		return start;
	}

	// returns the height of the workspace where the puzzle is solved
	public double getWorkspaceHeight() {
		return workspaceHeight;
	}

	// returns the width of the workspace where the puzzle is solved
	public double getWorkspaceWidth() {
		return workspaceWidth;
	}
	
	// returns the weight of the puzzle being solved
	public double getPuzzleWidth() {
		return puzzleWidth;
	}

	// returns the height of the puzzle being solved
	public double getPuzzleHeight() {
		return puzzleHeight;
	}
	
	// returns the shape of piece with given id
	public PieceShape getPieceShape(int id) {
		return shapes.get(id);
	}
	
	// returns the location of piece in the complete puzzle
	public Point getStandardPieceLocation(int id) {
		return locations.get(id);
	}
}
