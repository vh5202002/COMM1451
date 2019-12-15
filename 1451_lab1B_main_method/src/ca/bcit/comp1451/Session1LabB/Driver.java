package ca.bcit.comp1451.Session1LabB;

public class Driver {
	
	
	public static void main(String[] args) {
		
		int year = Integer.parseInt(args[3]);
		int month = Integer.parseInt(args[2]);
		int year1 = Integer.parseInt(args[7]);
		int month1 = Integer.parseInt(args[6]);
		Member m1 = new Member(args[0], args[1], month, year);
		Member m2 = new Member(args[4], args[5], month1, year1);
		
		Club c = new Club();
		c.join(m1);
		c.join(m2);
		c.showMembers();
		
		c.showMembersByYear(1990);
		c.removeMembersByYear(1990);
		c.showMembers();
	}

}
