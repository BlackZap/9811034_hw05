package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class calculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField Graphics;

	double Num;
	String SNum;
	String SNum_temp;
	int tempstate;
	public calculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 96, 20);
		contentPane.add(toolBar);
		
		/*上方顯示欄*/
		Graphics = new JTextField();
		Graphics.setHorizontalAlignment(SwingConstants.RIGHT);
		Graphics.setToolTipText("");
		Graphics.setText("0");
		Graphics.setBounds(10, 20, 450, 45);
		contentPane.add(Graphics);
		Graphics.setColumns(10);
		
		/*記憶功能*/
		JButton btnMsub = new JButton("M-");
		btnMsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMsub.setBounds(400, 75, 60, 30);
		contentPane.add(btnMsub);
		
		JButton btnMplus = new JButton("M+");
		btnMplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMplus.setBounds(335, 75, 60, 30);
		contentPane.add(btnMplus);
		
		JButton btnMs = new JButton("MS");
		btnMs.setBounds(270, 75, 60, 30);
		contentPane.add(btnMs);
				
		JButton btnMr = new JButton("MR");
		btnMr.setBounds(205, 75, 60, 30);
		contentPane.add(btnMr);
		
		JButton btnMc = new JButton("MC");
		btnMc.setBounds(140, 75, 60, 30);
		contentPane.add(btnMc);
		
		/*次方*/
		JButton btnSquare = new JButton("^1/2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f", Math.pow(Num,0.5)));
			}
		});
		btnSquare.setBounds(400, 110, 60, 30);
		contentPane.add(btnSquare);
		
		JButton btnPower = new JButton("x^y");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tempstate==0)
				SNum_temp = Graphics.getText();
				tempstate = 5;
				Graphics.setText("0");
			}
		});
		btnPower.setBounds(75, 110, 60, 30);
		contentPane.add(btnPower);
		
		JButton btnRec = new JButton("1/x");
		btnRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f", 1/Num));
			}
		});
		btnRec.setBounds(400, 180, 60, 30);
		contentPane.add(btnRec);
		
		/*變號*/
		JButton btnChanging = new JButton("\u00B1");
		btnChanging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f", -Num));
			}
		});
		btnChanging.setBounds(335, 110, 60, 30);
		contentPane.add(btnChanging);
		
		/*clean*/
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics.setText(String.format("0"));
				SNum="0";
				SNum_temp="0";
				tempstate=0;
			}
		});
		btnC.setBounds(270, 110, 60, 30);
		contentPane.add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics.setText(String.format("0"));
			}
		});
		btnCe.setBounds(205, 110, 60, 30);
		contentPane.add(btnCe);
		
		JButton btnShift = new JButton("<-");
		btnShift.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum = Graphics.getText();
				if(SNum.length()==1)
				Graphics.setText("0");
				else
				{SNum=SNum.substring(0,SNum.length()-1);
				Graphics.setText(SNum);}
			}
		});
		btnShift.setBounds(140, 110, 60, 30);
		contentPane.add(btnShift);
		
		/*數*/
		JButton btnn1 = new JButton("1");
		btnn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
				Graphics.setText(Graphics.getText()+"1");
				else
				Graphics.setText("1");
			}
		});
		btnn1.setBounds(140, 215, 60, 30);
		contentPane.add(btnn1);
		
		JButton btnn2 = new JButton("2");
		btnn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"2");
					else
					Graphics.setText("2");
			}
		});
		btnn2.setBounds(205, 215, 60, 30);
		contentPane.add(btnn2);
		
		JButton btnn3 = new JButton("3");
		btnn3.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"3");
					else
					Graphics.setText("3");
			}
		});
		btnn3.setBounds(270, 215, 60, 30);
		contentPane.add(btnn3);
		
		JButton btnn4 = new JButton("4");
		btnn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"4");
					else
					Graphics.setText("4");
			}
		});
		btnn4.setBounds(140, 180, 60, 30);
		contentPane.add(btnn4);
		
		JButton btnn5 = new JButton("5");
		btnn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"5");
					else
					Graphics.setText("5");
			}
		});
		btnn5.setBounds(205, 180, 60, 30);
		contentPane.add(btnn5);
		
		JButton btnn6 = new JButton("6");
		btnn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"6");
					else
					Graphics.setText("6");
			}
		});
		btnn6.setBounds(270, 180, 60, 30);
		contentPane.add(btnn6);
		
		JButton btnn7 = new JButton("7");
		btnn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"7");
					else
					Graphics.setText("7");
			}
		});
		btnn7.setBounds(140, 145, 60, 30);
		contentPane.add(btnn7);
		
		JButton btnn8 = new JButton("8");
		btnn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"8");
					else
					Graphics.setText("8");
			}
		});
		btnn8.setBounds(205, 145, 60, 30);
		contentPane.add(btnn8);
		
		JButton btnn9 = new JButton("9");
		btnn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"9");
					else
					Graphics.setText("9");
			}
		});
		btnn9.setBounds(270, 145, 60, 30);
		contentPane.add(btnn9);
		
		JButton btnn0 = new JButton("0");
		btnn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(Double.parseDouble(Graphics.getText()) != 0||SNum.indexOf(".")>=0)
					Graphics.setText(Graphics.getText()+"0");
					else
					Graphics.setText("0");
			}
		});
		btnn0.setBounds(140, 250, 125, 30);
		contentPane.add(btnn0);
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum =Graphics.getText();
				if(SNum.indexOf(".")<0)
				Graphics.setText(Graphics.getText()+".");
			}
		});
		btnDot.setBounds(270, 250, 60, 30);
		contentPane.add(btnDot);
		
		/*四則運算*/

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tempstate==0)
				SNum_temp = Graphics.getText();
				tempstate = 1;
				Graphics.setText("0");
			}
		});
		btnPlus.setBounds(335, 250, 60, 30);
		contentPane.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tempstate==0)
				SNum_temp = Graphics.getText();
				tempstate = 2;
				Graphics.setText("0");
			}
		});
		btnSub.setBounds(335, 215, 60, 30);
		contentPane.add(btnSub);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tempstate==0)
				SNum_temp = Graphics.getText();
				tempstate = 3;
				Graphics.setText("0");
			}
		});
		btnMulti.setBounds(335, 180, 60, 30);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tempstate==0)
				SNum_temp = Graphics.getText();
				tempstate = 4;
				Graphics.setText("0");
			}
		});
		btnDiv.setBounds(335, 145, 60, 30);
		contentPane.add(btnDiv);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Num/100));
			}
		});
		btnPercent.setBounds(400, 145, 60, 30);
		contentPane.add(btnPercent);
		
		JButton btnEqu = new JButton("=");
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SNum = Graphics.getText();
				switch(tempstate)
				{
				case 0:break;
				case 1:Graphics.setText(String.format("%f",Double.parseDouble(SNum)+Double.parseDouble(SNum_temp)));
				tempstate=0;break;
				case 2:Graphics.setText(String.format("%f",Double.parseDouble(SNum)-Double.parseDouble(SNum_temp)));
				tempstate=0;break;
				case 3:Graphics.setText(String.format("%f",Double.parseDouble(SNum)*Double.parseDouble(SNum_temp)));
				tempstate=0;break;
				case 4:Graphics.setText(String.format("%f",Double.parseDouble(SNum)/Double.parseDouble(SNum_temp)));
				tempstate=0;break;
				case 5:Graphics.setText(String.format("%f",Math.pow(Double.parseDouble(SNum),Double.parseDouble(SNum_temp))));
				tempstate=0;break;
				}
			}
		});
		btnEqu.setBounds(400, 215, 60, 65);
		contentPane.add(btnEqu);
		
		/*工程*/
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.cos(Num)));
			}
		});
		btnCos.setBounds(75, 180, 60, 30);
		contentPane.add(btnCos);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.cosh(Num)));
			}
		});
		btnCosh.setBounds(10, 180, 60, 30);
		contentPane.add(btnCosh);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.tan(Num)));
			}
		});
		btnTan.setBounds(75, 215, 60, 30);
		contentPane.add(btnTan);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.sin(Num)));
			}
		});
		btnSin.setBounds(75, 145, 60, 30);
		contentPane.add(btnSin);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.sinh(Num)));
			}
		});
		btnSinh.setBounds(10, 145, 60, 30);
		contentPane.add(btnSinh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.tanh(Num)));
			}
		});
		btnTanh.setBounds(10, 215, 60, 30);
		contentPane.add(btnTanh);
		
		JButton btnPi = new JButton("pi");
		btnPi.setBounds(10, 110, 60, 30);
		contentPane.add(btnPi);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.log(Num)/Math.log(10)));
			}
		});
		btnLog.setBounds(75, 250, 60, 30);
		contentPane.add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num = Double.parseDouble(Graphics.getText());
				Graphics.setText(String.format("%f",  Math.log(Num)));
			}
		});
		btnLn.setBounds(10, 250, 60, 30);
		contentPane.add(btnLn);
	}
}
