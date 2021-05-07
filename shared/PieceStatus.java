package mpjp.shared;
import mpjp.shared.geom.Point;

public class PieceStatus extends java.lang.Object implements java.io.Serializable, HasPoint {
	//Fields
	private static final long serialVersionUID = 1L;
	private int block;       // ID of the block this piece belongs to
	private int id;   		 // ID of a piece (non-negative integer less than the numer of pieces)
	private Point position;  // Current position of this piece
	private double rotation; // Rotation of this piece
	
	
	//Constructors
	
	public PieceStatus() {
		super();
	}
	
	public PieceStatus (int id, Point position) {
		super();
		this.id = id;
		this.position = position;
		
	}
	
	// Methods
	
	// returns the ID of the block this piece belongs to
	public int getBlock() { 
		return block;
	}
	
	// returns the ID of a piece (non-negative integer less than the numer of pieces)
	public int getId() {
		return id;
	}
	
	// returns the current position of this piece
	public Point getPosition() {
		return position;
	}
	
	// returns the rotation of this piece
	public double getRotation() {
		return rotation;
	}
	
	// returns the X coordinate of this piece 
	@Override
	public double getX() {
		return position.getX();
	}
	
	// returns the Y coordinate of this piece
	@Override
	public double getY() {
		return position.getY();
	}
	
	// set a new block for this piece
	public void setBlock (int block) {
		this.block = block;
	}
	
	// set a new position for this piece
	public void setPosition (Point position) {
		this.position = position;
	}
	
	// set a new rotation for this piece
	public void setRotation (double rotation) {
		this.rotation = rotation;
	}

}
