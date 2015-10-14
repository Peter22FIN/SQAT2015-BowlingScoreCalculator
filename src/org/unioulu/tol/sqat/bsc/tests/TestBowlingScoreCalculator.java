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
	
}
