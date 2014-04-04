package calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


public class password extends JFrame{
    public password() {
    	
        getContentPane().setLayout(new FlowLayout());
        JLabel lb = new JLabel("輸入密碼 ");
        final JPasswordField  pwd = new JPasswordField(12);
        this.add(lb);
        this.add(pwd);
        this.setVisible(true);
        this.setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pwd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	String key=new String(pwd.getPassword());
            	try {
					writepassword(key);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	JOptionPane.showMessageDialog(null,"登記成功 請重新啟動");
            	 System.exit(0);
            }});
    }
    public void writepassword(String key) throws IOException
    {
    	FileWriter fw = new FileWriter("password.txt");
    	        fw.write(key);
    	        fw.flush();
    	        fw.close();

    }
}