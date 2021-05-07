package mpjp.quad;

import mpjp.shared.HasPoint;
import java.util.Set;
import java.util.HashSet;

public class LeafTrie<T extends HasPoint> extends Trie<T> {
	// Fields
	private Set<T> points;
	
	//Constructor
	public LeafTrie(double bottomRightX, double bottomRightY, double topLeftX, double topLeftY) {
		super(bottomRightX, bottomRightY, topLeftX, topLeftY);
		this.bottomRightX = bottomRightX;
		this.bottomRightY = bottomRightY;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		
	}
	
	// Methods
	
	void collectAll(Set<T> nodes) {
		nodes.addAll(this.points);
	}

}

	