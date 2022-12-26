package kh.s11.fun.project.model;

public class CategoryVo {
//	CATENO     NOT NULL CHAR(20)      
//	CATENAME   NOT NULL VARCHAR2(100) 
//	DETAILCATE NOT NULL VARCHAR2(100) 
	private String cateno;
	private String catename;
	private String detailcate;
	
	
	public CategoryVo() {
		super();
	}
	@Override
	public String toString() {
		return "CategoryVo [cateno=" + cateno + ", catename=" + catename + ", detailcate=" + detailcate + "]";
	}
	public String getCateno() {
		return cateno;
	}
	public void setCateno(String cateno) {
		this.cateno = cateno;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	public String getDetailcate() {
		return detailcate;
	}
	public void setDetailcate(String detailcate) {
		this.detailcate = detailcate;
	}
	
	
}
