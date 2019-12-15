package ca.bcit.comp1451.Session1LabB;

import java.util.ArrayList;
import java.util.Iterator;

public class Club {

	private ArrayList<Member> list;
	
	public Club() {
		list = new ArrayList<Member>();
	}

	public void join(Member member) {
		if(member != null) {
			list.add(member);
		}
	}
	
	public int numberOfMembers() {
		
		return list.size();
		
	}
	
	public void showMembers() {
		for(Member m : list) {
			System.out.println("Name: " + m.getFirstName() + " " + m.getLastName());
			System.out.println("Join date: " + m.getMonth() + "/" + m.getYear());
		}
	}
	
	public void showMembersByYear(int year) {
		for(Member m : list) {
			if(m.getYear() == (year)) {
				System.out.println("Name: " + m.getFirstName() + " " + m.getLastName());
				
			}
		}
	}
	
	public void removeMembersByYear(int year) {
		Iterator<Member> m = list.iterator();
		while(m.hasNext()) {
			Member m1 = m.next();
			if(m1.getYear() == (year)) {
				m.remove();
			}
		}
	}
	
	
	
}
