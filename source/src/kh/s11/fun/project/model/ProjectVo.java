package kh.s11.fun.project.model;

import java.sql.Date;

public class ProjectVo {
//	PNO        NOT NULL NUMBER         
//	CNO        NOT NULL NUMBER         
//	CATENO     NOT NULL CHAR(20)       
//	PJTITLE    NOT NULL VARCHAR2(300)  
//	PJSTITLE   NOT NULL VARCHAR2(300)  
//	PJSUM      NOT NULL VARCHAR2(4000) 
//	PJTAG               VARCHAR2(500)  
//	TGMONEY    NOT NULL NUMBER         
//	SDAY       NOT NULL DATE           
//	FDAY       NOT NULL DATE           
//	TDAY       NOT NULL NUMBER         
//	PERMISSION NOT NULL CHAR(1)        
   
	private int pno;
	private int cno;
	private String cateno;
	private String pjtitle;
	private String pjstitle;
	private String pjsum;
	private String pjtag;
	private int tgmoney;
	private Date sday;
	private Date fday;
	private int tday;
	private String permission;
	
	public ProjectVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProjectVo [pno=" + pno + ", cno=" + cno + ", cateno=" + cateno + ", pjtitle=" + pjtitle + ", pjstitle="
				+ pjstitle + ", pjsum=" + pjsum + ", pjtag=" + pjtag + ", tgmoney=" + tgmoney + ", sday=" + sday
				+ ", fday=" + fday + ", tday=" + tday + ", permission=" + permission + "]";
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCateno() {
		return cateno;
	}

	public void setCateno(String cateno) {
		this.cateno = cateno;
	}

	public String getPjtitle() {
		return pjtitle;
	}

	public void setPjtitle(String pjtitle) {
		this.pjtitle = pjtitle;
	}

	public String getPjstitle() {
		return pjstitle;
	}

	public void setPjstitle(String pjstitle) {
		this.pjstitle = pjstitle;
	}

	public String getPjsum() {
		return pjsum;
	}

	public void setPjsum(String pjsum) {
		this.pjsum = pjsum;
	}

	public String getPjtag() {
		return pjtag;
	}

	public void setPjtag(String pjtag) {
		this.pjtag = pjtag;
	}

	public int getTgmoney() {
		return tgmoney;
	}

	public void setTgmoney(int tgmoney) {
		this.tgmoney = tgmoney;
	}

	public Date getSday() {
		return sday;
	}

	public void setSday(Date sday) {
		this.sday = sday;
	}

	public Date getFday() {
		return fday;
	}

	public void setFday(Date fday) {
		this.fday = fday;
	}

	public int getTday() {
		return tday;
	}

	public void setTday(int tday) {
		this.tday = tday;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
}
	
	
