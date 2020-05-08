package in.cg.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
		@Id
		private String adminId;
		@Column
		private String adminPass;
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Login(String adminId, String adminPass) {
			super();
			this.adminId = adminId;
			this.adminPass = adminPass;
		}
		public String getAdminId() {
			return adminId;
		}
		public void setAdminId(String adminId) {
			this.adminId = adminId;
		}
		public String getAdminPass() {
			return adminPass;
		}
		public void setAdminPass(String adminPass) {
			this.adminPass = adminPass;
		}
		
}
