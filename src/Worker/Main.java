package Worker;

import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.DataFormatException;

class YearExeption extends Exception {
    public YearExeption() {
        System.out.println("Рік - некоректний");
    }

    public static class Main {
        public static int cheakYearExeption(int year) throws YearExeption {
            try {
                if (year > 2005 || year < 1920) {
                    throw new YearExeption();
                }
            } catch (YearExeption exeption) {
                exeption.printStackTrace();
                return 0;
            }
            return year;
        }

        public static void main(String[] arg) throws YearExeption {

            Worker worker = new Worker();
            Worker[] workerArray = new Worker[worker.namberOfworkers];

            for (int i = 0; i < worker.namberOfworkers; i++) {
                workerArray[i] = new Worker();
                Scanner input = new Scanner(System.in);
                System.out.println("Введіть інформацію (ПІБ, посада, рік) про праціника: " + (i + 1));
                workerArray[i].name = input.nextLine();
                input = new Scanner(System.in);
                workerArray[i].position = input.nextLine();
                input = new Scanner(System.in);
                workerArray[i].year = input.nextInt();
                workerArray[i].year = cheakYearExeption(workerArray[i].year);
            }
            Arrays.sort((workerArray), new Compare());
            System.out.println(Arrays.toString(workerArray));
        }
    }
}



