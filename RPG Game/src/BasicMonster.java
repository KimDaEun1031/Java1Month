
class BasicMonster {
	private int hp=3;
	private int hhp=3;
	private int damage=1;
	private int death;
	private int exp=2;
	
	//����
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

	//�پ��� ��
	public int getHp() {
		return hp;
	}

	//������
	public int getDamage() {
		return damage;
	}

	
	//����ġ
	public int getExp() {
		return exp;
	}


	//���ݹ���
	public void redHp(BasicStat player) {
		this.hp -= player.getAttack();
		System.out.printf("���� ü�� | %d / %d\n",hp,hhp);
	}

	//����
	public void displayRed() {
		System.out.printf("���� ü�� | %d / %d && ���� ������ | %d && ���� ����ġ | %d",hp,hhp,damage,exp);
	}

	
	
}
