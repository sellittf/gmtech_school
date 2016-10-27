package refactorings.replaceTypeCodeWithClass;

public class Person {
	private BloodGroup _bloodGroup;

	public Person(int bloodGroupId) {
		_bloodGroup = new BloodGroup(bloodGroupId);
	}

	public void setBloodGroup(int arg) {
		_bloodGroup.setGroup(arg);
	}

	public String getBloodGroup() {
		return _bloodGroup.getGroup();
	}
}
