import java.awt.BorderLayout;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;



public class gallery{
    public static void main(String[] args){
        String directoryPath = "C:\\Users\\stail\\Downloads\\lol";

        File directory = new File(directoryPath);



        if(directory.exists()&& directory.isDirectory()){
            String[] contents = directory.list();
            if (contents != null){
                for (String content : contents){
                    System.out.println(content);
                }
            }
        }
        gui maingui = new gui();
        maingui.show();


    }

}
class gui {
    public void show() {
        JFrame frame = new JFrame("Image displayer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Menu bar
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu ("HELP");
        JMenu m3 = new JMenu ("SORT");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        JMenuItem button1 = new JMenuItem("Name");
        JMenuItem button2 = new JMenuItem("Random");
        JMenuItem button3 = new JMenuItem("Date");

        m1.add(m11);
        m1.add(m22);
        m3.add(button1);
        m3.add(button2);
        m3.add(button3);

        // Bottom panel
        JPanel mainPanel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(40);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        mainPanel.add(label);
        mainPanel.add(tf);
        mainPanel.add(send);
        mainPanel.add(reset);

        // Text area
        JTextArea ta = new JTextArea();

        // Add components
        frame.getContentPane().add(BorderLayout.SOUTH, mainPanel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);

        // Load image safely
        try {
            Image img = ImageIO.read(new File("C:\\Users\\stail\\Downloads\\lol\\1750390149244077.png"));
            JLabel imagelabel = new JLabel(new ImageIcon(img));
            frame.getContentPane().add(imagelabel, BorderLayout.EAST);
        } catch (Exception e) {
            e.printStackTrace();
            JLabel error = new JLabel("Could not load image.");
            frame.getContentPane().add(error, BorderLayout.EAST);
        }

        frame.setVisible(true);
    }

}