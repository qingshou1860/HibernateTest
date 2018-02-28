package cn.itcast.entity;
/**
* @author 邹建
* @version 创建时间：2018年2月27日 上午9:29:02
* @ClassName 类名称
* @Description 类描述
*/
public class Department {
	private Integer deptno;
	private String dname;
	private String location;
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", location=" + location + "]";
	}
	

}
