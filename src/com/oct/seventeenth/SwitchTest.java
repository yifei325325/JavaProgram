package com.oct.seventeenth;

//import java.awt.RenderingHints.Key;
import java.io.*;

//import javax.swing.text.AbstractDocument.BranchElement;
public class SwitchTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("请输入一个数字：");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String num=br.readLine();
			
			switch (num) {
			case "1":
				System.out.println("1");
				
				break;
			case "5":
				System.out.println("5");
				
			default:
				System.out.println("没有这个数字！");
				break;
			}
			
		}
		

	}

}
