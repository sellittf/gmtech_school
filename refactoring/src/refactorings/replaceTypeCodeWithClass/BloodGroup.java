package refactorings.replaceTypeCodeWithClass;

import java.util.HashMap;
import java.util.Map;

public class BloodGroup {
	private static final Map<Integer, String> knownGroups;
    static {
        knownGroups = new HashMap<Integer, String>();
        knownGroups.put(0, "O");
        knownGroups.put(1, "A");
        knownGroups.put(2, "B");
        knownGroups.put(3, "AB");
    }
    
	private String _group;

	public BloodGroup(int bloodGroupId) {
		_group = knownGroups.get(bloodGroupId);
	}

	public void setGroup(int arg) {
		_group = knownGroups.get(arg);
	}

	public String getGroup() {
		return _group;
	}

}
