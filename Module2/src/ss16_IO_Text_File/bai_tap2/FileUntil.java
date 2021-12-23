package ss16_IO_Text_File.bai_tap2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUntil {
    public static final String FILE_COUNTRY = "/Users/thanhlong/Documents/codegym/Module2/src/ss16_IO_Text_File/bai_tap2/country.csv";


    public static List<Country> readCSV() {
        List<Country> countryList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(FILE_COUNTRY);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Country country;

            while ((line = bufferReader.readLine()) != null) {
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                countryList.add(country);

            }
            bufferReader.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countryList;
    }

    public static void main(String[] args) {
        List<Country> countryList = readCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
