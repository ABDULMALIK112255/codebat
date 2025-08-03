public class UserCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameComp = aName.compareTo(bName);
        if (nameComp != 0) return nameComp < 0 ? -1 : 1;
        if (aId == bId) return 0;
        return aId < bId ? -1 : 1;
    }
}