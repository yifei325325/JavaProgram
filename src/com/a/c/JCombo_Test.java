/**
 * ���ܣ������б�򡢹������б��ѧϰ
 */
package com.a.c;
import java.awt.*;

import javax.swing.*;

public class JCombo_Test extends JFrame{
	
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox<String> jcb;
	JList<String> jlist;
	JScrollPane jsp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JCombo_Test jct = new JCombo_Test();

	}
	
	public JCombo_Test() {
		// TODO Auto-generated constructor stub
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("��ļ���");
		jl2 = new JLabel("���εص�");
		
		String jg[] = {"����","�Ϻ�","����","����","����"};
		jcb = new JComboBox<String>(jg);
		
		String dd[] = {"��կ��","�ʹ�","����","��÷ɳ","����","��üɽ","��ɽ","̩ɽ"};
		jlist = new JList<String>(dd);
		jlist.setVisibleRowCount(4);
		
		jsp = new JScrollPane(jlist);	
		
//		������
		
		jp1.add(jl1);
		jp1.add(jcb);
		jp2.add(jl2);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		
		this.setLayout(new GridLayout(2,1));
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}
