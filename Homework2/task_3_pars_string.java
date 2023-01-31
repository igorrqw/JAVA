// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package Homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class task_3_pars_string {

    public static void main(String[] args) {
        String fileData = getDataFromFile("JAVA/Homework2/data.txt");
        System.out.println(fileData);
        System.out.println();

        List<String> logList = createLogString(formatData(fileData));
        for (String string : logList) {
            System.out.println(string);
        }
    }


    public static String getDataFromFile(String path) {

        StringBuilder resultLine = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path, Charset.forName("UTF8")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultLine.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultLine.toString();
    }


    public static String[][] formatData(String data) {

        data = data.replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .replace("{", "")
                .replace("}", "");

        String[] arrData = data.split(", ");

        String[] columnCount = arrData[0].split(",");

        String[][] resultArr = new String[arrData.length][columnCount.length];

        String[] parts = new String[columnCount.length];

        for (int i = 0; i < resultArr.length; i++) {
            parts = arrData[i].split(",");

            int index = 0;
            for (int j = 0; j < resultArr[0].length; j++) {
                index = parts[j].indexOf(":");
                resultArr[i][j] = parts[j].substring(index + 1);
            }
        }
        return resultArr;
    }


    public static List<String> createLogString(String[][] arrayData) {

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < arrayData.length; i++) {
            String part = String.format("Студент %s получил %s по предмету %s.", arrayData[i][0], arrayData[i][1], arrayData[i][2]);
            resultList.add(part);
        }

        return resultList;
    }

}