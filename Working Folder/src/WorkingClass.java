import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WorkingClass implements MouseListener {
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel l8 = new JLabel();
    JLabel l9 = new JLabel();

    ImageIcon i1  = new ImageIcon("pics\\1.jpg");
    ImageIcon i2  = new ImageIcon("pics\\2.jpg");
    ImageIcon i3  = new ImageIcon("pics\\3.jpg");
    ImageIcon i4  = new ImageIcon("pics\\4.jpg");
    ImageIcon i5  = new ImageIcon("pics\\5.jpg");
    ImageIcon i6  = new ImageIcon("pics\\6.jpg");
    ImageIcon i7  = new ImageIcon("pics\\7.jpg");
    ImageIcon i8  = new ImageIcon("pics\\8.jpg");
    ImageIcon i9  = new ImageIcon("pics\\9.jpg");
    JFrame frame = new JFrame();
    WorkingClass(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        l1.setBounds(0,0,200,200);
        l1.setBackground(Color.cyan);
        l1.setOpaque(true);
        l1.addMouseListener(this);

        l2.setBounds(200,0,200,200);
        l2.addMouseListener(this);

        l3.setBounds(400,0,200,200);
        l3.addMouseListener(this);

        l4.setBounds(0,200,200,200);
        l4.addMouseListener(this);

        l5.setBounds(200,200,200,200);
        l5.addMouseListener(this);

        l6.setBounds(400,200,200,200);
        l6.addMouseListener(this);

        l7.setBounds(0,400,200,200);
        l7.addMouseListener(this);

        l8.setBounds(200,400,200,200);
        l8.addMouseListener(this);

        l9.setBounds(400,400,200,200);
        l9.addMouseListener(this);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);


    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.print("YEah");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
