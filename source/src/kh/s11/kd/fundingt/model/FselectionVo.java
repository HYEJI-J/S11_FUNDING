package kh.s11.kd.fundingt.model;

public class FselectionVo {
//	FNO    NOT NULL NUMBER 
//	FUNNO  NOT NULL NUMBER 
//	ADDFUN          NUMBER 
	private int fno;
	private int funno;
	private int addfun;
	
	
	public FselectionVo() {
		super();
	}
	@Override
	public String toString() {
		return "FselectionVo [fno=" + fno + ", funno=" + funno + ", addfun=" + addfun + "]";
	}
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public int getFunno() {
		return funno;
	}
	public void setFunno(int funno) {
		this.funno = funno;
	}
	public int getAddfun() {
		return addfun;
	}
	public void setAddfun(int addfun) {
		this.addfun = addfun;
	}
	
	
}
