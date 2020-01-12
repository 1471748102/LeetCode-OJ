package longgest1character;

public class longgest1character {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        int[] map = new int[256];
        int l = 0;
        int r = 0; // 滑动窗口为[l, r)，其间为不重复的元素
        int res = 0;
        while (l < s.length()) {
            if (r < s.length() && map[s.charAt(r)] == 0) {
                map[s.charAt(r++)]++;
                res = Math.max(res, r - l);
            } else {
                map[s.charAt(l++)]--;
            }
        }
        return res;
    }
}
