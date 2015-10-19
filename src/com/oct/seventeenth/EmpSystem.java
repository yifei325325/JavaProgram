/**
 * ArrayList 的应用练习
 */
package com.oct.seventeenth;
import java.util.*;
import java.io.*;
public class EmpSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		EmpManagement em = new EmpManagement();
		while(true){
			System.out.println("请选择您要操作的菜单");
			System.out.println("1：添加员工");
			System.out.println("2：显示某个员工信息");
			System.out.println("3：修改员工薪水");
			System.out.println("4：删除员工");
			System.out.println("5：显示所有员工信息");
			System.out.println("6：退出系统");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String choice = br.readLine();
			
			switch (choice) {
//			增加一个员工
			case "1":
				System.out.println("请输入员工编号：");
				String empNo1 = br.readLine();
				System.out.println("请输入员工姓名：");
				String name = br.readLine();
				System.out.println("请输入员工工资：");
				float sal = Float.parseFloat(br.readLine());
				
				em.addEmp(empNo1,name,sal);
				break;
//			显示员工信息	
			case "2":
				System.out.println("请输入员工编号：");
				String empNo2 = br.readLine();
				em.showEmpInfo(empNo2);
				
				break;
//			修改员工薪水
			case "3":
				System.out.println("请输入员工编号：");
				String empNo3 = br.readLine();
				System.out.println("请输入员工新的工资：");
				float newSal = Float.parseFloat(br.readLine()) ;
				
				em.modifySal(empNo3, newSal);
			
				break;
//			删除员工
			case "4":
				System.out.println("请输入员工编号：");
				String empNo4 = br.readLine();
				em.delEmp(empNo4);
				break;
			case "5":
				em.showAllEmpInfo();
				break;
//			退出系统	
			case "6":
				System.out.println("再见！");
				System.exit(0);;

			}
			
		}
	}

}

//管理雇员类
class EmpManagement{
	private ArrayList al = null;
	public EmpManagement(){
		al = new ArrayList();
	}
	
//	新加入一个雇员
	public void addEmp(String empNo,String name,float sal){
		Emp emp = new Emp(empNo, name, sal);
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
			}
		}
	}

//		修改工资
	public void modifySal(String empNo, float newSal){
		for(int i=0;i<al.size();i++){
//			遍历取出数组中的每一个元素（Emp 对象）
			Emp emp = (Emp)al.get(i);
			
			if(emp.getEmpNo().equals(empNo)){
//				修改薪水
				emp.setSal(newSal);
			}
		}
	}
	
//	删除雇员
	public void delEmp(String empNo){
		for(int i=0;i<al.size();i++){
//			遍历取出数组中的每一个元素（Emp 对象）
			Emp emp = (Emp)al.get(i);
			
			if(emp.getEmpNo().equals(empNo)){
//				删除雇员
				al.remove(i);
			}
		}
		
	}
	
//显示所有雇员信息
	public void showAllEmpInfo(){
		for(int i=0;i<al.size();i++){
			Emp emp =(Emp)al.get(i);
			System.out.println("工号："+emp.getEmpNo());
			System.out.println("姓名："+emp.getName());
			System.out.println("薪水："+emp.getSal());
			
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