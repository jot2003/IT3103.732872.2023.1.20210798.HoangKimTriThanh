package hust.soict.hedspi.garbage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
        //Code session 9
		String filename = "E:\\Thanh\\20231 OOP TN\\IT3103.732872.2023.1.20210798.HoangKimTriThanh"
                + "\\Lab03other\\src\\hust\\soict\\hedspi\\garbage\\test.txt";
		byte[] inputString = { 0 };
		long startTime, endTime;

		inputString = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuilder garbage = new StringBuilder();
		for (byte b : inputString) {
			garbage.append((char) b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
        //print around 4
	}
}