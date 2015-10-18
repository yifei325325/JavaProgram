/**
 * ArrayList 的应用练习
 */
package com.oct.seventeenth;
import java.util.*;
public class EmpSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

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