package mpjp.quad;

import mpjp.shared.HasPoint;

public interface Visitor<T extends HasPoint> {
	public void visit(LeafTrie<T> leaf);
	public void visit(NodeTrie<T> node);
}
