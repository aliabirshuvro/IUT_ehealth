/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealth;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.JFrame;
public class Client extends Frame implements ActionListener,Runnable
{
 Button b;
 TextField tf;
 TextArea ta;
 Socket s;
 PrintWriter pw;
 BufferedReader br;
 Thread th;
 public Client()
 {
  JFrame f=new JFrame("Client");

  f.setLayout(new FlowLayout());

  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  f.setBackground(Color.orange);

  b=new Button("Send");

  b.addActionListener(this);

  tf=new TextField(15);

  ta=new TextArea(20,20);

  ta.setBackground(Color.cyan);

  f.add(ta);

  f.add(b);

  f.add(tf);

  try{

   s=new Socket("10.220.150.111",12000);

   br=new BufferedReader(new InputStreamReader(s.getInputStream()));

   pw=new PrintWriter(s.getOutputStream(),true);

  }catch(Exception e) 
  {
  }
  th=new Thread(this);

  th.start();

  setFont(new Font("Arial",Font.BOLD,20));

  f.setSize(200,200);
  f.setBounds(500, 500,500,500);
  f.setVisible(true);

  f.setLocation(100,300);

 
 }

 
 public void actionPerformed(ActionEvent ae)
 {
  pw.println(tf.getText());
  tf.setText("");
 }

 public void run()
 {
  while(true)
  {
   try{
    ta.append(br.readLine()+"\n");
   }catch(Exception e) {}
  }
 }
 public static void main(String args[])
 {
  Client client = new Client();
  
 }
}
 