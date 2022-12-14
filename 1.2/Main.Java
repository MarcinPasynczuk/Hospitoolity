import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
 Test test = new Test("19/02/2001", "10", "20", "działa");
        test.saveData();
//        test.reader();
// Test test2 = new Test("19/02/1900", "8", "4", "not ok");
//        test2.saveData();
//        test2.reader();
//        test.deleter();
        test.reader();
//        System.out.println(test.reversedData("15/09/1875"));

    }
}
