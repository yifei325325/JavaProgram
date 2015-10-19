/**
 * ArrayList ��Ӧ����ϰ
 */
package com.oct.seventeenth;
import java.util.*;
import java.io.*;
public class EmpSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		EmpManagement em = new EmpManagement();
		while(true){
			System.out.println("��ѡ����Ҫ�����Ĳ˵�");
			System.out.println("1�����Ա��");
			System.out.println("2����ʾĳ��Ա����Ϣ");
			System.out.println("3���޸�Ա��нˮ");
			System.out.println("4��ɾ��Ա��");
			System.out.println("5����ʾ����Ա����Ϣ");
			System.out.println("6���˳�ϵͳ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String choice = br.readLine();
			
			switch (choice) {
//			����һ��Ա��
			case "1":
				System.out.println("������Ա����ţ�");
				String empNo1 = br.readLine();
				System.out.println("������Ա��������");
				String name = br.readLine();
				System.out.println("������Ա�����ʣ�");
				float sal = Float.parseFloat(br.readLine());
				
				em.addEmp(empNo1,name,sal);
				break;
//			��ʾԱ����Ϣ	
			case "2":
				System.out.println("������Ա����ţ�");
				String empNo2 = br.readLine();
				em.showEmpInfo(empNo2);
				
				break;
//			�޸�Ա��нˮ
			case "3":
				System.out.println("������Ա����ţ�");
				String empNo3 = br.readLine();
				System.out.println("������Ա���µĹ��ʣ�");
				float newSal = Float.parseFloat(br.readLine()) ;
				
				em.modifySal(empNo3, newSal);
			
				break;
//			ɾ��Ա��
			case "4":
				System.out.println("������Ա����ţ�");
				String empNo4 = br.readLine();
				em.delEmp(empNo4);
				break;
			case "5":
				em.showAllEmpInfo();
				break;
//			�˳�ϵͳ	
			case "6":
				System.out.println("�ټ���");
				System.exit(0);;

			}
			
		}
	}

}

//�����Ա��
class EmpManagement{
	private ArrayList al = null;
	public EmpManagement(){
		al = new ArrayList();
	}
	
//	�¼���һ����Ա
	public void addEmp(String empNo,String name,float sal){
		Emp emp = new Emp(empNo, name, sal);
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
			}
		}
	}

//		�޸Ĺ���
	public void modifySal(String empNo, float newSal){
		for(int i=0;i<al.size();i++){
//			����ȡ�������е�ÿһ��Ԫ�أ�Emp ����
			Emp emp = (Emp)al.get(i);
			
			if(emp.getEmpNo().equals(empNo)){
//				�޸�нˮ
				emp.setSal(newSal);
			}
		}
	}
	
//	ɾ����Ա
	public void delEmp(String empNo){
		for(int i=0;i<al.size();i++){
//			����ȡ�������е�ÿһ��Ԫ�أ�Emp ����
			Emp emp = (Emp)al.get(i);
			
			if(emp.getEmpNo().equals(empNo)){
//				ɾ����Ա
				al.remove(i);
			}
		}
		
	}
	
//��ʾ���й�Ա��Ϣ
	public void showAllEmpInfo(){
		for(int i=0;i<al.size();i++){
			Emp emp =(Emp)al.get(i);
			System.out.println("���ţ�"+emp.getEmpNo());
			System.out.println("������"+emp.getName());
			System.out.println("нˮ��"+emp.getSal());
			
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