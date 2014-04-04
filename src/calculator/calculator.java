package calculator;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import calculator.calculatorGUI;
import calculator.password;

public class calculator {
	public static void main(String[] args) throws IOException {
		boolean pass=false;
		FileReader fr = new FileReader("password.txt");
        BufferedReader br = new BufferedReader(fr);
        if(!br.ready())
        {
        	JOptionPane.showMessageDialog(null,"第一次開啟\n請設定密碼");
        	fr.close();
        	new password();
        }
        else
        {
        	String key=br.readLine();
        	fr.close();
        	new passwordcheck();
        }
        //while (br.ready()) {
        //    System.out.println(br.readLine());
        //}
		
		
		
	}
}


