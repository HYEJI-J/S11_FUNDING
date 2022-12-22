package kh.s11.kd.project.model;

import java.sql.Date;

public class ProjectVo {
//	이름         널?       유형            
//			---------- -------- ------------- 
//			PNO        NOT NULL NUMBER        
//			CNO        NOT NULL NUMBER        
//			CATENO     NOT NULL CHAR(20)      
//			PJTITLE    NOT NULL VARCHAR2(100) 
//			PJSTITLE   NOT NULL VARCHAR2(20)  
//			PJSUM      NOT NULL VARCHAR2(200) 
//			PJTAG               VARCHAR2(500) 
//			TGMONEY    NOT NULL NUMBER        
//			SDAY       NOT NULL DATE          
//			FDAY       NOT NULL DATE          
//			TDAY       NOT NULL DATE          
//			PERMISSION NOT NULL CHAR(1)      
	private int pno;
	private int cno;
	private String cateno;
	private String pjtitle;
	private String pjstitle;
	private String pjsum;
	private String pjtag;
	private int pgmoney;
	private Date sday;
	private Date fday;
	private Date tday;
	private String permission;
	
	
	
	public ProjectVo() {
		super();
	}
	@Override
	public String toString() {
		return "ProjectVo [pno=" + pno + ", cno=" + cno + ", cateno=" + cateno + ", pjtitle=" + pjtitle + ", pjstitle="
				+ pjstitle + ", pjsum=" + pjsum + ", pjtag=" + pjtag + ", pgmoney=" + pgmoney + ", sday=" + sday
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
	public int getPgmoney() {
		return pgmoney;
	}
	public void setPgmoney(int pgmoney) {
		this.pgmoney = pgmoney;
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
	public Date getTday() {
		return tday;
	}
	public void setTday(Date tday) {
		this.tday = tday;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	

}
