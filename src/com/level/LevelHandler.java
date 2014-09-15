// @author Jacob Duddles

package com.level;

import java.awt.Graphics;

public abstract class LevelHandler {
	
	protected Level level;
	
	public LevelHandler(Level level) {
		this.level = level;
	}
	
	public abstract void render(Graphics g);
	
	public abstract void update();

}
