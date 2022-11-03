package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IncludeOutputService {
    public static String file(String filepath) {
        try (FileInputStream fileInputStream = new FileInputStream(filepath)) {
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            return new String(bytes);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            return null;
        } catch (IOException e) {
            System.out.println("Error");
            return null;
        }
    }
}
