/**
 * 1������ƶ������µ��¼��ļ���
 * 2���������µ��¼�����
 */
package com.a.e;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class TestEvent2 extends JFrame{
	MyPanel2 mp2 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEvent2 te2 = new TestEvent2();

	}
	public TestEvent2() {
		// TODO Auto-generated constructor stub
		mp2 = new MyPanel2();
		
		this.add(mp2);
//		ע�����
		this.addMouseListener(mp2);
		this.addKeyListener(mp2);
		this.addMouseMotionListener(mp2);
		this.addWindowListener(mp2);
		
		this.setSize(400,300);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
/**
 * MyPanel ��Ҫ�������¼���
 *1���������ʱ����ʾ��ǰ���λ�õ�����
 *2����ĳ������������ʱ����ʾ���ĸ�����������
 *3��֪�������ƶ�����ק
 *4��֪�����ڵĴ򿪺͹رյȲ���
 */
class MyPanel2 extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener{
	public void paint(Graphics g){
		super.paint(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar()+"��������");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����������Ϊ��x="+e.getX()+",y="+e.getY()+")");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��������Ϊ:��x="+e.getX()+",y="+e.getY()+")");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
		
	}
}
