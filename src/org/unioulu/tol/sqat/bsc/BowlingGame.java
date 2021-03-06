package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int score = 0;
		int j=0;
		Frame frame;
		for (int i=0; i<frames.size(); i++){
			frame = frames.get(i);
			score = score + frame.score();
			if (frame.isStrike()){
				j=0;
				while (frame.isStrike() && i+j<frames.size()){
					frame = frames.get(i+1);
					score = score + frame.score();
				}
			}
			else if (frame.isSpare()){
				j=0;
				while (frame.isSpare() && i+j<frames.size()){
					frame = frames.get(i+1);
					score = score + frame.getFirstThrow();
				}
			}
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
