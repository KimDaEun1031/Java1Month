
class BasicStat {
	private int experience=0; //���� ����ġ ����ġ ����
	private int remainExp=10; //���� ����ġ
	private int level=1; // +1
	private int defensive; //���� + 2
	private int stamina=5;  //���׹̳� + 5
	private int sstamina=5;
	private int rsta = 0;
	private int hp = 10; // + 20
	private int hhp = 10;
	private int rhp = 0;
	private int attack = 1;
	private int death;
	int lev [] = {1,2,3,4,5,6,7,8,9,10};
	
	//����ġ
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
	
	
	//����
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
				System.out.printf("[ %d Lev] ������!\n",lev[i]);
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
				System.out.println("***** ���� ���� *****");
				System.out.printf("���� : \t%d\n����ġ : \t%d / %d\n�� : \t%d\n���� : \t%d\nü�� : \t%d\n���׹̳� : \t%d\n",level,experience,remainExp,attack,defensive,hp,stamina);
			}
		}
	}
	
	
	
	//����
	public int getDefensive() {
		return defensive;
	}
	public void setDefensive(int defensive) {
		this.defensive = 0;
	}
	//���׹̳�
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
	
	//����
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
		System.out.printf("���Ϳ��� ���ݹ޾ҽ��ϴ�. ���� hp[ %d ]\n",hp);
	}
	

	//����
	public int getAttack() {
		return attack;
	}
	
	public void attack() {
		this.attack = attack;
	}
	
	//����
	public int getDeath() {
		return death;
	}

	public void setDeath(int death) {
		this.death = death;
	}
	
	public void Death() {
		double fercent = 10;
		if(hp==0) {
			System.out.printf("�÷��̾ ����߽��ϴ�.\n");
			this.experience = (int) ((double)experience - fercent);
			System.out.println("***** ���� ���� *****");
			System.out.printf("���� : \t%d\n����ġ : \t%d / %d\n�� : \t%d\n���� : \t%d\nü�� : \t%d\n���׹̳� : \t%d\n",level,experience,remainExp,attack,defensive,hp,stamina);
		}
	}

	
	
	//����
	public void displayStat() {
		System.out.println("***** ���� ���� *****");
		System.out.printf("���� : \t%d\n����ġ : \t%d / %d\n�� : \t%d\n���� : \t%d\nü�� : \t%d\n���׹̳� : \t%d\n",level,experience,remainExp,attack,defensive,hp,stamina);
	}
	
	public void displayhint() {
		System.out.println("------ ���� ------");
		System.out.println("1. ���� ���� ���� �������� ���Ͱ� ��Ÿ���ϴ�.");
		System.out.println("2. ���׹̳��� ü���� ���� ���� �ϱ� ������ �ڵ����� ȸ������ �ʽ��ϴ�.");
		System.out.println("3. ������ ����ġ�� 10% ���Դϴ�.");
		System.out.println("4. ������ �� �� ���׹̳��� �ϳ� ����ϴ�.");
	}

}

