package kh.s11.kd.project.model;

public class ProjectVo {

//	CREATE TABLE "PROJECT" (
//			"PNO"	NUMBER		NOT NULL,
//			"CATEGORYNUM2"	NUMBER		NOT NULL,
//			"PLTITLE"	VARCHAR2(100)		NOT NULL,
//			"PSTITLE"	VARCHAR2(20)		NOT NULL,
//			"CATEGORYNUM"	NUMBER		NOT NULL,
//			"TGMONEY"	NUMBER		NOT NULL,
//			"SDAY"	DATE		NOT NULL,
//			"FDAY"	DATE		NOT NULL,
//			"PERIOD"	DATE		NOT NULL,
//			"DREMAIN"	NUMBER		NOT NULL,
//			"PERMISSION"	CHAR(1)		NOT NULL
//		);
	private int pno;
	private int categorynum2;
	private String pltitle;
	private String pstitle;
	private int categorynum;
	private int tgmoney;
	private int sday;
	private int fday;
	private int period;
	private int dremain;
	private String permission;
	@Override
	public String toString() {
		return "ProjectVo [pno=" + pno + ", categorynum2=" + categorynum2 + ", pltitle=" + pltitle + ", pstitle="
				+ pstitle + ", categorynum=" + categorynum + ", tgmoney=" + tgmoney + ", sday=" + sday + ", fday="
				+ fday + ", period=" + period + ", dremain=" + dremain + ", permission=" + permission + "]";
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getCategorynum2() {
		return categorynum2;
	}
	public void setCategorynum2(int categorynum2) {
		this.categorynum2 = categorynum2;
	}
	public String getPltitle() {
		return pltitle;
	}
	public void setPltitle(String pltitle) {
		this.pltitle = pltitle;
	}
	public String getPstitle() {
		return pstitle;
	}
	public void setPstitle(String pstitle) {
		this.pstitle = pstitle;
	}
	public int getCategorynum() {
		return categorynum;
	}
	public void setCategorynum(int categorynum) {
		this.categorynum = categorynum;
	}
	public int getTgmoney() {
		return tgmoney;
	}
	public void setTgmoney(int tgmoney) {
		this.tgmoney = tgmoney;
	}
	public int getSday() {
		return sday;
	}
	public void setSday(int sday) {
		this.sday = sday;
	}
	public int getFday() {
		return fday;
	}
	public void setFday(int fday) {
		this.fday = fday;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getDremain() {
		return dremain;
	}
	public void setDremain(int dremain) {
		this.dremain = dremain;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
}
