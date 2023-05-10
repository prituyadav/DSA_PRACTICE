class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J.isEmpty()) return 0;
		int cnt = 0;
		for(int i = 0 ; i < S.length() ; i++) {
			if(J.indexOf(S.charAt(i)) != -1) cnt++;
		}
		return cnt;
    }
}
