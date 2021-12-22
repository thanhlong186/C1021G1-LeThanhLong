package ss16_IO_Text_File.bai_tap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CoppyFileText {
    public static final String FILE_SOURCE = "/Users/thanhlong/Documents/codegym/Module2/src/ss16_IO_Text_File/bai_tap/source_file";
    public static final String FILE_TARGET = "/Users/thanhlong/Documents/codegym/Module2/src/ss16_IO_Text_File/bai_tap/target_file";

    public static String readFile() {
        String result = "";
        int i;
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(FILE_SOURCE);
            while ((i = fileReader.read()) != -1) {
                result += (char) i;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  result;
    }

    public static void writeFile(String str)  throws IOException{
        FileWriter fileWriter = new FileWriter(FILE_TARGET);
        fileWriter.write(str);
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
            String input = readFile();
        System.out.println(input);
        writeFile(input);
    }
}
