class Solution {
    public boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0, R = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    U++;
                    break;
                case 'D':
                    D++;
                    break;
                case 'L':
                    L++;
                    break;
                case 'R':
                    R++;
                    break;
            }
        }
        if (U != D) return false;
        if (L != R) return false;
        return true;
    }
}