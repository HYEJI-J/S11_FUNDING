package kh.s11.kd.member.model;

public class MemberVo {
//	CREATE TABLE "MEMBER" (
//			"ID"	VARCHAR2(20)		NOT NULL,
//			"NAME"	VARCHAR2(60)		NOT NULL,
//			"PWD"	VARCHAR2(20)		NOT NULL,
//			"EMAIL"	VARCHAR2(100)		NOT NULL,
//			"ADDRESS"	VARCHAR2(100)		NOT NULL,
//			"PHONENUM"	CHAR(11)		NULL
//		);

		private String id;
		private String name;
		private String pwd;
		private String email;
		private String address;
		private int phonenum;
		
		public MemberVo() {
			super();
		}
		@Override
		public String toString() {
			return "MemberVo [id=" + id + ", name=" + name + ", pwd=" + pwd + ", email=" + email + ", address="
					+ address + ", phonenum=" + phonenum + "]";
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getPhonenum() {
			return phonenum;
		}
		public void setPhonenum(int phonenum) {
			this.phonenum = phonenum;
		}
		
		
}
