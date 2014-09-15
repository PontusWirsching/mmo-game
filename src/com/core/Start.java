package com.core;

import com.lss.flasher.LEngine;

public class Start extends LEngine {

	public Start(int width, int height, String frameName) {
		super(width, height, frameName);

		skipIntro();
		start();
	}

	@Override
	public void update() {
		System.out.println("sugar tits");
	}

	@Override
	public void render() {

	}

	public static void main(String[] args) {
		new Start(1024, 720, "MMO_GAME");
	}

}
