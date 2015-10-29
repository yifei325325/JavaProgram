/**
 * 功能：下拉列表框、滚动框，列表框学习
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
		
		jl1 = new JLabel("你的籍贯");
		jl2 = new JLabel("旅游地点");
		
		String jg[] = {"北京","上海","广州","深圳","火星"};
		jcb = new JComboBox<String>(jg);
		
		String dd[] = {"九寨沟","故宫","长城","大梅沙","鹏城","峨眉山","华山","泰山"};
		jlist = new JList<String>(dd);
		jlist.setVisibleRowCount(4);
		
		jsp = new JScrollPane(jlist);	
		
//		添加组件
		
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
