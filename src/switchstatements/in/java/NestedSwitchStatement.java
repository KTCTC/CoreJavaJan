package switchstatements.in.java;

public class NestedSwitchStatement {
	static String branchName = "CSE";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedSwitchStatement obj = new NestedSwitchStatement();
		int yearOfCollage = 2;
		yearOfCollage =45;
		String branchName = "CSE";
		switch (yearOfCollage) {
		case 1:
			System.out.println("You are first year student your subjectes are Math,C++");
			break;
		case 2:
			System.out.println("You are second year student");
			obj.getSubjectOfRequiredBranch(branchName);
			break;

		default:
			System.out.println("No book found");
			break;

		}

	}
	
	public static void getSubjectOfRequiredBranch(String data)
	{
		switch (data) {
		case "CSE":
			System.out.println("your subjectes are JAVA,Python");
			break;
		case "ENTC":
			System.out.println("your subjectes are CN,ECAD");
			break;
		case "civil":
			System.out.println("your subjectes are TOM,SOM");
			default:
				System.out.println("We dont have that branch in our collage");
		}
	}

}
