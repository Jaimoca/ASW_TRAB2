package mpjp.shared.geom;

public class CurveTo extends java.lang.Object implements Segment, java.io.Serializable {
	//Fields
	private static final long serialVersionUID = 1L;
	private Point controlPoint1;						// First control point in the Bezier line
	private Point controlPoint2;						// Second control point in the Bezier line
	private Point endPoint;								// End point in this Bezier line

	
	//Constructors
	
	public CurveTo() {
		super();
	}

	// A Bazier segment with given control points and end point
	public CurveTo(Point controlPoint1, Point controlPoint2, Point endPoint) {
		super();
		this.controlPoint1 = controlPoint1;
		this.controlPoint2 = controlPoint2;
		this.endPoint = endPoint;
	}
	
	
	//Methods
	
	// Returns the current first control point
	public Point getControlPoint1() {
		return controlPoint1;
	}

	// Change first control point
	public void setControlPoint1(Point controlPoint1) {
		this.controlPoint1 = controlPoint1;
	}

	// Returns the current second control point
	public Point getControlPoint2() {
		return controlPoint2;
	}

	// Change second control point
	public void setControlPoint2(Point controlPoint2) {
		this.controlPoint2 = controlPoint2;
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
