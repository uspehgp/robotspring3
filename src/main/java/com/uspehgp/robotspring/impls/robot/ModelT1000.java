package com.uspehgp.robotspring.impls.robot;

import com.uspehgp.robotspring.interfaces.Hand;
import com.uspehgp.robotspring.interfaces.Head;
import com.uspehgp.robotspring.interfaces.Leg;
import com.uspehgp.robotspring.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean {

	private Hand hand;
	private Leg leg;
	private Head head;

	private String color;
	private int year;
	private boolean soundEnabled;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(String color, int year, boolean soundEnabled) {
		super();
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}
	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("can play sound: " + soundEnabled);
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	public Hand getHand() {
		return hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public Head getHead() {
		return head;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	private void initObject() {
		System.out.println("init!");
	}

	private void destroyObject() {
		System.out.println("destroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + " - method destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " - method init()");
	}
}