/*
	
 */

package net.sf.odinms.server.maps;

public abstract class AbstractAnimatedMapleMapObject extends
		AbstractMapleMapObject implements AnimatedMapleMapObject {

	private int stance;

	public int getStance() {
		return stance;
	}

	public void setStance(int stance) {
		this.stance = stance;
	}

	public boolean isFacingLeft() {
		return Math.abs(stance) % 2 == 1;
	}
}