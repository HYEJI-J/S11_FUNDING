package kh.s11.fun.project.model;

public class ProjectplanVo {
//			PNO         NOT NULL NUMBER         
//			PJINFO      NOT NULL VARCHAR2(2000) 
//			PJBUDGET    NOT NULL VARCHAR2(1000) 
//			PJSCHEDULE  NOT NULL VARCHAR2(1000) 
//			PJTEAMINFO  NOT NULL VARCHAR2(1000) 
//			FUTURESINFO NOT NULL VARCHAR2(1000) 
	private int pno;
	private String pjinfo;
	private String pjbudget;
	private String pjschedule;
	private String pjteaminfo;
	private String futruesinfo;
	public ProjectplanVo() {
		super();
	}
	@Override
	public String toString() {
		return "ProjectplanVo [pno=" + pno + ", pjinfo=" + pjinfo + ", pjbudget=" + pjbudget + ", pjschedule="
				+ pjschedule + ", pjteaminfo=" + pjteaminfo + ", futruesinfo=" + futruesinfo + "]";
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPjinfo() {
		return pjinfo;
	}
	public void setPjinfo(String pjinfo) {
		this.pjinfo = pjinfo;
	}
	public String getPjbudget() {
		return pjbudget;
	}
	public void setPjbudget(String pjbudget) {
		this.pjbudget = pjbudget;
	}
	public String getPjschedule() {
		return pjschedule;
	}
	public void setPjschedule(String pjschedule) {
		this.pjschedule = pjschedule;
	}
	public String getPjteaminfo() {
		return pjteaminfo;
	}
	public void setPjteaminfo(String pjteaminfo) {
		this.pjteaminfo = pjteaminfo;
	}
	public String getFutruesinfo() {
		return futruesinfo;
	}
	public void setFutruesinfo(String futruesinfo) {
		this.futruesinfo = futruesinfo;
	}
	
	

}
