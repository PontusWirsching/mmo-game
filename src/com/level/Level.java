// @author Jacob Duddles

package com.level;

import java.awt.Color;
import java.awt.Graphics;

import com.lss.flasher.LEngine;

public class Level {
	
	private LevelHandler[] levelStates;
	private int currentLevelState;
	
	// declare level ids here
	public static final int numberOfLevelStates = 20;
	public static final int mainWorldState = 1;

	public Level() {
		levelStates = new LevelHandler[numberOfLevelStates];
		currentLevelState = mainWorldState;
		loadLevelState(currentLevelState);
	}
	
	private void loadLevelState(int levelState) {
		if(levelState == mainWorldState) {
			levelStates[levelState] = new MainWorldState(this);
		}
	}
	
	private void unloadLevelState(int levelState) {
		levelStates[levelState] = null;
	}
	
	public void setState(int levelState) {
		unloadLevelState(currentLevelState);
		currentLevelState = levelState;
		loadLevelState(currentLevelState);
	}
	
	public void update() {
		if(levelStates[currentLevelState] != null) {
			levelStates[currentLevelState].update();
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LEngine.WIDTH, LEngine.HEIGHT);
	}

}
