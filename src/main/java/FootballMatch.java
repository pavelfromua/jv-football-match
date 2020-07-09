public class FootballMatch {
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        return (bet1 == result1 && bet2 == result2) ? 2 : ((bet1 == bet2 && result1 == result2)
                || ((((bet2 - bet1) >= 0 && (result2 - result1) >= 0)
                || ((bet2 - bet1) < 0 && (result2 - result1) < 0))
               && (result1 != result2 && bet1 != bet2))) ? 1 : 0;
    }
}