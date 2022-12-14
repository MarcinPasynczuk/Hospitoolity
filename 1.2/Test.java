import java.io.*;
import java.util.*;

public class Test {
    public String date;
    public String fridge1;
    public String fridge2;
    public String info;


//Constructor.
    public Test(String date, String fridge1, String fridge2, String info) {
        this.date = date;
        this.fridge1 = fridge1;
        this.fridge2 = fridge2;
        this.info = info;
    }
//Constructor.


//Getters and setters.
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFridge1() {
        return fridge1;
    }

    public void setFridge1(String fridge1) {
        this.fridge1 = fridge1;
    }

    public String getFridge2() {
        return fridge2;
    }

    public void setFridge2(String fridge2) {
        this.fridge2 = fridge2;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
//Getters and setters.


// Just in case toString()
    @Override
    public String toString() {
        return
                "," + date + "," +
                        fridge1 + "," +
                        fridge2 + "," +
                        info + ",";
    }
// Just in case toString()


//Starting data saver.
    public void saveData() throws IOException {

        File file = new File("text.txt");
        boolean checker = true;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
 // Checker, if line contains this date makes break.
                if (line.contains(date)) {
                    checker = false;
                    break;

                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

// If checker true it will put new data to text.txt file.
        if (checker) {
            try (FileOutputStream fos = new FileOutputStream("text.txt", true)) {
                fos.write(toString().getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
// If not it will delete whole line with date and then save the data.
            deleter(date);
            saveData();
        }
    }



// Reading and printing all data sorted by date.
    public void reader() throws FileNotFoundException {
        ArrayList<String[]> dataList = new ArrayList<String[]>();
        Scanner scanner = new Scanner(new FileReader("text.txt"));
        scanner.useDelimiter(",");
        try {
            do {
                String ignore = scanner.next();
                String date = scanner.next();
                scanner.skip(scanner.delimiter());
                String first = scanner.next();
                scanner.skip(scanner.delimiter());
                String second = scanner.next();
                scanner.skip(scanner.delimiter());
                String info = scanner.next();
                dataList.add(new String[] {reversedData(date), first, second, info});
//                System.out.println(String.format("%-15s | %-15s | %-15s | %s", date, first, second, info));
            } while (scanner.hasNextLine());
            scanner.close();
        } catch (NoSuchElementException e) {
//            System.out.println("All valid data has been printed.");
        }

// First, sort the dataList by date using a comparator
        dataList.sort(new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                return b[0].compareTo(a[0]); // Compare the dates as strings.
            }
        });

// Then, loop through the sorted dataList and print each element.
        for (String[] data : dataList) {
            String date = data[0];
            String first = data[1];
            String second = data[2];
            String info = data[3];
            System.out.printf("%-15s | %-15s | %-15s | %s%n", reversedData(date), first, second, info);
        }



    }


















    public String reversedData(String dateToReverse){
    // split date by "/"
    String[] parts = dateToReverse.split("/");
    // create new date in format "yyyy/mm/dd"
    return parts[2] + "/" + parts[1] + "/" + parts[0];
}














    public void deleter(String dateToDelete){

        // The word that the line you want to delete should start with
        String lineStart = "," + dateToDelete;

        // Path to the file
        String filePath = "text.txt";

        // Read the file line by line
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder updatedContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                // If the line you want to delete does not start with the specified word,
                // append the current line to the updated content
                if (!line.startsWith(lineStart)) {
                    updatedContent.append(line).append("\n");
                }
            }

            // Write the updated content to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(updatedContent.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }



