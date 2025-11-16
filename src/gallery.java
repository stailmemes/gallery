import java.io.File;
import javax.swing.*;


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
        frame.setSize(300, 300);

        JButton button = new JButton("Press");
        frame.add(button);

        frame.setVisible(true);
    }
}