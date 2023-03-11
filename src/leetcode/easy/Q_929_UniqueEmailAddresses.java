package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Q_929_UniqueEmailAddresses {

    public static void main(String[] args) {

    }

    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            normalized.add(local[0].replace(".", "") + "@" + parts[1]);
        }
        return normalized.size();
    }
}
