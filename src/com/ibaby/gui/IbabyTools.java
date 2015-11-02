/**
 * iBabyTools GUI布局
 */
package com.ibaby.gui;
import java.awt.*;
import javax.swing.*;

public class IbabyTools extends JFrame {
	JPanel leftUp,rightUp,bottom;
	JTextField displayLocalIp;
	JLabel camTypeLabel,iBabyLabsLable;
	JList<String> searchResult,opertionResult;
	JScrollBar searchResultSB,opertionResultSB;
	JRadioButton m6,h1;
	JCheckBox selectAllBox;
	JButton searchButton,updateButton,checkversionButton;
	String hostIP = "10.0.0.2";
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IbabyTools ibt = new IbabyTools();

	}
	//构建组件
	public IbabyTools() {
//		3个panel
		leftUp = new JPanel();
		rightUp  = new JPanel();
		bottom = new JPanel();
		
//		显示本机IP地址的文本框
		displayLocalIp = new JTextField();
		displayLocalIp.setBorder(null);
		displayLocalIp.setText("本机的IP地址是："+hostIP);
		displayLocalIp.setEditable(false);
		
		//显示搜索结果的文本框
		searchResult = new JList<String>();
		
		
		
		this.add(displayLocalIp);
		this.setTitle("iBabyTools V1.0");
		this.setLocation(100,100);
		this.setSize(520,650);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
