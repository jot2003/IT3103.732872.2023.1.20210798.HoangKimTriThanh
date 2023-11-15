package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        // Code session 9
        String filename = "E:\\Thanh\\20231 OOP TN\\IT3103.732872.2023.1.20210798.HoangKimTriThanh"
                + "\\Lab03other\\src\\hust\\soict\\hedspi\\garbage\\test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        // print around 2000
    }
}