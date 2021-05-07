package mpjp.shared.geom;

public class LineTo extends java.lang.Object implements Segment, java.io.Serializable{
	//Fields
	private static final long serialVersionUID = 1L;
	private Point endPoint;								//  End point in this line segment
	
	//Constructors
	
	// A line segment to the given end point
	public LineTo(Point endPoint) {  
		super();
		this.endPoint = endPoint;
	}
	
	// An empty instance
	public LineTo() {
		super();
	}

	
	// Methods
	
	// Returns the current end point 
	public Point getEndPoint() {
		return endPoint;
	}
	
	// Change the end point
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}	
}
