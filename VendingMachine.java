import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VendingMachine extends JPanel implements ActionListener, Vending_Machine_Interface
{
   private int width = 660;
   private int height = 670;
   private int BorderWidth = 300;
   private int BorderHeight = 200;
   private int pointsBorderWidth = 150;
   private int pointsBorderHeight = 180;
   private int pointsBorderPositionX = 330;
   private int pointsBorderPositionY = 220;
   private int spaceBetweenPoints = 30;

   private double change1;
   private JTextField t;
   private static  JButton b0, b1,b2,b3,b4,b5,b6,b7,b8,b9,b10, bExit;
   private double change;
   private double change2;
   private int p;
   private int c = 100;
   private boolean rez;
   int j, j1, j2, j3, j4, j5, j6, j7, j8, j9, j10 ;
   public VendingMachine(int amountOfDrinks)
   {
      j1 = j2 = j3 = j4 = j5 = j6 = j7 = j8 = j9 = j10 = amountOfDrinks;
      j = 1 ;
      JFrame frame = new JFrame();
      t = new JTextField();
      frame.getContentPane().add( this );      
      frame.setTitle( "Vending Machine" );
      frame.setBackground(Color.black);
      frame.setSize( width, height );
      frame.setVisible( true );
      b1 = new JButton("6");
      b2 = new JButton("7");
      b3 = new JButton("8");
      b4 = new JButton("9");
      b5 = new JButton("10");
      b6 = new JButton("1");
      b7 = new JButton("2");
      b8 = new JButton("3");
      b9 = new JButton("4");
      b10 = new JButton("5");
      b0 = new JButton("0");
      bExit = new JButton("Change");
      b1.setBounds( 330 + 0, 220 + 30 - 25, 50, 30 );
      b2.setBounds( 330 + 0, 220 + 30 * 2 - 25, 50, 30 );
      b3.setBounds( 330 + 0, 220 + 30 * 3 - 25, 50, 30 );
      b4.setBounds( 330 + 0, 220 + 30 * 4 - 25, 50, 30 );
      b5.setBounds( 330 + 0, 220 + 30 * 5 - 25, 50, 30 );
      b6.setBounds( 0, 220 + 30 - 25, 50, 30 );
      b7.setBounds( 0, 220 + 30 * 2 - 25, 50, 30  );
      b8.setBounds( 0, 220 + 30 * 3 - 25, 50, 30  );
      b9.setBounds( 0, 220 + 30  * 4 - 25, 50, 30 );
      b10.setBounds(0, 220 + 30  * 5 - 25, 50, 30 ); 
      bExit.setBounds(460, 500, 100, 30); 
      b0.setBounds(0, 400, 50, 30); 
      t.setBounds(140, 456,130,30);
      b1.setBackground(Color.black);
      b2.setBackground(Color.black);
      b3.setBackground(Color.black);
      b4.setBackground(Color.black);
      b5.setBackground(Color.black);
      b6.setBackground(Color.black);
      b7.setBackground(Color.black);
      b8.setBackground(Color.black);
      b9.setBackground(Color.black);
      b10.setBackground(Color.black);
      b1.setForeground(Color.white);
      b2.setForeground(Color.white);
      b3.setForeground(Color.white);
      b4.setForeground(Color.white);
      b5.setForeground(Color.white);
      b6.setForeground(Color.white);
      b7.setForeground(Color.white);
      b8.setForeground(Color.white);
      b9.setForeground(Color.white);
      b10.setForeground(Color.white);
      bExit.setBackground(Color.black);
      bExit.setForeground(Color.white);
      b0.setBackground(Color.black);
      b0.setForeground(Color.red);
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
      add(b6);
      add(b7);
      add(b8);
      add(b9);
      add(b10);
      add(bExit);
      add(t);
      add(b0);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b10.addActionListener(this);
      bExit.addActionListener(this);
      b0.addActionListener(this);
      change=0;
      change2=0;
      frame.setResizable(false);
   }     
   public double insertMoney()
   {
      String var = "0.0";
      var = t.getText();
      change =Double.parseDouble(var);
      System.out.println(change);
      return change ;
   }
   public boolean askForCoffee()
   {
      if(change == change2)
      {rez = false;}
      else
      {rez = true;
         if(change != 0)
         {
            JOptionPane.showMessageDialog(null, "Your drink is ready. Please press the \"Change\" button to get the change");
         }
      }
      return rez;
   }
   public void paintComponent( Graphics g )
   {   
      g.setColor( Color.black );
      g.fillRect( 0, 0, width, height );
      g.setColor( Color.white );
      g.setFont( new Font( "Monotype Corsiva", Font.BOLD, 25 ) );
      g.drawString( "Vending Machine" , 250, 40 );
      g.setFont( new Font( "TimesRoman", Font.BOLD, 20 ) );
      g.drawString( "Here you can choose what you want coffe or tea!" , 140, 100 );
      this.money( g );
      this.menu( g );
   }
   private void money( Graphics pen )
   {
      int borderPositionX = 15;
      int borderPositionY = 100;
      double money = change ;
      double output = change2 ;
      pen.setColor(Color.white);
      pen.fillRect( 20, 455, 290, 30);
      pen.fillRect( 335, 455, 290, 30);
      pen.setColor( Color.black );
      pen.drawString("Input Money:                            $", 25, 475);
      pen.drawString("Output Money: " + output + " $" , 340, 475);
      this.repaint();
   }
   private void menu( Graphics pen )
   {  
      pen.setColor( Color.white );
      pen.setFont( new Font( "TimesRoman", Font.BOLD, 16 ) );
      pen.drawString( "          Expresso...............................1.80 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints );
      pen.drawString( "          Cappuccino...........................1.60 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 2 );
      pen.drawString( "          Macchiato............................1.70 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 3 );
      pen.drawString( "          Caffe Amerincano................1.40 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 4 );
      pen.drawString( "          Cafe Latte..........................2.00 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 5 );
      pen.drawString( "          Camomil Tea............................1.20 $", 20, pointsBorderPositionY + spaceBetweenPoints  );
      pen.drawString( "          Green Tea................................1.30 $", 20, pointsBorderPositionY + spaceBetweenPoints * 2  );
      pen.drawString( "          Mint Tea..................................1.90 $", 20, pointsBorderPositionY + spaceBetweenPoints * 3  );
      pen.drawString( "          Ginger Tea...............................2.00 $", 20, pointsBorderPositionY + spaceBetweenPoints  * 4 );
      pen.drawString( "          Black Tea.................................1.50 $", 20, pointsBorderPositionY + spaceBetweenPoints  * 5 );
      pen.setColor( Color.yellow );
      pen.setFont( new Font( "TimesRoman", Font.BOLD, 45 ) );
      pen.drawString("MENU" , 250,200);
      pen.setColor(Color.red);
      pen.setFont( new Font( "TimesRoman", Font.BOLD, 16 ) );
      pen.drawString(" If you change you mind, please press 0 to cancel the proces!", 50, 420);
   }
 public void actionPerformed(ActionEvent e)
   {
      if(j>0) 
      {  
         if(e.getSource() == b6)
         {  
         insertMoney(); 
            change1 = change;
            if(j1 > 0)
            {
               if( change >= 1.2)
               {
                  change2 = change -1.2;
                  j=j-1;
                  j1 = j1 - 1;
               }
               else
               {
                  System.out.println("you don't have enough money");
                  change2 = change ; 
                  JOptionPane.showMessageDialog(null, "false you don't have enough money");
               }
            }
            else 
            {
               JOptionPane.showMessageDialog(null, "false, No more Camomil Tea In Machine");
               JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
            }
         }
         else
            if(e.getSource() == b7)
            {   insertMoney();
               if(j2>0)
               {
                  if(change >= 1.3)
                  {
                     change2 = change - 1.30;
                     j=j-1;
                     j2 = j2 -1;
                  }
                  else 
                  {
                     System.out.println("you don't have enough money");  
                     change2 = change ;
                     JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                  }
               }
               else 
               {
                  JOptionPane.showMessageDialog(null, " No more Green Tea In Machine");
                  JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
               }
            }
            else
               if(e.getSource() == b8)
               {  insertMoney();
                  if(j3 > 0)
                  {
                     if(change >= 1.90)
                     {
                        change2 = change - 1.9;
                        j=j-1;
                        j3 = j3 - 1;
                     }
                     else 
                     {
                        System.out.println("you don't have enough money");  
                        change2 = change ;
                        JOptionPane.showMessageDialog(null, " you don't have enough money");
                        
                     }
                  }
                  else 
                  {
                     JOptionPane.showMessageDialog(null, " No more Mint Tea In Machine");
                  JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                  }
               }
               else
                  if(e.getSource() == b9)
                  {   
                     if(j4 > 0)
                     {
                        insertMoney();
                        if(change >= 2.00)
                        {
                           change2 = change - 2.00;
                           j=j-1;
                           j4 = j4 - 1;
                        }
                        else 
                        {
                           System.out.println("you don't have enough money");  
                           change2 = change ;
                           JOptionPane.showMessageDialog(null, "you don't have enough money");
                        }
                     }
                     else 
                     {
                        JOptionPane.showMessageDialog(null, " No more Ginger Tea In Machine");
                  JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                     }
                  }
                  else
                     if(e.getSource() == b10)
                     {  
                        if(j5>0)
                        { 
                           insertMoney();
                           if(change >= 1.50)
                           {
                              change2 = change - 1.50;
                              j=j-1;
                              j5 = j5-1;                           }
                           else 
                           {
                              System.out.println("you don't have enough money");  
                              change2 = change ;
                              JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                           }
                        }
                        else 
                        {
                           JOptionPane.showMessageDialog(null, "false, No more Black Tea In Machine");
                           JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                        }
                     }
                     else
                        if(e.getSource() == b1)
                        {  
                           if(j6>0)
                           { 
                              insertMoney();
                              if(change >= 1.80)
                              {
                                 change2 = change - 1.80;
                                 j=j-1;
                                 j6=j6-1;
                              }
                              else 
                              {
                                 System.out.println("you don't have enough money");  
                                 change2 = change ;
                                 JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                              }
                           }
                           else 
                           {
                              JOptionPane.showMessageDialog(null, "false, No more Expresso In Machine");
                              JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                           }
                        }
                        else
                           if(e.getSource() == b2)
                           {
                              if(j7>0)
                              {
                                 insertMoney();
                                 if(change >= 1.60)
                                 {
                                    change2 = change - 1.60;
                                    j=j-1;
                                    j7=j7-1;
                                 }
                                 else 
                                 {
                                    System.out.println("you don't have enough money");  
                                    change2 = change ;
                                    JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                                 }
                              }
                              else 
                              {
                                 JOptionPane.showMessageDialog(null, "false, No more Cappuccino In Machine");
                                 JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                              }
                           }
                           else
                              if(e.getSource() == b3)
                              { 
                                 if(j8>0)
                                 { 
                                    insertMoney();
                                    if(change >= 1.70)
                                    {
                                       change2 = change - 1.70;
                                       j=j-1;
                                       j8= j8-1;
                                    }
                                    else 
                                    {
                                       System.out.println("you don't have enough money");  
                                       change2 = change ;
                                       JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                                    }
                                 }
                                 else 
                                 {
                                    JOptionPane.showMessageDialog(null, "false, No more Macchiato In Machine");
                                    JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                                 }
                              }
                              else
                                 if(e.getSource() == b4)
                                 {
                                    if(j9>0)
                                    {
                                       insertMoney();
                                       if(change >= 1.40)
                                       {
                                          change2 = change - 1.40;
                                          j=j-1;
                                          j9= j9-1;
                                       }
                                       else 
                                       {
                                          System.out.println("you don't have enough money");  
                                          change2 = change ;
                                          JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                                       }
                                    }
                                    else 
                                    {
                                       JOptionPane.showMessageDialog(null, "false, No more Caffe Amerincano In Machine");
                                       JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                                    }
                                 }
                                 else
                                    if(e.getSource() == b5)
                                    {
                                       if(j10>0)
                                       {
                                          insertMoney();
                                          if(change >= 2.00)
                                          {
                                             change2 = change - 2.00;
                                             j=j-1;
                                             j10= j10-1;
                                          }
                                          else 
                                          {
                                             System.out.println("you don't have enough money");  
                                             change2 = change ;
                                             JOptionPane.showMessageDialog(null, "false you don't have enough money");
                                          }
                                       }
                                       else 
                                       {
                                          JOptionPane.showMessageDialog(null, "false, No more Cafe Latte In Machine");
                                          JOptionPane.showMessageDialog(null, "Select another drink , or press the \"0\" button to cancel the payment");
                                       }
                                    }
                                    else
                                       if(e.getSource() == b0)
                                       {   insertMoney();
                                          if(change >= 0.00)
                                          {
                                             change2 = change;
                                                j = 0;
                                             System.out.println("False, you press 0");
                                             JOptionPane.showMessageDialog(null, "Please press the \"Change\" button to get the change");
                                          }
                                       }
                                       else
                                          if(e.getSource() == bExit)
                                          {
                                             j = 1;
                                             change = 0;
                                             t.setText("");
                                             change2 = 0;
                                          }
         askForCoffee();
      }
      else
      {
         if(e.getSource() == bExit)
         {
            j = 1;
            change = 0;
            t.setText("");
            change2 = 0;
         }
      }
      if(j1<=0)
      {b6.setBackground(Color.red);}
      if(j2<=0)
      {b7.setBackground(Color.red);}
      if(j3<=0)
      {b8.setBackground(Color.red);}
      if(j4<=0)
      {b9.setBackground(Color.red);}
      if(j5<=0)
      {b10.setBackground(Color.red);}
      if(j6<=0)
      {b1.setBackground(Color.red);}
      if(j7<=0)
      {b2.setBackground(Color.red);}
      if(j8<=0)
      {b3.setBackground(Color.red);}
      if(j9<=0)
      {b4.setBackground(Color.red);}
      if(j10<=0)
      {b5.setBackground(Color.red);}
   }
   public static void main(String[] args)
   {
    new VendingMachine(3);
   } 
}