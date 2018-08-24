import java.util.Comparator;

// should have used generics here, e.g.:
//class Checker implements Comparator<Player> {
class Checker implements Comparator {
    // these labels make things clearer
    private static final int BEFORE = -1;
    private static final int SAME = 0;
    private static final int AFTER = 1;

    @Override
    public int compare(Object o1, Object o2) {
        // this wasn't requested but null checks in Comparators are a habit and helps ensure the equals contract is honoured
        if(o1 == o2) {
            return SAME;
        }
        if(o1==null){
            if(o2==null) {
                return SAME;
            }
            return AFTER;
        }
        if(o2==null) {
            return BEFORE;
        }
        // if i had used generics, the method would have taken Player's as arguments and this cast would not be needed
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;
        if(p1.score > p2.score) {
            return BEFORE;
        } else if(p2.score > p1.score) {
            return AFTER;
        }
        return p1.name.compareTo(p2.name);
    }
}