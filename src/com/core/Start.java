package com.core;

import com.level.Level;
import com.lss.flasher.LEngine;

public class Start extends LEngine {
	
	private Level level;

	public Start(int width, int height, String frameName) {
		super(width, height, frameName);

		skipIntro();
		start();
		
		level = new Level();
	}

	@Override
	public void update() {
		level.update();
	}
		
	@Override
	public void render() {
		level.render(g);
	}

	public static void main(String[] args) {
		new Start(1024, 720, "MMO_GAME");
	}

}
