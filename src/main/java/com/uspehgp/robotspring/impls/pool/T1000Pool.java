package com.uspehgp.robotspring.impls.pool;

import java.util.Collection;

import com.uspehgp.robotspring.interfaces.Robot;
import com.uspehgp.robotspring.interfaces.RobotPool;

public class T1000Pool implements RobotPool {

	private Collection<Robot> robotCollection;

	public void setRobotCollection(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}

	@Override
	public Collection<Robot> getRobotCollection() {
		return robotCollection;
	}

	public void action() {
		for (Robot robot : robotCollection) {
			robot.action();
		}
	}

}
