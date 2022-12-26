package kh.s11.fun.fundingt.model;

public class FundingVo {
//	FUNNO     NOT NULL NUMBER        
//	ID        NOT NULL VARCHAR2(20)  
//	FADDRESS  NOT NULL VARCHAR2(100) 
//	RECIPIENT NOT NULL VARCHAR2(60)  
	private int funno;
	private String id;
	private String faddress;
	private String recipient;
	
	
	public FundingVo() {
		super();
	}
	@Override
	public String toString() {
		return "FundingVo [funno=" + funno + ", id=" + id + ", faddress=" + faddress + ", recipient=" + recipient + "]";
	}
	public int getFunno() {
		return funno;
	}
	public void setFunno(int funno) {
		this.funno = funno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFaddress() {
		return faddress;
	}
	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	
}
