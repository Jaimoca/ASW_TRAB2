package mpjp.quad;

import mpjp.shared.HasPoint;

public interface Element<T extends HasPoint> {
	public void accept(Visitor<T> visitor);
}
