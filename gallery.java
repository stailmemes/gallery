import java.iio.File;

class Gallery{
    public static void main(String[] args){
        String directoryPath = "testDirectory";
        File directory = new File(directoryPath);



        if(directory.exists()&& directory.isDirectory()){
            String[] sontents = directory.list();
            if (contents != null){
                for (String content : contents){
                    System.out.println(content)
                }
            }
        }



    }

}