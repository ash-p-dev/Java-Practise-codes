package com.springpractise.springdemo;

public class a {
private int x;
private b ob;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public b getOb() {
	return ob;
}
public void setOb(b ob) {
	this.ob = ob;
}
public a() {
	super();
	// TODO Auto-generated constructor stub
}
public a(int x, b ob) {
	super();
	this.x = x;
	this.ob = ob;
}
@Override
public String toString() {
	return "a [x=" + x + ", ob=" + ob + "]";
}

}
