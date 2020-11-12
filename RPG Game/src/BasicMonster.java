
class BasicMonster {
	private int hp=3;
	private int hhp=3;
	private int damage=1;
	private int death;
	private int exp=2;
	
	//피통
	public int getHhp() {
		return hhp;
	}

	public void setHhp(int hhp, int hp, int damage, int death, int exp) {
		this.hhp = hhp;
		this.damage = damage;
		this.death = death;
		this.exp = exp;
		this.hp = hp;
	}

	//줄어드는 피
	public int getHp() {
		return hp;
	}

	//데미지
	public int getDamage() {
		return damage;
	}

	
	//경험치
	public int getExp() {
		return exp;
	}


	//공격받음
	public void redHp(BasicStat player) {
		this.hp -= player.getAttack();
		System.out.printf("몬스터 체력 | %d / %d\n",hp,hhp);
	}

	//정보
	public void displayRed() {
		System.out.printf("몬스터 체력 | %d / %d && 몬스터 데미지 | %d && 몬스터 경험치 | %d",hp,hhp,damage,exp);
	}

	
	
}
