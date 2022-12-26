package kh.s11.fun.project.model;

public class PjfileVo {
//	PNO      NOT NULL NUMBER        
//	FILENAME          VARCHAR2(500) 
	private int pno;
	private String filename;
	
	
	public PjfileVo() {
		super();
	}
	@Override
	public String toString() {
		return "PjfileService [pno=" + pno + ", filename=" + filename + "]";
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	

}
