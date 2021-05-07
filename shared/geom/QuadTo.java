package mpjp.shared.geom;

public class QuadTo extends java.lang.Object implements Segment, java.io.Serializable{
	//Fields
	private static final long serialVersionUID = 1L;
	private Point controlPoint;
	private Point endPoint;
	
	//Constructors
	
	// An empty instance
	public QuadTo() {
		super();
	}
	
	// A quadratic segment from given control point and end point
	public QuadTo(Point controlPoint, Point endPoint) {
		super();
		this.controlPoint = controlPoint;
		this.endPoint = endPoint;
	}
	
	
	// Methods
	
	// Returns the current control point
	public Point getControlPoint() {
		return controlPoint;
	}
	
	// Change control point
	public void setControlPoint(Point controlPoint) {
		this.controlPoint = controlPoint;
	}
	
	// Returns the current end point
	public Point getEndPoint() {
		return endPoint;
	}

	// Change the end point
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}	

}
