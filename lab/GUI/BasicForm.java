import javax.swing.*;

public class BasicForm {
    public static void main(String[] args){
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        // Creating instance of JButton
        JButton button1 = new JButton("Button 1");

        // x axis, y axis, width, height
        button1.setBounds(350, 400, 220, 50);

        // adding button in JFrame
        frame.add(button1);
        

        // 400 width and 500 height
        frame.setSize(800, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
        
    }
}
