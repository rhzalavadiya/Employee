package employeeData;

public class employeePersonalInfo {
	
	String name, email;
	int mobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "employeePersonalInfo [name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}
