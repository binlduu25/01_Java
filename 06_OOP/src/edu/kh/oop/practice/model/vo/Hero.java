package edu.kh.oop.practice.model.vo;

public class Hero {

	// 속성
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	// 기본생성자
	public Hero() {} 
	
	// 매개변수 생성
	public Hero(String nickname,String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}
	
	// getter / setter
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	
	// attack
	public void attack(double exp) {
		System.out.printf("경험치 획득 : %.1f\n",exp);
		this.exp += exp; // 현재 객체(this.exp)에 매개변수(exp)를 누적하겠다.
		System.out.printf("'%s' 은/는 공격을 했다! 현재 경험치 : %.1f\n",nickname,this.exp); // attack 1회에 '누적된' 경험치 출력
		
		if(this.exp >= 300) {
			level += 1;
			System.out.printf("레벨이 올랐습니다! 현재 레벨 : %d\n",level);
		}
		
	}
	
	// dash
	public void dash() {
		
		if(mp <= 0) {
		System.out.println("[마력 부족] 더 이상 대시할 수 없습니다.");
		}
		else {mp -= 10;
		System.out.println("'"+nickname+"'의 엄청 빠른 대시! 남은 마력 :"+mp);	
		}
		
		
		
		
	}

	@Override
	public String toString() {
		return "====== 캐릭터 생성 =====\n" +
				job +" 직업으로 '" + nickname + "' 님이 생성되었습니다." +
				"\n현재 레벨 : " + level +
				"\n현재 hp : " + hp +
				"\n현재 mp : " + mp +
				"\n현재 exp : " + exp + "\n";
	}
	
	
	
	
	
	
}
