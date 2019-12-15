package ca.bcit.comp1451.Session1LabB;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int joinOfYear = Integer.parseInt(args[2]);
		int joinOfMonth = Integer.parseInt(args[3]);
		
		int joinOfYear1 = Integer.parseInt(args[6]);
		int joinOfMonth1 = Integer.parseInt(args[7]);
		Member m1 = new Member(args[0],args[1],joinOfYear,joinOfMonth);
		Member m2 = new Member(args[4],args[5],joinOfYear1,joinOfMonth1);
		
		
		Club c = new Club();
		c.join(m1);
		c.join(m2);
		
		c.showMembers();
		
		c.numberOfMembers();
		
		c.showMembersByYear(2010);
		
		c.removeMembersByYear(2010);
		
		c.showMembers();
		
		
	}

}
