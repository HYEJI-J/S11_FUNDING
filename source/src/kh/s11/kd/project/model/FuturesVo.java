package kh.s11.kd.project.model;

public class FuturesVo {
//	FNO    NOT NULL NUMBER        
//	PNO    NOT NULL NUMBER        
//	FNAME  NOT NULL VARCHAR2(100) 
//	FPRICE NOT NULL NUMBER        
//	FSTOCK          NUMBER        
	
	private int fno;
	private int pno;
	private String fnmae;
	private int fprice;
	private int fstock;
	
	
	public FuturesVo() {
		super();
	}
	@Override
	public String toString() {
		return "FuturesVo [fno=" + fno + ", pno=" + pno + ", fnmae=" + fnmae + ", fprice=" + fprice + ", fstock="
				+ fstock + "]";
	}
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getFnmae() {
		return fnmae;
	}
	public void setFnmae(String fnmae) {
		this.fnmae = fnmae;
	}
	public int getFprice() {
		return fprice;
	}
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	public int getFstock() {
		return fstock;
	}
	public void setFstock(int fstock) {
		this.fstock = fstock;
	}
	
	

}
