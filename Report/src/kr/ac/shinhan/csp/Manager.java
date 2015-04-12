package kr.ac.shinhan.csp;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
public class Manager {

	
	public static  Member addMember(String name,String hak,String number,String mail,String kakao,String boss, String git)
	{
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		Member m = new Member(name,hak,number,mail,kakao,boss,git);
		pm.makePersistent(m);
		
		return m;
	}

	
	public static Member getMember(String key)
	{
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		Member m = pm.getObjectById(Member.class ,key);
		
		return m;
		
	
	}
	public static List<Member> getMemberByName(String name) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		Query qry = pm.newQuery(Member.class);
		qry.setFilter("name == nameparam");
		qry.declareParameters("String nameparam");
		
		List<Member> memberList = (List<Member>) qry.execute(name);
		return memberList;
	}

	public static List<Member> getAllMembers() {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		Query qry = pm.newQuery(Member.class);
		List<Member> memberList = (List<Member>) qry.execute();

		return memberList;
	}
	
	public static void updateMember(Member newMember)
	{
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		Member memberObject = Manager.getMember(newMember.getid()+"");
		memberObject.setname(newMember.getname());
		memberObject.sethak(newMember.gethak());
		memberObject.setnumber(newMember.getnumber());
		memberObject.setmail(newMember.getmail());
		memberObject.setkakao(newMember.getkakao());
		memberObject.setboss(newMember.getboss());
		memberObject.setgit(newMember.getgit());
		
		pm.close();
		
	}
	
	public static void deleteMember(String key)
	{
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		Member m = Manager.getMember(key);
		pm.deletePersistent(m);
		
	}
	}
	

