package com.kh.Student;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name =name;
		this.firstScore= firstScore;
		this.secondScore=secondScore;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
	//셋터는안쓴다??겟터셋터 자동완성!!
	//ToString은 출력용아님???
	
	
	
}
