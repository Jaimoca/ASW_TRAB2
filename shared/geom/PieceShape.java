package mpjp.shared.geom;

import java.util.List;
import java.util.ArrayList;
public class PieceShape extends java.lang.Object implements java.io.Serializable, Segment {
	//Fields
	private static final long serialVersionUID = 1L;
	private List<Segment> segments;								// List of segments, each starting at the end of the preceding one, or the start point
	private Point startPoint;									// Start point of this shape
	
	//Constructors
	
	// Create a complete shape from an initial point as a list of segments
	public PieceShape(Point startPoint, List<Segment> segments) { 
		super();
		this.segments = segments;
		this.startPoint = startPoint;
	}
	
	// Create a piece shape with an initial point
	public PieceShape(Point startPoint) {
		super();
		this.startPoint = startPoint;
		segments = new ArrayList<Segment>();
		
	}
	
	// Create an empty piece shape
	public PieceShape() {
		super();
		segments = new ArrayList<Segment>();
	}
	
	// Methods

	// Returns the current list of segments
	public List<Segment> getSegments() {
		return segments;
	}

	// Change the list of segments
	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}

	// Returns the current starting point
	public Point getStartPoint() {
		return startPoint;
	}

	// Change the starting point
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	// Add a segment to this shape
	public PieceShape addSegment(Segment segment) {
		this.segments.add(segment);
		return this;
	}
}
