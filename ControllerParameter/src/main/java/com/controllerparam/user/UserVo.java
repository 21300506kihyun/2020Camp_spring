package com.controllerparam.user;

public class UserVo {
	private String a;
	private int b;
	
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
    public String toString(){
        return "userVO [a = " + a + ", b = " + b + "]";
    }

}