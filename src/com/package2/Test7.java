package com.package2;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 3){
			System.out.println("参数值少于3个，程序退出！");
			return;
		}
		else{
			for(int i=0;i<args.length;i++){
				System.out.println(args[i]);
			}
		}
	}

}
