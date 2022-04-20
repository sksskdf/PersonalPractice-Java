package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileEx4 {
        private Integer year;
        private Long population;

        public Integer getYear() {
            return year;
        }

        public Long getPopulation() {
            return population;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public void setPopulation(Long population) {
            this.population = population;
        }

    public static void main(String[] args) {
        String path ="C:\\Users\\82103\\Downloads\\dataset_91069.txt";
        File file = new File(path);
        try (Scanner sc = new Scanner(file)) {

            ArrayList<FileEx4> arr = new ArrayList<>();
            while(sc.hasNext()) {
                String year = sc.next();
                if (Pattern.compile("[\\d]{4}").matcher(year).matches()) {
                    FileEx4 fileEx4 = new FileEx4();
                    fileEx4.setYear(Integer.parseInt(year));
                    fileEx4.setPopulation(Long.parseLong(sc.next().replace(",", "")));
                    arr.add(fileEx4);
                }
            }
            Integer year = 0;
            Long result = 0L;
            for (int i = 1; i < arr.size(); i++) {
                Long increase = arr.get(i).getPopulation()-arr.get(i-1).getPopulation();
                if (result < increase) {
                    result = increase;
                    year = arr.get(i).getYear();
                }
            }
            System.out.println(year + ":" + result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
