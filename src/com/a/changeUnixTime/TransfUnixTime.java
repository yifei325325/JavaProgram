package com.a.changeUnixTime;

import javax.swing.*;

public class TransfUnixTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			long number1 = System.currentTimeMillis()%10;
	//		System.out.println(number1);
			long number2 = System.currentTimeMillis()*7%10;
	//		System.out.println(number2);
			String aa = String.valueOf(number1);
			String bb = String.valueOf(number2);
	//		String cc = aa+" + "+bb;
	//		System.out.println(cc);
					
			
			String str = JOptionPane.showInputDialog(null,"请计算"+ aa+ " + " +bb +"= ?","加法练习",JOptionPane.QUESTION_MESSAGE);
			int result = Integer.parseInt(str);
			if (result == number1+number2){
				JOptionPane.showMessageDialog(null, "回答正确");
			}else{
				JOptionPane.showMessageDialog(null, "回答错误！！！");
				
			}
		}
	}

}
