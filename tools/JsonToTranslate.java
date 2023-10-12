import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabelExtractor {

    public static void main(String[] args) {
        String inputText = "";  
        extractLabels(inputText);
    }

    public static void extractLabels(String input) {
        Map<String, String> labelMap = new HashMap<>();
        Pattern labelPattern = Pattern.compile("label: '([^']+)'");
        Pattern parentLabelPattern = Pattern.compile("parentLabel: '([^']+)'");

        Matcher labelMatcher = labelPattern.matcher(input);
        while (labelMatcher.find()) {
            String label = labelMatcher.group(1);
            labelMap.put(replaceDotsWithUnderscore(label), label);
        }

        Matcher parentLabelMatcher = parentLabelPattern.matcher(input);
        while (parentLabelMatcher.find()) {
            String parentLabel = parentLabelMatcher.group(1);
            labelMap.put(replaceDotsWithUnderscore(parentLabel), parentLabel);
        }

        for (Map.Entry<String, String> entry : labelMap.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\",");
        }
    }

    public static String replaceDotsWithUnderscore(String input) {
        return input.replace('.', '_');
    }
}
