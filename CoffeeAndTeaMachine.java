import javax.swing.*;
import java.awt.*;
/** this is a vendind Machine when you put your Money ang give back your coffee or tea*/
public class CoffeeAndTeaMachine extends JPanel
{
   private int width;
   private int height;
   private int BorderWidth;
   private int BorderHeight;
   private int pointsBorderWidth;
   private int pointsBorderHeight;
   private int pointsBorderPositionX;
   private int pointsBorderPositionY;
   private int spaceBetweenPoints;
   private int PENIES_PER_DOLLAR = 100;
   private int PENIES_PER_HALF = 50;
   private int PENIES_PER_QUARTER = 25;
   private int PENIES_PER_TEEN=10;
   private int PENIES_PER_FIVE=5;
   private int PENIES_PER_ONE=1;
   int change;
   int change2;
   int p;
   int c;
   int i;
   int j;
   public CoffeeAndTeaMachine()
   {  
      width = 660;
      height = 670;
      c= 3;
      i=3;
      j=3;
      BorderWidth = 300;
      BorderHeight = 200;
      pointsBorderWidth = 150;
      pointsBorderHeight = 180;
      pointsBorderPositionX = 330;
      pointsBorderPositionY = 220;
      spaceBetweenPoints = 27;
      for(i=3; i<c+1; i--)
      {
         JOptionPane.showMessageDialog( null, "Hello and welcome to this \"Vending Machine\"!", "", JOptionPane.INFORMATION_MESSAGE );
         JOptionPane.showMessageDialog( null, "Please put your money in machine!", "", JOptionPane.INFORMATION_MESSAGE );
         JFrame frame = new JFrame();
         frame.getContentPane().add( this );      
         frame.setTitle( "Vending Machine" );
         frame.setSize( width, height );
         frame.setVisible( true );
         change=0;
         change2=0;
         PENIES_PER_DOLLAR = 100;
         PENIES_PER_HALF = 50;
         PENIES_PER_QUARTER = 25;
         PENIES_PER_TEEN=10;
         PENIES_PER_FIVE=5;
         PENIES_PER_ONE=1;
      
         String m = JOptionPane.showInputDialog("moneys amount in worth 100cent");
         int D = Integer.parseInt(m);
         String m1 = JOptionPane.showInputDialog("moneys amount in worth 50cent"); 
         int H = Integer.parseInt(m1);
         String m2 = JOptionPane.showInputDialog("moneys amount in worth 25cent");
         int Q = Integer.parseInt(m2);
         String m3 = JOptionPane.showInputDialog("moneys amount in worth 10cent");
         int T = Integer.parseInt(m3);
         String m4 = JOptionPane.showInputDialog("moneys amount in worth 5cent");
         int F = Integer.parseInt(m4);
         String m5 = JOptionPane.showInputDialog("moneys amount in worth 1cent");
         int O = Integer.parseInt(m5);
         change = PENIES_PER_DOLLAR * D + PENIES_PER_HALF * H + PENIES_PER_QUARTER * Q + PENIES_PER_TEEN * T + PENIES_PER_FIVE *F + PENIES_PER_ONE * O ;
         String porosia = JOptionPane.showInputDialog( " please, press the number before the drink  which you want ");
         int p=Integer.parseInt(porosia);
         if(j>0) 
         {
            if(p==1)
            {
               if( change >= 120)
               {
                  change2 = change -120;
                  System.out.println("true");
                  JOptionPane.showMessageDialog(null, "true");
               }
               else
               {
                  System.out.println("you don't have enough money");
                  change2 = change ; 
                  System.out.println("False");
                  JOptionPane.showMessageDialog(null, "false you don't have enough money");
               }
            }
            else
               if(p==2)
               {  
                  if(change >= 130)
                  {
                     System.out.println("true");
                     JOptionPane.showMessageDialog(null, "true");
                     change2 = change - 130;
                     j=j-1;
                  }
                  else 
                  {
                     System.out.println("you don't have enough money");  
                     change2 = change ;
                     System.out.println("False");
                     JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                  }
               }
               else
                  if(p==3)
                  {  
                     if(change >= 190)
                     {
                        System.out.println("true");
                        JOptionPane.showMessageDialog(null, "true");
                        change2 = change - 190;
                        j=j-1;
                     }
                     else 
                     {
                        System.out.println("you don't have enough money");  
                        change2 = change ;
                        System.out.println("False");
                        JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                     }
                  }
                  else
                     if(p==4)
                     {  
                        if(change >= 200)
                        {
                           System.out.println("true");
                           JOptionPane.showMessageDialog(null, "true");
                           change2 = change - 200;
                           j=j-1;
                        }
                        else 
                        {
                           System.out.println("nuk keni mjaftueshem para");  
                           change2 = change ;
                           System.out.println("False");
                           JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                        }
                     }
                     else
                        if(p==5)
                        {  
                           if(change >= 150)
                           {
                              System.out.println("true");
                              JOptionPane.showMessageDialog(null, "true");
                              change2 = change - 150;
                              j=j-1;
                           }
                           else 
                           {
                              System.out.println("you don't have enough money");  
                              change2 = change ;
                              System.out.println("False");
                              JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                           }
                        }
                        else
                           if(p==6)
                           {  
                              if(change >= 180)
                              {
                                 System.out.println("true");
                                 JOptionPane.showMessageDialog(null, "true");
                                 change2 = change - 180;
                                 j=j-1;
                              }
                              else 
                              {
                                 System.out.println("you don't have enough money");  
                                 change2 = change ;
                                 System.out.println("False");
                                 JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                              }
                           }
                           else
                              if(p==7)
                              {  
                                 if(change >= 160)
                                 {
                                    System.out.println("true");
                                    JOptionPane.showMessageDialog(null, "true");
                                    change2 = change - 160;
                                    j=j-1;
                                 }
                                 else 
                                 {
                                    System.out.println("you don't have enough money");  
                                    change2 = change ;
                                    System.out.println("False");
                                    JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                                 }
                              }
                              else
                                 if(p==8)
                                 {  
                                    if(change >= 170)
                                    {
                                       System.out.println("true");
                                       JOptionPane.showMessageDialog(null, "true");
                                       change2 = change - 170;
                                       j=j-1;
                                    }
                                    else 
                                    {
                                       System.out.println("nuk keni mjaftueshem para");  
                                       change2 = change ;
                                       System.out.println("False");
                                       JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                                    }
                                 }
                                 else
                                    if(p==9)
                                    {  
                                       if(change >= 140)
                                       {
                                          System.out.println("true");
                                          JOptionPane.showMessageDialog(null, "true");
                                          change2 = change - 140;
                                          j=j-1;
                                       }
                                       else 
                                       {
                                          System.out.println("you don't have enough money");  
                                          change2 = change ;
                                          System.out.println("False");
                                          JOptionPane.showMessageDialog(null, "false, you don't have enough money");
                                       }
                                    }
                                    else
                                       if(p==10)
                                       {  
                                          if(change >= 200)
                                          {
                                             System.out.println("true");
                                             JOptionPane.showMessageDialog(null, "true");
                                             change2 = change - 200;
                                             j=j-1;
                                          }
                                          else 
                                          {
                                             System.out.println("you don't have enough money");  
                                             change2 = change ;
                                             System.out.println("False, you don't have enough money");
                                             JOptionPane.showMessageDialog(null, "false, something went wrong");
                                          }
                                       }
                                       else
                                          if(p==0)
                                          {  
                                             change2 =  change ;
                                          }
                                          else 
                                          { 
                                             System.out.println("something went wrong");
                                             change2 = change ;
                                             System.out.println("False");
                                             JOptionPane.showMessageDialog(null, "false, something went wrong");
                                          }
                                    
         }
         else 
         {
            System.out.println("false");
            change2 = change;
            JOptionPane.showMessageDialog(null, "false, SORRY no more drink in machine");
         }
                   
      }
   }      
   
