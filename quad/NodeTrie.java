package mpjp.quad;

import mpjp.shared.HasPoint;
import java.util.Map;

public class NodeTrie<T extends HasPoint> extends Trie<T>{
	//Fields 
	Map<Trie.Quadrant, Trie<T>> tries;
	
	public NodeTrie(double bottomRightX, double bottomRightY, double topLeftX, double topLeftY) {
		super(bottomRightX, bottomRightY, topLeftX, topLeftY);
		this.bottomRightX = bottomRightX;
		this.bottomRightY = bottomRightY;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		
		
	}

}
