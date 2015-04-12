package kr.ac.shinhan.csp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.Persistent;



@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Member {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private String name;
	@Persistent
	private String hak;
	@Persistent
	private String number;
	@Persistent
	private String mail;
	@Persistent
	private String kakao;
	@Persistent
	private String boss;
	@Persistent
	private String git;

	public Member (String name,String hak,String number,String mail,String kakao,String boss, String git) {
	super();
	this.name = name;
	this.hak = hak;
	this.number = number;
	this. mail = mail;
	this.kakao = kakao;
	this.boss = boss;
	this.git = git;
	}
	
	public Long getid(){
	return id;	
	}
	public String getname(){
	return name;
	
	}
	public void setname(String name){
		this.name = name;
	}
	public String gethak(){
		return hak;
		
		}
	public void sethak(String hak){
			this.hak = hak;
		}
	public String getnumber(){
		return number;
		
		}
	public void setnumber(String number){
			this.number = number;
		}
	public String getmail(){
		return mail;
		
		}
	public void setmail(String mail){
			this.mail = mail;
		}	
	public String getkakao(){
		return kakao;
		
		}
	public void setkakao(String kakao){
			this.kakao = kakao;
		}	
	public String getboss(){
		return boss;
		
		}
	public void setboss(String boss){
			this.boss = boss;
		}	
	public String getgit(){
		return git;
		
		}
	public void setgit(String git){
			this.git = git;
		}
	public void setid(Long id){
		this.id = id;
	}


}
	


	