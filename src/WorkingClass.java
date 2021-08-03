import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WorkingClass{
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel l8 = new JLabel();
    JLabel l9 = new JLabel();
    JLabel alll = new JLabel();

    ImageIcon i1  = new ImageIcon("pics\\1.jpg");
    ImageIcon i2  = new ImageIcon("pics\\2.jpg");
    ImageIcon i3  = new ImageIcon("pics\\3.jpg");
    ImageIcon i4  = new ImageIcon("pics\\4.jpg");
    ImageIcon i5  = new ImageIcon("pics\\5.jpg");
    ImageIcon i6  = new ImageIcon("pics\\6.jpg");
    ImageIcon i7  = new ImageIcon("pics\\7.jpg");
    ImageIcon i8  = new ImageIcon("pics\\8.jpg");
    ImageIcon i9  = new ImageIcon("pics\\9.jpg");
    JFrame frame = new JFrame("Watching Tom");
    WorkingClass(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        l1.setBounds(0,0,200,200);
        l2.setBounds(200,0,200,200);
        l3.setBounds(400,0,200,200);
        l4.setBounds(0,200,200,200);
        l5.setBounds(200,200,200,200);
        l2.setText("Hover Your Cursor");
        l6.setBounds(400,200,200,200);
        l7.setBounds(0,400,200,200);
        l8.setBounds(200,400,200,200);
        l9.setBounds(400,400,200,200);
        alll.setBounds(0,0,600,600);

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
        frame.add(alll);


        one one = new one();
        one.start();
        two two = new two();
        two.start();
        three three = new three();
        three.start();
        four four = new four();
        four.start();
        five five = new five();
        five.start();
        six six = new six();
        six.start();
        seven seven = new seven();
        seven.start();
        eight eight = new eight();
        eight.start();
        nine nine = new nine();
        nine.start();

    }

class one extends Thread implements MouseListener{
        one(){
            l1.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i1);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class two extends Thread implements MouseListener{
        two(){
            l2.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i2);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class three extends Thread implements MouseListener{
        three(){
            l3.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i3);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class four extends Thread implements MouseListener{
        four(){
            l4.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i4);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class five extends Thread implements MouseListener{
        five(){
            l5.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i5);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class six extends Thread implements MouseListener{
        six(){
            l6.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i6);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class seven extends Thread implements MouseListener{
        seven(){
            l7.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i7);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class eight extends Thread implements MouseListener{
        eight(){
            l8.addMouseListener(this);
        }
    @Override
    public void run(){    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i8);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
}
class nine extends Thread implements MouseListener{
        nine(){
            l9.addMouseListener(this);
        }
    @Override
    public void run(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {    }

    @Override
    public void mousePressed(MouseEvent e) {   }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        alll.setIcon(i9);
    }

    @Override
    public void mouseExited(MouseEvent e) {    }
    }}