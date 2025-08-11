/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dialogs;

/**
 *
 * @author Student
 */
import javax.swing.JOptionPane;         

public class activity3_3 {
    static double capp = 95, moc = 90, van = 105;
    public static void main(String[] args) {
        
        int cappNum, mocNum, vanNum, cashAmount;
        
        JOptionPane.showMessageDialog(null, "JAVA CAFE"
                                    +"\n"
                                    +"\n"
                                    +"AMOUNT OF ORDERS"
                                    +"\n"
                                    +"Cappucino: "
                                    +(capp)
                                    +"\n"
                                    +"Mocha: "
                                    +(moc)
                                    +"\n"
                                    +"Vanilla: "
                                    +(van)
        ,"Input",JOptionPane.INFORMATION_MESSAGE);
        
        String cappInput = JOptionPane.showInputDialog("ORDER FOR CAPPUCINO: ");
        String mocInput = JOptionPane.showInputDialog("ORDER FOR MOCHA: ");
        String vanInput = JOptionPane.showInputDialog("ORDER FOR VANILLA: ");
        
        cappNum = Integer.parseInt(cappInput);
        mocNum = Integer.parseInt(mocInput);
        vanNum = Integer.parseInt(vanInput);
        
        
        String cash = JOptionPane.showInputDialog(null, "JAVA CAFE"
                            +"\n"
                            +"\n"
                            +"ORDERS     QUANTITY    AMOUNT"
                            +"\n"
                            +"Cappucino:       "
                            +cappNum+"                  "
                            +(cappNum*capp)
                            +"\n"
                            +"Mocha:              "
                            +mocNum+"                  "     
                            +(mocNum*moc)
                            +"\n"
                            +"Vanilla:              "
                            +vanNum+"                  "  
                            +(vanNum*van)
                            +"\n"
                            +"CASH"
        ,"Input",JOptionPane.INFORMATION_MESSAGE);
        
        cashAmount = Integer.parseInt(cash);
        
        JOptionPane.showMessageDialog(null, "JAVA CAFE"
                    +"\n"
                    +"\n"
                    +"ORDERS     QUANTITY    AMOUNT"
                    +"\n"
                    +"Cappucino:       "
                    +cappNum+"                  "
                    +(cappNum*capp)
                    +"\n"
                    +"Mocha:              "
                    +mocNum+"                  "     
                    +(mocNum*moc)
                    +"\n"
                    +"Vanilla:              "
                    +vanNum+"                  "  
                    +(vanNum*van)
                    +"\n"
                    +"\n"
                    +"TOTAL AMOUNT "+ ((cappNum*capp)+(mocNum*moc)+(vanNum*van))
                    +"\n"
                    +"\n"
                    +"CASH: "+cashAmount
                    +"\n"
                    +"CHANGE: "+((cashAmount-((cappNum*capp)+(mocNum*moc)+(vanNum*van))))
        ,"Input",JOptionPane.INFORMATION_MESSAGE);
        

                

    }
}

