package mpjp.shared.geom;

public class Point extends java.lang.Object implements java.io.Serializable{ 
	//Fields
	private static final long serialVersionUID = 1L;
	private double x;											// The horizontal coordinate of this point
	private double y;											// The vertical coordinate of this point
	
	//Constructor

	// Create point at origin
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	// Create point from coordinates
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	//Methods
	
	// Returns the X coordinate of this point
	public double getX() {
		return x;
	}

	// Returns the Y coordinate of this point
	public double getY() {
		return y;
	}

	// Set a new X coordinate for this point
	public void setX(double x) {
		this.x = x;
	}

	// Returns the 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	// Checks if the obj is equals to the point
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	// Set a new Y coordinate for the point
	public void setY(double y) {
		this.y = y;
	}
	
	// Returns a String of a point with his X and Y values
	@Override
	public java.lang.String toString() {
		return "Point: x = " + getX() + "; y = " + getY();
	}
}
