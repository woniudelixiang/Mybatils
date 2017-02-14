package model;

public class AscUserInfo {

	private String Id;
	private String userName; //用户名称
	private String password; //密码
	private Integer userType = 1;//用户类型：1为普通用户，2为标准用户，3为高级用户
	private Integer isDelete = 0;  // 是否删除   0未删除     1 已删除
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
}
