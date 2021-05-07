package mpjp.quad;

import java.lang.String;
import mpjp.shared.HasPoint;
import java.util.Set;
import java.lang.Math;

public abstract class Trie<T extends HasPoint> extends java.lang.Object implements Element<T> {
	public enum Quadrant {
		SE, SW, NE, NW;
		// ValueOf and Values pre defined
	}
	
	//Fields
	protected double bottomRightX;
	protected double bottomRightY;
	static int capacity;
	protected double topLeftX;
	protected double topLeftY;
	 
	//Constructors
	
	
	public Trie(double bottomRightX, double bottomRightY, double topLeftX, double topLeftY) {
		super();
		this.bottomRightX = bottomRightX;
		this.bottomRightY = bottomRightY;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
	}
	
	//Methods
	
	abstract void collectAll(Set<T> points);
	abstract void collectNear(double x, double y, double radius, Set<T> points);
	abstract void delete (T point);
	abstract Trie<T> insert(T point);
	abstract Trie<T> insertReplace (T point);
	
	static int getCapacity() {
		return capacity;
	}
		
	static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
	
	static void setCapacity(int capacity) {
		Trie.capacity = capacity;
	}
	
	//public boolean overlaps (double x, double y, double radius)
	
	@Override
	public String toString() {
		return "Trie: bottomRightX = " + bottomRightX + "; bottomRightY = " + bottomRightY + "; topLeftX = " + topLeftX + "; topLeftY = " + topLeftY;
	}
	
	
}
