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

public class calculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorGUI frame = new calculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 430, 20);
		contentPane.add(toolBar);
		
		textField = new JTextField();
		textField.setBounds(24, 20, 420, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		
		JButton btnSquare = new JButton("^1/2");
		btnSquare.setBounds(400, 110, 60, 30);
		contentPane.add(btnSquare);
		
		JButton btnMr = new JButton("MR");
		btnMr.setBounds(205, 75, 60, 30);
		contentPane.add(btnMr);
		
		JButton btnMc = new JButton("MC");
		btnMc.setBounds(140, 75, 60, 30);
		contentPane.add(btnMc);
		
		JButton btnchanging = new JButton("\u00B1");
		btnchanging.setBounds(335, 110, 60, 30);
		contentPane.add(btnchanging);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(270, 110, 60, 30);
		contentPane.add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(205, 110, 60, 30);
		contentPane.add(btnCe);
		
		JButton btnShift = new JButton("<-");
		btnShift.setBounds(140, 110, 60, 30);
		contentPane.add(btnShift);
		
		JButton btnn7 = new JButton("7");
		btnn7.setBounds(140, 145, 60, 30);
		contentPane.add(btnn7);
		
		JButton btnn8 = new JButton("8");
		btnn8.setBounds(205, 145, 60, 30);
		contentPane.add(btnn8);
		
		JButton btnn9 = new JButton("9");
		btnn9.setBounds(270, 145, 60, 30);
		contentPane.add(btnn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(335, 145, 60, 30);
		contentPane.add(btnDiv);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBounds(400, 145, 60, 30);
		contentPane.add(btnPercent);
		
		JButton btnRec = new JButton("1/x");
		btnRec.setBounds(400, 180, 60, 30);
		contentPane.add(btnRec);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setBounds(335, 180, 60, 30);
		contentPane.add(btnMulti);
		
		JButton btnn6 = new JButton("6");
		btnn6.setBounds(270, 180, 60, 30);
		contentPane.add(btnn6);
		
		JButton btnn5 = new JButton("5");
		btnn5.setBounds(205, 180, 60, 30);
		contentPane.add(btnn5);
		
		JButton btnn4 = new JButton("4");
		btnn4.setBounds(140, 180, 60, 30);
		contentPane.add(btnn4);
		
		JButton btnn1 = new JButton("1");
		btnn1.setBounds(140, 215, 60, 30);
		contentPane.add(btnn1);
		
		JButton btnn2 = new JButton("2");
		btnn2.setBounds(205, 215, 60, 30);
		contentPane.add(btnn2);
		
		JButton btnn3 = new JButton("3");
		btnn3.setBounds(270, 215, 60, 30);
		contentPane.add(btnn3);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(335, 215, 60, 30);
		contentPane.add(btnSub);
		
		JButton btnEqu = new JButton("=");
		btnEqu.setBounds(400, 215, 60, 65);
		contentPane.add(btnEqu);
		
		JButton btnn0 = new JButton("0");
		btnn0.setBounds(140, 250, 125, 30);
		contentPane.add(btnn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(270, 250, 60, 30);
		contentPane.add(btnDot);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(335, 250, 60, 30);
		contentPane.add(btnPlus);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(75, 180, 60, 30);
		contentPane.add(btnCos);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setBounds(10, 180, 60, 30);
		contentPane.add(btnCosh);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBounds(75, 215, 60, 30);
		contentPane.add(btnTan);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBounds(75, 145, 60, 30);
		contentPane.add(btnSin);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.setBounds(10, 145, 60, 30);
		contentPane.add(btnSinh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setBounds(10, 215, 60, 30);
		contentPane.add(btnTanh);
		
		JButton btnPower = new JButton("x^y");
		btnPower.setBounds(75, 110, 60, 30);
		contentPane.add(btnPower);
		
		JButton btnPi = new JButton("pi");
		btnPi.setBounds(10, 110, 60, 30);
		contentPane.add(btnPi);
		
		JButton btnLog = new JButton("log");
		btnLog.setBounds(75, 250, 60, 30);
		contentPane.add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.setBounds(10, 250, 60, 30);
		contentPane.add(btnLn);
	}
}
