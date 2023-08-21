/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zbattle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class Zbattle implements ActionListener{
     //declaring gui elements
    JFrame frame;
    JTextField textfield;
    JTextField field2;
    JTextField field3;
    JTextField turncount;
    JButton button1,button2,button3,button4,button5,button6;
    JButton button7,button8,button9,button10,button11,button12;
    JPanel panel;
    JPanel panel2;
    
    
    //set variables
    int health1 = 2000;
    int health2 = 2000;
    int atk1 = 300;
    int atk2 = 300;
    double turncounter = 1;
    
    //display gui
    Zbattle(){
    frame = new JFrame("Z BATTLE");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,800);
    frame.setLayout(null);
    
    Font font = new Font ("Arial",Font.BOLD,30);
    
    textfield = new JTextField();
    textfield.setBounds(50,25,900,50);
    textfield.setEditable(false);
    textfield.setFont(font);
    
    field2 = new JTextField();
    field2.setBounds(50,150,300,50);
    field2.setEditable(false);
    field2.setFont(font);
    
    
    field3 = new JTextField();
    field3.setBounds(50,450,300,50);
    field3.setEditable(false);
    field3.setFont(font);
    
    turncount = new JTextField();
    turncount.setBounds(500,700,50,50);
    turncount.setEditable(false);
    turncount.setFont(font);
            
    
    
    panel = new JPanel();
    panel.setBounds(50,200,900,200);
    panel.setLayout(new GridLayout(2,3,10,10));
    panel.setBackground(Color.red);
    
    panel2 = new JPanel();
    panel2.setBounds(50,500,900,200);
    panel2.setLayout(new GridLayout(2,3,10,10));
    panel2.setBackground(Color.red);
    
    button1 = new JButton("attack");  
    button2 = new JButton("heal");  
    button3 = new JButton("power up");  
    button4 = new JButton("barrier");  
    button5 = new JButton("devil force");  
    button6 = new JButton("bomb");  
    button7 = new JButton("attack");  
    button8 = new JButton("heal");  
    button9 = new JButton("power up");  
    button10 = new JButton("barrier");  
    button11 = new JButton("devil force");  
    button12 = new JButton("bomb");  
    
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    button10.addActionListener(this);
    button11.addActionListener(this);
    button12.addActionListener(this);
    
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);
    panel2.add(button7);
    panel2.add(button8);
    panel2.add(button9);
    panel2.add(button10);
    panel2.add(button11);
    panel2.add(button12);
    
    textfield.setText("ZBATTLE GAME player 1 start");
    field2.setText(field2.getText().concat(String.valueOf(health1)));
    field3.setText(field3.getText().concat(String.valueOf(health2)));
    turncount.setText(turncount.getText().concat(String.valueOf(turncounter)));;
    
    frame.add(panel);
    frame.add(panel2);
    frame.add(textfield);
    frame.add(field2);
    frame.add(field3);
    frame.add(turncount);
    frame.setVisible(true);
    
    if (health1 < 0){erase();textfield.setText("player 2 wins");}
    if (health2 < 0){erase();textfield.setText("player 1 wins");}
    //gui functions
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zbattle battle = new Zbattle();
        
       
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            attack1();
        }
        if(e.getSource()==button2){
            heal1();
        }
        if(e.getSource()==button3){
            powerup1();
        }
        if(e.getSource()==button4){
            barrier1();
        }
        if(e.getSource()==button5){
            devilforce1();
        }
        if(e.getSource()==button6){
            Bomb1();
        }
        //
        if(e.getSource()==button7){
            attack2();
        }
        if(e.getSource()==button8){
            heal2();
        }
        if(e.getSource()==button9){
            powerup2();
        }
        if(e.getSource()==button10){
            barrier2();
        }
        if(e.getSource()==button11){
            devilforce2();
        }
        if(e.getSource()==button12){
            Bomb2();
        }
    }
    //move variables
    boolean barrier1 = false; int barriercount =0;
    boolean barrier2 = false; int barriercount2 =0;
    int healpp1 = 2;int healpp2 = 2;
    int powerpp1 =2; int powerpp2 =2;
    boolean power1 = false; boolean power2 = false;
    int bomb1 = -1;int bomb2 =-1;
    int barrierpp1=2; int barrierpp2=2;
    
    //FUNCTIONS
    private void erase(){textfield.setText("");field2.setText("");field3.setText("");}
    private void update()
    {bomb1 = bomb1 -1;
    if(bomb1 == 0){atk1=atk1+100; health2 = health2 - atk1;atk1 =atk1-100;}
    field2.setText(field2.getText().concat(String.valueOf(health1)));
    field3.setText(field3.getText().concat(String.valueOf(health2)));
    turncounter = turncounter+0.5;
    turncount.setText(turncount.getText().concat(String.valueOf(turncounter)));
    barriercount = barriercount-1;
    
    
    
    
    }
    private void update2()
    {bomb2 = bomb2 -1;
    if(bomb2 == 0){atk2=atk2+100; health1 = health1 - atk2;atk2=atk2-100;}
    field2.setText(field2.getText().concat(String.valueOf(health1)));
    field3.setText(field3.getText().concat(String.valueOf(health2)));
    turncounter = turncounter+0.5;
    turncount.setText(turncount.getText().concat(String.valueOf(turncounter)));
     barriercount2 = barriercount2-1;
     if (barriercount2<=0){barrier2 = false;} if (barriercount<=0){barrier1 = false;}
    if (barrier2==false){atk1 = 300;} if (barrier1==false){atk2 = 300;} 
    if (barrier2 == true){atk1 = atk1/2;} if (barrier1 == true){atk2 = atk2/2;} 
    if (power2 == true){atk2 = atk2+200;} if (power1 == true){atk1 = atk1+200;} 
    
    }
    
    private void attack1(){
        erase();
        textfield.setText("player used attack. --player 2 turn");
        health2 = health2 - atk1;
        update();
    }
    private void heal1(){
        healpp1 = healpp1-1;
        if (healpp1<=0){button2.removeActionListener(this);button2.setBackground(Color.red);} 
        erase();
        textfield.setText("player used heal. --player 2 turn");
        health1 = health1 + 350;
        update();
    }
    private void powerup1(){
    powerpp1 = powerpp1-1;
    if (powerpp1<=0){button3.removeActionListener(this);button3.setBackground(Color.red);} 
    erase();
    textfield.setText("player used power up: +200 atk. --player 2 turn");
    power1 = true;
    update();
    }
    private void barrier1(){
        barrierpp1 = barrierpp1-1;
        if (healpp1<=0){button4.removeActionListener(this);button4.setBackground(Color.red);} 
        erase();
        textfield.setText("player used barrier --player 2 turn");
        barriercount = 2;
        barrier1 = true;
        update();          
    }
    private void devilforce1(){
    erase();
    textfield.setText("player use devil force. --player 2 turn");
    atk1 = atk1+200;
    health2 = health2-atk1;
    atk1 = atk1-200;
    health1 = health1-300;
    update();
    }
    private void Bomb1(){
       erase();
       textfield.setText("player use bomb. --player 2 turn");
        bomb1 = 3;
        update();
    }
    //player 2 functions
    private void attack2(){
        erase();
        textfield.setText("player used attack. --player 1 turn");
        health1 = health1 - atk2;
        update2();
    }
    private void heal2(){
        healpp2 = healpp2-1;
        if (healpp1<=0){button8.removeActionListener(this);button8.setBackground(Color.red);} 
        erase();
        textfield.setText("player used heal. --player 1 turn");
        health2 = health2 + 350;
        update2();
    }
    private void powerup2(){
    powerpp2 = powerpp2-1;
    if (powerpp2<=0){button9.removeActionListener(this);button9.setBackground(Color.red);} 
    erase();
    textfield.setText("player used power up: +200 atk. --player 1 turn");
    power2 = true;
    update2();
    }
    private void barrier2(){
        barrierpp2 = barrierpp2-1;
        if (healpp1<=0){button10.removeActionListener(this);button10.setBackground(Color.red);} 
        erase();
        textfield.setText("player used barrier --player 1 turn");
        barriercount2 = 2;
        barrier2 = true;
        update2();          
    }
    private void devilforce2(){
    erase();
    textfield.setText("player use devil force. --player 1 turn");
    atk2 = atk2+200;
    health1 = health1-atk2;
    atk2 = atk2-200;
    health2 = health2-300;
    update2();
    }
    private void Bomb2(){
       erase();
       textfield.setText("player use bomb. --player 1 turn");
        bomb2 = 3;
        update2();
    }
    
    
    
    
    
}
