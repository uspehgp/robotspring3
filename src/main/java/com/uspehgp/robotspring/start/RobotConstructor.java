package com.uspehgp.robotspring.start;

import com.uspehgp.robotspring.impls.sony.SonyHand;
import com.uspehgp.robotspring.impls.sony.SonyHead;
import com.uspehgp.robotspring.impls.toshiba.ToshibaLeg;


public class RobotConstructor {
	
	public static void main(String[] args){
		
		SonyHand sonyHand = new SonyHand();		
		ToshibaLeg toshibaLeg = new ToshibaLeg();		
		SonyHead sonyHead = new SonyHead();
		
		Robot robot = new Robot(sonyHand, toshibaLeg, sonyHead);
		
		robot.action();
		
		
	}

}
