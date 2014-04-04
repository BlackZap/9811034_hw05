package calculator;

import java.awt.EventQueue;
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


public class passwordcheck extends JFrame{
	String ckey;
	static boolean pass=false;
    public passwordcheck() {
    	
        getContentPane().setLayout(new FlowLayout());
        JLabel lb = new JLabel("¿é¤J±K½X ");
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
            	try {
					readpassword();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	String key=new String(pwd.getPassword());
            	if(ckey.equals(key))
            	{
            		JOptionPane.showMessageDialog(null,"±K½X¥¿½T");
            		pass=true;
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
            	else
            	JOptionPane.showMessageDialog(null,"±K½X¿ù»~");
            	//JOptionPane.showMessageDialog(null,ckey+key);
            	 //System.exit(0);
            }});
    }
    public void readpassword() throws IOException
    {
    	FileReader fr = new FileReader("password.txt");
        BufferedReader br = new BufferedReader(fr);
        ckey=br.readLine();
        //JOptionPane.showMessageDialog(null,ckey);
    	fr.close();

    }
    public static boolean getpass()
    {
    	return pass;
    }
}