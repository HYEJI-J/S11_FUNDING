package kh.s11.fun.member.model;

public class MemberVo {
//	ID      NOT NULL VARCHAR2(20)  
//	PWD     NOT NULL VARCHAR2(20)  
//	NAME    NOT NULL VARCHAR2(60)  
//	EMAIL   NOT NULL VARCHAR2(100) 
//	ADDRESS          VARCHAR2(100) 
//	PHONE            CHAR(11)      
//	AGREE   NOT NULL NUMBER        
//	ADMIN   NOT NULL CHAR(1)   
		private String id;
		private String pwd;
		private String name;
		private String email;
		private String address;;
		private String phone;
		private int agree;
		private String admin;
		public MemberVo() {
			super();
		}
		@Override
		public String toString() {
			return "MemberVo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", address="
					+ address + ", phone=" + phone + ", agree=" + agree + ", admin=" + admin + "]";
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public int getAgree() {
			return agree;
		}
		public void setAgree(int agree) {
			this.agree = agree;
		}
		public String getAdmin() {
			return admin;
		}
		public void setAdmin(String admin) {
			this.admin = admin;
		}
		
}
