package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
	@Test
	public void testFrameScore2and6Return8() {
		BowlingGame bg = new BowlingGame();
		Frame frame = new Frame(2, 6);
		bg.addFrame(frame);
		assertEquals(8, frame.score());
	}
	
	@Test
	public void testGameOf10FramesReturn81() {
		BowlingGame bg = new BowlingGame();
		Frame frame0 = new Frame(1, 5);
		Frame frame1 = new Frame(3, 6);
		Frame frame2 = new Frame(7, 2);
		Frame frame3 = new Frame(3, 6);
		Frame frame4 = new Frame(4, 4);
		Frame frame5 = new Frame(5, 3);
		Frame frame6 = new Frame(3, 3);
		Frame frame7 = new Frame(4, 5);
		Frame frame8 = new Frame(8, 1);
		Frame frame9 = new Frame(2, 6);
		bg.addFrame(frame0);
		bg.addFrame(frame1);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		assertEquals(81, bg.score());
	}
	
	@Test
	public void testStrike() {
		BowlingGame bg = new BowlingGame();
		Frame frame = new Frame(10, 0);
		bg.addFrame(frame);
		assertTrue(frame.isStrike());
	}
	
	@Test
	public void testStrikeScore() {
		BowlingGame bg = new BowlingGame();
		Frame frame0 = new Frame(10, 0);
		bg.addFrame(frame0);
		Frame frame1 = new Frame(3, 6);
		bg.addFrame(frame1);
		assertEquals(28, bg.score());
	}
	
	@Test
	public void testSpare() {
		BowlingGame bg = new BowlingGame();
		Frame frame = new Frame(9, 1);
		bg.addFrame(frame);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void testSpareScore() {
		BowlingGame bg = new BowlingGame();
		Frame frame0 = new Frame(1, 9);
		bg.addFrame(frame0);
		Frame frame1 = new Frame(3, 6);
		bg.addFrame(frame1);
		assertEquals(22, bg.score());
	}
	
	@Test
	public void testStrikeAndSpareReturn103() {
		BowlingGame bg = new BowlingGame();
		Frame frame0 = new Frame(10, 0);
		Frame frame1 = new Frame(4, 6);
		Frame frame2 = new Frame(7, 2);
		Frame frame3 = new Frame(3, 6);
		Frame frame4 = new Frame(4, 4);
		Frame frame5 = new Frame(5, 3);
		Frame frame6 = new Frame(3, 3);
		Frame frame7 = new Frame(4, 5);
		Frame frame8 = new Frame(8, 1);
		Frame frame9 = new Frame(2, 6);
		bg.addFrame(frame0);
		bg.addFrame(frame1);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		assertEquals(103, bg.score());
	}
	
	@Test
	public void testMultipleStrikesReturn112() {
		BowlingGame bg = new BowlingGame();
		Frame frame0 = new Frame(10, 0);
		Frame frame1 = new Frame(10, 0);
		Frame frame2 = new Frame(7, 2);
		Frame frame3 = new Frame(3, 6);
		Frame frame4 = new Frame(4, 4);
		Frame frame5 = new Frame(5, 3);
		Frame frame6 = new Frame(3, 3);
		Frame frame7 = new Frame(4, 5);
		Frame frame8 = new Frame(8, 1);
		Frame frame9 = new Frame(2, 6);
		bg.addFrame(frame0);
		bg.addFrame(frame1);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		assertEquals(112, bg.score());
	}
	
	@Test
	public void testMultipleSparesReturn98() {
		BowlingGame bg = new BowlingGame();
		Frame frame0 = new Frame(8, 2);
		Frame frame1 = new Frame(5, 5);
		Frame frame2 = new Frame(7, 2);
		Frame frame3 = new Frame(3, 6);
		Frame frame4 = new Frame(4, 4);
		Frame frame5 = new Frame(5, 3);
		Frame frame6 = new Frame(3, 3);
		Frame frame7 = new Frame(4, 5);
		Frame frame8 = new Frame(8, 1);
		Frame frame9 = new Frame(2, 6);
		bg.addFrame(frame0);
		bg.addFrame(frame1);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		assertEquals(98, bg.score());
	}
	
	@Test
	public void testLastFrame() {
		BowlingGame bg = new BowlingGame();
		Frame frame0 = new Frame(1, 5);
		Frame frame1 = new Frame(3, 6);
		Frame frame2 = new Frame(7, 2);
		Frame frame3 = new Frame(3, 6);
		Frame frame4 = new Frame(4, 4);
		Frame frame5 = new Frame(5, 3);
		Frame frame6 = new Frame(3, 3);
		Frame frame7 = new Frame(4, 5);
		Frame frame8 = new Frame(8, 1);
		Frame frame9 = new Frame(2, 6);
		bg.addFrame(frame0);
		bg.addFrame(frame1);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		assertTrue(frame9.isLastFrame());
	}
}
