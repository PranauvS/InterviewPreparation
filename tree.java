import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;  
/*
<applet code="tree" width=600 height=600>
</applet>
*/
public  class tree extends JApplet implements TreeExpansionListener
{
    JTree tree;
    JLabel l;
    public void init() 
    {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Nutrients");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Fruits");
        top.add(a);
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("Vegetables");
        top.add(b);
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("DryFruits");
        top.add(c);
        
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Apple");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Orange");
        a.add(a2);
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("Tomato");
        a.add(a3);
        
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Carrot");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Potato");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("Corn");
        b.add(b3);
        
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Cashewnut");
        c.add(c1);
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Pista");
        c.add(c2);
        DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("Walnut");
        c.add(c3);
        
        tree = new JTree(top);
        JScrollPane s = new JScrollPane(tree);
        add(s);
        l = new JLabel();
        add(l,BorderLayout.NORTH);
        tree.addTreeExpansionListener(this);
   }
   public void treeCollapsed(TreeExpansionEvent e) 
   {
       l.setText("Collapsed"+ e.getPath());    
   }
   public void treeExpanded(TreeExpansionEvent e) 
   {
       l.setText("Expanded"+e.getPath());
   }
}