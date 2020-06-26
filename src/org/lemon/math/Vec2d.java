package org.lemon.math;

import java.awt.Point;

public class Vec2d {
	
	public double x;
	public double y;
	
	
	public Vec2d(Point point) {
		this.x = point.x;
		this.y = point.y;
	}
	
	
	public Vec2d(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	//adding vectors
	//formulae: new vec2d = ((x1+x1), (y1+y2))
	public Vec2d add(Vec2d v2) {
		double x = this.getX() + v2.getX();
		double y = this.getY() + v2.getY();
		return new Vec2d(x, y);
	}
	
	
	public Vec2d midpoint(Vec2d v2) {
		//add v2 with v1
		//this.add(v2);
		this.x = this.x + v2.x;
		this.y = this.y + v2.y;
		//multiply v1 with 1 and divide by 2
		double x = (1 * this.getX()) / 2;
		double y = (1 * this.getY()) / 2;
		
		return new Vec2d(x, y);
	}
	
	
	//magnitude of a vector
	//formulae: square root of x1 power 2 + x2 power 2
	public double mag() {
		double mag = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
		return mag;
	}
	
	
	public double dir() {
		return Math.atan(this.y / this.x);
	}
	
	//direction of a vector
	//formulae: -> res = y2-y1/x2-x1 -> atan(res) or tan-1(res)
	public double dir(Vec2d v2) {
		
		double dir = (v2.y - this.y) / (v2.x - this.x);
		double finaldir = Math.atan(dir);
		
		return finaldir;
	}
	
	
	
	//dist of two vectors
	//formulae: square root of x2 - x1 power of 2 + y2 - y2 power of 2
	public double dist(Vec2d v2) {
		double dist = Math.sqrt(Math.pow(v2.getX() - this.getX(), 2) + Math.pow((v2.getX() - this.getX()), 2));
		return dist;
	}

	
	public double getX() {
		return this.x;
	}

	
	public double getY() {
		return this.y;
	}

}
