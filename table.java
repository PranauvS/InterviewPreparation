import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
<applet code="table" width=800 height=800>
</applet>
*/
public class table extends JApplet implements ListSelectionListener
{
    JLabel l1=new JLabel("S.No.");
    JLabel l2=new JLabel("Country");
    JLabel l3=new JLabel("Capital");
    JLabel l4=new JLabel("");
    JTextField t1=new JTextField(11);
    JTextField t2=new JTextField(11);
    JTextField t3=new JTextField(11);
    String data[][]={{"1","England","London"},{"2","Maldives","Male"},{"3","China","Beijing"},{"4","France","Paris"},{"5","Japan","Tokyo"},{"6","Nepal","Kathmandu"},{"7","United Kingdom","London"},{"8","United States of America","Washington D.C."},{"9","Germany","Berlin"}};
    String column[]={"S.No.","Country","Capital"};
    JTable table = new JTable(data,column);
    JButton b1=new JButton("SELECT");
    JButton b2=new JButton("RESET");
    public void init() 
    {
        table.setRowSelectionAllowed(true);  
        ListSelectionModel select= table.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        select.addListSelectionListener(this);
        JScrollPane s = new JScrollPane(table);
        add(l1,BorderLayout.SOUTH);
        add(s);
        add(l4);
        add(l1);
        add(t3);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(b2);
        setLayout(new GridLayout(5,1));
    }  
    public void valueChanged(ListSelectionEvent e) 
    {
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int row=table.getSelectedRow();
                t3.setText(table.getValueAt(row,0).toString());
                t1.setText(table.getValueAt(row,1).toString());
                t2.setText(table.getValueAt(row,2).toString());
              }
          });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                t3.setText(null);
                t2.setText(null);
                t1.setText(null);
            }  
        });
    }
}