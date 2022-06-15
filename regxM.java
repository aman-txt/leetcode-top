class regxM {

    int[][] hm;

    public boolean isMatch(String s, String p) {
        hm = new int[s.length() + 1][p.length() + 1];
        return dfs(s, p, 0, 0);
    }

    boolean dfs(String s, String p, int i, int j) {
        if (hm[i][j] != 0)
            return hm[i][j] == 1;

        boolean ans;

        if (j >= p.length())
            ans = i == s.length();
        else {
            boolean match = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

            if (j + 1 < p.length() && p.charAt(j + 1) == '*')
                ans = dfs(s, p, i, j + 2) || (match && dfs(s, p, i + 1, j));
            else
                ans = match && dfs(s, p, i + 1, j + 1);
        }
        hm[i][j] = ans ? 1 : 2;
        return ans;

    }

    public static void main(String[] args) {
        regxM r = new regxM();
        System.out.println(r.isMatch("aaa", "aa"));
    }
}