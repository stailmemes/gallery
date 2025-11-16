import java.awt.BorderLayout;
import java.io.File;
import javax.swing.*;


public class gallery{
    public static void main(String[] args){
        String directoryPath = "C:\\Users\\rotle\\Downloads\\blue_archive";

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
        frame.setSize(300, 300);


        //creates menu bar
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

        //creates panel bar
        JPanel mainPanel = new JPanel(); //Creates the panel
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(40); //accepts up to 40 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        mainPanel.add(label);
        mainPanel.add(tf);
        mainPanel.add(send);
        mainPanel.add(reset);

        //TextArea
        JTextArea ta = new JTextArea();

        //adding components to frame
        frame.getContentPane().add(BorderLayout.SOUTH, mainPanel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);



        frame.setVisible(true);
    }
}