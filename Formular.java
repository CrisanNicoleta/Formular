/*Formular inregistrare */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Formular {
    public static void main(String[] args) {
      
    	JFrame f = new JFrame("Formular de inscriere");
    	f.setSize(500,500);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(7, 1));
        
        JLabel nume = new JLabel("Numele este:");
        p.add(nume);
        JTextField nume1 = new JTextField(5);
        p.add(nume1);

        JLabel prenume = new JLabel("Prenumele este:");
        p.add(prenume);
        JTextField prenume1 = new JTextField(5);
        p.add(prenume1);
        
        String n = nume1.getText();
        String pr = prenume1.getText();
        
        JLabel an=new JLabel("Selectati anul de studiu");
    	p.add(an);
    	String [] an1= {"1" ,"2", "3","4"};
    	final JComboBox<String> an2 = new JComboBox<String>(an1);
        p.add(an2);
        
        JLabel fac=new JLabel("Selectati facultatea");
    	p.add(fac);
    	String [] fac1= {"AC" ,"ETTI"};
    	final JComboBox<String> fac2 = new JComboBox<String>(fac1);
        p.add(fac2);
        
        JLabel curs=new JLabel("Selectati cursul dorit");
    	p.add(curs);
    	String [] curs1= {"IS" ,"MET","ASC"};
    	final JComboBox<String> curs2 = new JComboBox<String>(curs1);
        p.add(curs2);
        
        JCheckBox cb1,cb2;
       p.setBounds(50,50,300,20);  
       cb1=new JCheckBox("Buget");  
       cb1.setBounds(100,100,150,20);  
       cb2=new JCheckBox("Taxa");  
       cb2.setBounds(100,100,150,20); 
       p.add(cb1);
       p.add(cb2);
		
       JButton submit=new JButton("Submit");
       p.add(submit);
     
       JTextArea informatii=new JTextArea(5,3);
       informatii.setEditable(false);
        f.add(p); 
        f.setSize(500, 500);  
        f.setVisible(true);
    }
}          