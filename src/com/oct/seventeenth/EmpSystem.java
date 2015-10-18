/**
 * ArrayList 的应用练习
 */
package com.oct.seventeenth;
import java.util.*;
public class EmpSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp emp1 = new Emp("LS001", "宋江", 1000.23f);
		Emp emp2 = new Emp("LS002", "卢俊义", 1300.23f);
		Emp emp3 = new Emp("LS003", "吴用", 1230.23f);
		Emp emp4 = new Emp("LS004", "林冲", 1890.23f);
		
		EmpManagement em = new EmpManagement();
		em.addEmp(emp1);
		em.addEmp(emp2);
		em.addEmp(emp3);
		em.addEmp(emp4);
		em.showEmpInfo("LS003");

	}

}
//管理雇员类
class EmpManagement{
	private ArrayList al = null;
	public EmpManagement(){
		al = new ArrayList();
	}
//	新加入一个雇员
	public void addEmp(Emp emp){
		al.add(emp);
	}
//	显示雇员信息
	public void showEmpInfo(String empNo){
		for(int i=0;i<al.size();i++){
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				System.out.println("该雇员的信息如下：");
				System.out.println("员工编号："+empNo);
				System.out.println("员工姓名："+emp.getName());
				System.out.println("员工工资："+emp.getSal());
				break;
			}else{
				System.out.println("无此记录！");
			}
		}
	}
}
//雇员类
class Emp{
	private String empNo;
	private String name;
	private float sal;
//	构造方法
	public Emp(String empNo,String name,float sal){
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
	}
//	get，set方法
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

}