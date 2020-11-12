
class BasicStat {
	private int experience=0; //얻은 경험치 경험치 제곱
	private int remainExp=10; //남은 경험치
	private int level=1; // +1
	private int defensive; //방어력 + 2
	private int stamina=5;  //스테미나 + 5
	private int sstamina=5;
	private int rsta = 0;
	private int hp = 10; // + 20
	private int hhp = 10;
	private int rhp = 0;
	private int attack = 1;
	private int death;
	int lev [] = {1,2,3,4,5,6,7,8,9,10};
	
	//경험치
	public int getRemainExp() {
		return remainExp;
	}

	public void setRemainExp(int remainExp) {
		this.remainExp = remainExp; 
	}
	
	
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
			this.experience = experience;
	}
	
	
	
	public void Exp(BasicMonster red) {
		this.experience += red.getExp();
	}
	
	
	//레벨
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;			
		}
	public void Levelup() {
		for(int i=0;i<=lev.length;) {
			if(experience==remainExp) {
				i++;
				System.out.printf("[ %d Lev] 레벨업!\n",lev[i]);
				remainExp = remainExp*2;	
				experience = 0;
				level += 1;
				rhp = hhp - hp;
				hp += rhp;
				hhp +=10;
				hp += 10;
				rsta = sstamina - stamina;
				stamina += rsta;
				stamina += 5;
				sstamina += 5;
				attack += 2;
				defensive += 1;
				System.out.println("***** 스텟 정보 *****");
				System.out.printf("레벨 : \t%d\n경험치 : \t%d / %d\n힘 : \t%d\n방어력 : \t%d\n체력 : \t%d\n스테미나 : \t%d\n",level,experience,remainExp,attack,defensive,hp,stamina);
			}
		}
	}
	
	
	
	//방어력
	public int getDefensive() {
		return defensive;
	}
	public void setDefensive(int defensive) {
		this.defensive = 0;
	}
	//스테미나
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		for(int i=0;i<=lev.length;) {
			if(level==i+1) {				
					stamina += 10;
					i++;
				}
			}
	}
	
	//피통
	public int getHp() {
		return hp;
	}
		
	public int getHhp() {
		return hhp;
	}
	
	public void setHp(int hp,int hhp) {		
		this.hp = hp;
		this.hhp = hhp;
	}
	
	public void monHp(BasicMonster red) {
		this.hp -= red.getDamage();
		this.stamina -= 1;
		System.out.printf("몬스터에게 공격받았습니다. 남은 hp[ %d ]\n",hp);
	}
	

	//공격
	public int getAttack() {
		return attack;
	}
	
	public void attack() {
		this.attack = attack;
	}
	
	//죽음
	public int getDeath() {
		return death;
	}

	public void setDeath(int death) {
		this.death = death;
	}
	
	public void Death() {
		double fercent = 10;
		if(hp==0) {
			System.out.printf("플레이어가 사망했습니다.\n");
			this.experience = (int) ((double)experience - fercent);
			System.out.println("***** 스텟 정보 *****");
			System.out.printf("레벨 : \t%d\n경험치 : \t%d / %d\n힘 : \t%d\n방어력 : \t%d\n체력 : \t%d\n스테미나 : \t%d\n",level,experience,remainExp,attack,defensive,hp,stamina);
		}
	}

	
	
	//정보
	public void displayStat() {
		System.out.println("***** 스텟 정보 *****");
		System.out.printf("레벨 : \t%d\n경험치 : \t%d / %d\n힘 : \t%d\n방어력 : \t%d\n체력 : \t%d\n스테미나 : \t%d\n",level,experience,remainExp,attack,defensive,hp,stamina);
	}
	
	public void displayhint() {
		System.out.println("------ 도움말 ------");
		System.out.println("1. 걸음 수에 따라 랜덤으로 몬스터가 나타납니다.");
		System.out.println("2. 스테미나와 체력을 레벨 업을 하기 전까지 자동으로 회복되지 않습니다.");
		System.out.println("3. 죽으면 경험치가 10% 깎입니다.");
		System.out.println("4. 공격을 할 때 스테미나를 하나 깎습니다.");
	}

}

