package ca.bcit.comp1451.Session1LabB;

import java.util.ArrayList;
import java.util.Iterator;

public class Club {
	private ArrayList<Member> list;
	
	
	/**
	 * Constructors 
	 */
	public Club() {
		list = new ArrayList<Member>();
	}
	
	
	/**
	 * adds a member to the club
	 * @param member
	 */
	public void join(Member member) {
		if(member != null) {
			list.add(member);
		}
	}
	
	/**
	 * 
	 * @return the count of members
	 */
	public int numberOfMembers() {
		
		int numberOfMembers = 0;
		for(Member member : list) {
			if(member != null) {
				numberOfMembers++;
			}
		}
		return numberOfMembers;
	}
	
	
	/**
	 * displays the details of all members in the club
	 */
	public void showMembers() {
		
		for(Member members : list) {
			System.out.println("Name: "+ members.getFirstName()+ " " +
		members.getLastName()+ " " + "Member since: " + members.getJoinOfyear() + 
		"-" + members.getJoinOfMonth()
			);
		}
	}
	
	/**
	 * displays the details of only those members who 
	 * joined in the specified year
	 * @param year 
	 */
	public void showMembersByYear(int year) {
		
		for(Member members : list) {
			if(members.getJoinOfyear() == (year)) {
				System.out.println("Name: " + members.getFirstName() + " " + members.getLastName()
				+ " " + "Member since: " + members.getJoinOfyear() + 
				"-" + members.getJoinOfMonth());
			}
		}
	}
	
	/**
	 * removes all members who joined in the specified year
	 * @param year
	 */
	public void removeMembersByYear(int year) {
		
		Iterator<Member> index = list.iterator();
		while (index.hasNext()) {
			Member member = index.next();
			if (member.getJoinOfyear() == (year)) {
				index.remove();

			}

		}

	
	}
	
}
	
