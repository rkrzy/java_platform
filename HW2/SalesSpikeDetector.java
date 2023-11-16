package HW2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SalesSpikeDetector {

    public static void main(String[] args) {

        try {

            String csvFilePath = "/Users/imjunsik/Desktop/2023-2학기/플랫폼기반프로그래밍/HW2/sales_data.csv";

            List<int[]> salesData = readCSV(csvFilePath);



            Scanner scanner = new Scanner(System.in);

            int threshold = scanner.nextInt();

            int timePeriod = scanner.nextInt();



            Map<Integer, Integer> results = detectSalesSpike(salesData, threshold, timePeriod);



            if (results.isEmpty()) {

                System.out.println("No sales spike detected");

            } else {

                for (Map.Entry<Integer, Integer> entry : results.entrySet()) {

                    System.out.println("Item ID: " + entry.getKey() + ", Time Period: " + entry.getValue() + " minutes");

                }

            }

        } catch (IOException e) {

            System.out.println("Error reading CSV file: " + e.getMessage());

        }

    }



    public static List<int[]> readCSV(String csvFilePath) throws IOException {

        List<int[]> data = new ArrayList<>();



        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {

            reader.readLine(); // Skip header



            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                int[] row = new int[parts.length - 1];

                for (int i = 0; i < row.length; i++) {
                    row[i] = Integer.parseInt(parts[i + 1]);
                }

                data.add(row);

            }

        }

        return data;

    }



    public static Map<Integer, Integer> detectSalesSpike(List<int[]> salesData, int threshold, int period) {

        // implement your code
        int save[] = new int[10];
        for(int i =0;i<10;i++)
        {
            save[i] = 0;
        }
        Map<Integer,Integer> result = new HashMap<>();

        for(int i = 0;i<=period;i++)
        {
            int arr[] = salesData.get(i);
            for(int j = 0;j<10;j++)
            {
                save[j] = save[j]+arr[j];
                if(save[j]>threshold)
                {
                    if(!result.containsKey(j+1)) {
                        result.put(j + 1, i);
                    }
                }
            }

        }
        return  result;
    }

}

