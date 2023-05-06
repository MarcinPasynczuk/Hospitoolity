public class Main {
    public static void main(String[] args) { 
        try {
            BufferedReader reader = new BufferedReader(new FileReader("book.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            String line;
            int checkBoxCounter = 0;
            int inputNameCounter = 0; 
            writer.write("[\n"); 
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(":", 3);

                if (splitLine.length < 3) {
                    continue;
                }

                String type = splitLine[1].trim().substring(3);
                String name = splitLine[2];

                if (type.equals("PDFTextField")) {
                    writer.write("  {\n");
                    writer.write("    type: '" + type + "',\n");
                    writer.write("    name: '" + name + "',\n");
                    writer.write("    label: ''\n");
                    writer.write("  },\n");
                } else if (type.equals("PDFCheckBox")) {
                    String inputName = "radio" + inputNameCounter;
                    String label = (checkBoxCounter % 2 == 0) ? "yes" : "no";

                    writer.write("  {\n");
                    writer.write("    type: '" + type + "',\n");
                    writer.write("    inputName: '" + inputName + "',\n");
                    writer.write("    name: '" + name + "',\n");
                    writer.write("    parentLabel: '',\n");
                    writer.write("    label: '" + label + "'\n");
                    writer.write("  },\n");

                    checkBoxCounter++;
                    if (checkBoxCounter % 2 == 0) {
                        inputNameCounter++;
                    }
                }
            }

            writer.write("]");
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
