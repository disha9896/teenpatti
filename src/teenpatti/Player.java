/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teenpatti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author disha
 */
public class Player {
    
    private int bal;
    static int pot;
    private int card1[]=new int[2];
    private int card2[]=new int[2];
    private int card3[]=new int[2];   
    static int amount=10;
    private String name;

    public Player(int bal,String name) {
        this.bal = bal;
        this.name = name;
    }

    public Player(int bal) {
        this.bal = bal;
    }
    public void add(int a)
    {
        if(bal<amount)
        {
           JOptionPane.showMessageDialog(null,"Not Sufficient Amount","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
             amount=a;
             bal=bal-amount;
             pot=pot+amount;
        }
    }
    public void setCard(int a, int b, int c)
    {
        if(a/13 == 0)card1[0]=1;else card1[0]=a/13;
        if(b/13 == 0)card1[0]=1;else card2[0]=a/13;
        if(c/13 == 0)card1[0]=1;else card3[0]=a/13;
        if(a%13==0)
        {
            card1[1]=13;
        }
        else
        {
            card1[1]=a%13;
        }
        if(b%13==0)
        {
            card2[1]=13;
        }
        else
        {
            card2[1]=b%13;
        }
        if(c%13==0)
        {
            card3[1]=13;
        }
        else
        {
            card3[1]=c%13;
        }
        
    }
    public void show(Player oponent)
    {
        int p1=0,p2=0;
        
        p1=samecards();
        p2=oponent.samecards();
          if(p2==0)
        {
            p2=samecolor();
        }
           if(p1==0)
        {
            p1=sequence();
        }
        if(p1==0)
        {
            p1=samecolor();
        }
        if(p2==0)
        {
            p2=sequence();
        }
           if(p1==0)
        {
            p1=twosame();
        }
        if(p2==0)
        {
            p2=twosame();
        }
           if(p1==0)
        {
            p1=highest();
        }
        if(p2==0)
        {
            p2=highest();
        }
        if(p1>p2)
        {
             JOptionPane.showMessageDialog(null,name+"Wins","CONGRATULATIONS",JOptionPane.INFORMATION_MESSAGE);
             bal=bal+pot;
             pot=0;
        }
        else
        {
            JOptionPane.showMessageDialog(null,oponent.name+"Wins","CONGRATULATIONS",JOptionPane.INFORMATION_MESSAGE);
             oponent.bal+=pot;
             pot=0;
        }
    }
    private int samecards()
    { 
        int value=0;
        if(card1[1]==card2[1] && card2[1]==card3[1])
        {
            value=100+card1[1]+card2[1]+card3[1];
            return value;
        }
        return 0;
    }
    private int samecolor()
    {
        if(card1[0]==card2[0] && card2[0]==card3[0])
        {
            return 30;
        }
        return 0;
    }
    private int sequence()
    {
        int value=0;
        int a[] = new int[] {card1[1],card2[1],card3[1]};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if(a[i]>a[i+1])
                {
                    int temp;
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        if(a[0]+1==a[1] && a[1]+1==a[2])
        {
            value=samecolor();
            return value+a[0]+a[1]+a[2]+50;
        }
        else
        {
            return 0; 
        }
    }
    private int twosame()
    {  
        int sum;
        if(card1[1]==card2[1])
        {
            sum=card1[1]+card2[1];
            return sum;
        }
        else if(card2[1]==card3[1])
        {
            sum=card2[1]+card3[1];
            return sum;
        }
        else if( card1[1]==card3[1])
        {
            sum=card1[1]+card3[1];
            return sum;
        }
        return 0;
    }
    private int highest()
    {
        if(card1[1]>card2[1] && card1[1]>card3[1])
        {
            return card1[1];
        }
        else if(card2[1]>card1[1] && card2[1]>card3[1])
        {
            return card2[1];
        }
        else if(card3[1]>card2[1] && card1[1]<card3[1])
        {
            return card3[1];
        }
        return 0;
    }
    public static void database(String fname){
        Connection con = null;
         ResultSet rs = null;
    Statement stat = null;
    String dbpath = "F:\\study\\sem-4\\java\\TeenPatti\\Game.accdb";
    try{
        String connString = "jdbc:ucanaccess://" + dbpath;
        con = DriverManager.getConnection(connString);
         stat = con.createStatement();
        
        String selectQuery = "SELECT username, password,name FROM login"; 
        rs = stat.executeQuery(selectQuery);
        //System.out.println("Customer_id"+ " " + "customer name");
        while(rs.next())
        {
            String  dum= rs.getString("username");
             String dpass = rs.getString("password");
            
           
        }
        stat.close();
        con.close();
         
    }
    catch(Exception e){
        System.out.println("exception catch...");
        e.printStackTrace();
    }
    
   
    }
    
    public static void main(String[] args) {
 
    }
    
}
