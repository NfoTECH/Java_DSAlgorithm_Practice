package strings;

//Problem:
//        Implement regular expression matching with support for ’.’ and ’*’.
//        ’.’ Matches any single character.
//        ’*’ Matches zero or more of the preceding element.
//        The matching should cover the entire input string (not partial).
//        The function prototype should be:
//        bool isMatch(const char *s, const char *p)
//        Some examples:
//        isMatch("aa","a") return false
//        isMatch("aa","aa") return true
//        isMatch("aaa","aa") return false
//        isMatch("aa", "a*") return true
//        isMatch("aa", ".*") return true
//        isMatch("ab", ".*") return true
//        isMatch("aab", "c*a*b") return true

public class RegExMatching {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }
        if (p.length() == 1) {
            return (s.length() == 1 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        }
        if (p.charAt(1) != '*') {
            if (s.length() < 1) {
                return false;
            }
            return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1));
        } else {
            while (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
                if (isMatch(s, p.substring(2))) {
                    return true;
                }
                s = s.substring(1);
            }
            return isMatch(s, p.substring(2));
        }
    }
}
