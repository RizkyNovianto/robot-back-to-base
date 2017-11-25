package org.robotbacktobase.ai.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.robotbacktobase.ai.service.Ai;
import org.robotbacktobase.ai.service.IAiActionOne;
import org.robotbacktobase.sprite.enums.RobotMovement;

public class BrokenAi implements Ai, IAiActionOne{

	private List<RobotMovement> robotGeneratedMoves = new ArrayList<RobotMovement>();
	
	@Override
	public void scanBoard() {
		
		//this ai broke, it does nothing
		//maybe you can fix it ?
	}

	@Override
	public void generateStep() {
		
		//this ai broke, it does nothing
		//maybe you can fix it ?
		
	}
	
	@Override
	public void runAction() {

		scanBoard();
		generateStep();
		
	}
	
	@Override
	public List<RobotMovement> getRobotGeneratedMoves() {
		
		return robotGeneratedMoves;
	}

	@Override
	public int getRobotRowPos() {
		
		return 0;
	}

	@Override
	public int getRoboColPos() {

		return 0;
	}


}