   public void paintComponent( Graphics g )
   {   
      g.setColor( Color.white );
      g.fillRect( 0, 0, width, height );
      
      g.setColor( Color.black );
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
      double money = change / 100.0;
      double output = change2 / 100.0;
      pen.setColor( Color.black );
      pen.fillRect( borderPositionX, borderPositionY+120, BorderWidth, BorderWidth -120 );
      pen.fillRect( 15, 450, 300, 40);
      pen.fillRect( 330, 450, 300, 40);
      pen.setColor(Color.white);
      pen.fillRect( 20, 455, 290, 30);
      pen.fillRect( 335, 455, 290, 30);
      pen.setColor( Color.black );
      pen.drawString("Input Money: " + money + " $" , 25, 475);
      pen.drawString("Output Money: " + output + " $" , 340, 475);
      this.repaint();
   
   }
   
   private void menu( Graphics pen )
   {      
      pen.setColor( Color.black );
      pen.fillRect( pointsBorderPositionX, pointsBorderPositionY, pointsBorderWidth + 150 , pointsBorderHeight );
      
      pen.setColor( Color.white );
      pen.setFont( new Font( "TimesRoman", Font.BOLD, 16 ) );
      pen.drawString( "6. Expresso...............................1.80 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints );
      pen.drawString( "7. Cappuccino...........................1.60 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 2 );
      pen.drawString( "8. Macchiato............................1.70 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 3 );
      pen.drawString( "9. Caffe Amerincano................1.40 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 4 );
      pen.drawString( "10. Cafe Latte..........................2.00 $", pointsBorderPositionX + 20, pointsBorderPositionY + spaceBetweenPoints * 5 );
      pen.drawString( "1. Camomil Tea............................1.20 $", 20, pointsBorderPositionY + spaceBetweenPoints  );
      pen.drawString( "2. Green Tea................................1.30 $", 20, pointsBorderPositionY + spaceBetweenPoints * 2  );
      pen.drawString( "3. Mint Tea..................................1.90 $", 20, pointsBorderPositionY + spaceBetweenPoints * 3  );
      pen.drawString( "4. Ginger Tea...............................2.00 $", 20, pointsBorderPositionY + spaceBetweenPoints  * 4 );
      pen.drawString( "5. Black Tea.................................1.50 $", 20, pointsBorderPositionY + spaceBetweenPoints  * 5 );
      pen.setColor( Color.yellow );
      pen.setFont( new Font( "TimesRoman", Font.BOLD, 45 ) );
      pen.drawString("MENU" , 250,200);
      pen.setColor(Color.red);
      pen.setFont( new Font( "TimesRoman", Font.BOLD, 16 ) );
      pen.drawString(" If you change you mind, please press 0 to cancel the proces, and I'll give back your money!", 15, 420);
      
   }
   public static void main( String[] args )
   {
      CoffeeAndTeaMachine h = new CoffeeAndTeaMachine();
   }

}
