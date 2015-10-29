/**
 * iBabyTools GUI布局
 */
package com.ibaby.gui;
import java.awt.*;
import javax.swing.*;

public class IbabyTools extends JFrame {
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
		// TODO Auto-generated constructor stub
//		显示本机IP地址的文本框
		displayLocalIp = new JTextField();
		displayLocalIp.setBorder(null);
		displayLocalIp.setText("本机的IP地址是："+hostIP);
		
		
		
		this.add(displayLocalIp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
