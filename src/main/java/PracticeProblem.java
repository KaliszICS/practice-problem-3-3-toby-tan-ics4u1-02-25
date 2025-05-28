import java.util.*;

public class PracticeProblem {

    public static List<String> permsUnique(String input) {
        Set<String> result = new HashSet<>();
        permuteUnique("", input, result);
        return new ArrayList<>(result);
    }

    private static void permuteUnique(String prefix, String remaining, Set<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permuteUnique(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    result
                );
            }
        }
    }

    // Optional: if perms(String input) is also being tested
    public static List<String> perms(String input) {
        List<String> result = new ArrayList<>();
        permute("", input, result);
        return result;
    }

    private static void permute(String prefix, String remaining, List<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    result
                );
            }
        }
    }
}
