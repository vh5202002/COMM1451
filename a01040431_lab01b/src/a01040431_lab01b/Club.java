/**
 * 
 */
package a01040431_lab01b;

import java.util.*;

/**
 * @author choya
 *
 */
public class Club {

	private ArrayList<Member> members;

	/**
	 * constructors
	 */
	public Club() {

		members = new ArrayList<Member>();

	}

	/**
	 * 
	 * @param member as add the member
	 */
	public void join(Member member) {

		if (member != null) {
			members.add(member);
		}
	}

	/**
	 * 
	 * @return a number of member
	 */
	public int numberOfMembers() {

		return members.size();

	}

	/**
	 * show the all members
	 */
	public void showMembers() {

		for (Member member : members)

			System.out.println(member.getFirstName() + " " + member.getLastName());

	}

	/**
	 * 
	 * @param year as show the member by year
	 */
	public void showMembersByYear(int year) {

		for (Member byYear : members)
			if (byYear.getYear() == (year)) {
				System.out.println(byYear.getFirstName() + " " + byYear.getLastName());
			}

	}

	/**
	 * 
	 * @param year as remove the member by year
	 */
	public void removeMembersByYear(int year) {

		Iterator<Member> index = members.iterator();
		while (index.hasNext()) {
			Member member = index.next();
			if (member.getYear() == (year)) {
				index.remove();

			}

		}

	}
}
