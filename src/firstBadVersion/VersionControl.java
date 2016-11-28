package firstBadVersion;

/**
 * Created by Mayank on 11/28/16.
 */

public class VersionControl {
    int firstBadVersion;
    boolean isBadVersion(int version) {
        if (version >= firstBadVersion) {
            return true;
        }
        return false;
    }
}
