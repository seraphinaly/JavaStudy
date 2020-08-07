package com.sist.data;

public class BaseballVO {
	private int mno;//메뉴 순서
	private int cno;//카테고리 순서
	private String poster;
    private String teamName;
    private int gameNo;
    private int win;
    private int lose;
    private int draw;
    private double winRatio;
    private double gap;
    private String continuity;
    private double outBase;
    private double longHit;
    private String currentTen;
    
    
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getGameNo() {
		return gameNo;
	}
	public void setGameNo(int gameNo) {
		this.gameNo = gameNo;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public double getWinRatio() {
		return winRatio;
	}
	public void setWinRatio(double winRatio) {
		this.winRatio = winRatio;
	}
	public double getGap() {
		return gap;
	}
	public void setGap(double gap) {
		this.gap = gap;
	}
	public String getContinuity() {
		return continuity;
	}
	public void setContinuity(String continuity) {
		this.continuity = continuity;
	}
	public double getOutBase() {
		return outBase;
	}
	public void setOutBase(double outBase) {
		this.outBase = outBase;
	}
	public double getLongHit() {
		return longHit;
	}
	public void setLongHit(double longHit) {
		this.longHit = longHit;
	}
	public String getCurrentTen() {
		return currentTen;
	}
	public void setCurrentTen(String currentTen) {
		this.currentTen = currentTen;
	}
    
    

}