/**
 * 
 */
package a01040431_lab01b;

/**
 * @author choya
 *
 */
public class MemberDiver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Member member_1 = new Member("Choya","Liang",4,2017);
		Member member_2 = new Member("Weber","Liang",8,2015);
		Member member_3 = new Member("Vivian","Win",5,2011);	
		
		Club club = new Club();
		
		club.join(member_1);
		club.join(member_2);
		club.join(member_3);
		
		club.numberOfMembers();
	
		club.showMembersByYear(2015);
		
		club.removeMembersByYear(2011);
		
		club.showMembers();

	}

}
