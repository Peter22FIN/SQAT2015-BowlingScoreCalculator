package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testFrame2and4() {
		BowlingGame bg = new BowlingGame();
		Frame frame = new Frame(2, 4);
		bg.addFrame(frame);
	}
	
	@Test
	public void testFrameScore2and6Return9() {
		BowlingGame bg = new BowlingGame();
		Frame frame = new Frame(2, 6);
		bg.addFrame(frame);
		assertEquals(9, frame.score());
	}
	
}
