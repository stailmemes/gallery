import java.io.File;

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



    }

}