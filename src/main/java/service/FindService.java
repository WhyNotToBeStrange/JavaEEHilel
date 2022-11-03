package service;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Objects.nonNull;

public class FindService {
    public static int findWord(String filepath, String word) {
        String fileData = IncludeOutputService.file(filepath);
        if (nonNull(fileData)) {
            fileData = fileData.toLowerCase(Locale.ROOT);
            Matcher matcher = Pattern.compile("\\b" + word.toLowerCase(Locale.ROOT) + "\\b").matcher(fileData);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            return count;
        } else {
            return 0;
        }
    }
}
