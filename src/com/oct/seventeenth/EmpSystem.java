/**
 * ArrayList ��Ӧ����ϰ
 */
package com.oct.seventeenth;
import java.util.*;
public class EmpSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp emp1 = new Emp("LS001", "�ν�", 1000.23f);
		Emp emp2 = new Emp("LS002", "¬����", 1300.23f);
		Emp emp3 = new Emp("LS003", "����", 1230.23f);
		Emp emp4 = new Emp("LS004", "�ֳ�", 1890.23f);
		
		EmpManagement em = new EmpManagement();
		em.addEmp(emp1);
		em.addEmp(emp2);
		em.addEmp(emp3);
		em.addEmp(emp4);
		em.showEmpInfo("LS003");

	}

}
//�����Ա��
class EmpManagement{
	private ArrayList al = null;
	public EmpManagement(){
		al = new ArrayList();
	}
//	�¼���һ����Ա
	public void addEmp(Emp emp){
		al.add(emp);
	}
//	��ʾ��Ա��Ϣ
	public void showEmpInfo(String empNo){
		for(int i=0;i<al.size();i++){
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				System.out.println("�ù�Ա����Ϣ���£�");
				System.out.println("Ա����ţ�"+empNo);
				System.out.println("Ա��������"+emp.getName());
				System.out.println("Ա�����ʣ�"+emp.getSal());
				break;
			}else{
				System.out.println("�޴˼�¼��");
			}
		}
	}
}
//��Ա��
class Emp{
	private String empNo;
	private String name;
	private float sal;
//	���췽��
	public Emp(String empNo,String name,float sal){
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
	}
//	get��set����
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