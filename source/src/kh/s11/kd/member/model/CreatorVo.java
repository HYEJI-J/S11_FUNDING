package kh.s11.kd.member.model;

public class CreatorVo {
//	CNO   NOT NULL NUMBER        
//	ID    NOT NULL VARCHAR2(20)  
//	CNAME NOT NULL VARCHAR2(60)  
//	CINFO          VARCHAR2(900) 
	private int cno;
	private String id;
	private String cname;
	private String cinfo;
	public CreatorVo() {
		super();
	}
	@Override
	public String toString() {
		return "CreatorVo [cno=" + cno + ", id=" + id + ", cname=" + cname + ", cinfo=" + cinfo + "]";
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCinfo() {
		return cinfo;
	}
	public void setCinfo(String cinfo) {
		this.cinfo = cinfo;
	}

}
