package wood_factory;
public class Logging { //����⸦ ����Ͽ� ���������� �ڸ�
	private int woodLog; //���� ����
	private int feller; //�����
	private int workbench; //�۾���
	private int time; //������ �� �� ���� ������ �߶󳻴� �ð� 
	int timeSave;
	
	public int getWoodLog() {
		return woodLog;
	}

	public int getFeller() {
		return feller;
	}

	public int getWorkbench() {
		return workbench;
	}

	public int getTime() {
		return time;
	}

	public void Wood() { //������ ����
		System.out.println("����⸦ �۵��մϴ�.");
	}	
	
	public	void fellingWood(Fuel f) {
		feller += f.getFuel();
		for(;woodLog<feller;) { //���Ḧ ����⿡ ���� ��ŭ ������ ��
			time++;
			if(time==180) {
				this.timeSave += time;
				woodLog += 1;
				System.out.printf("���� ���� ���� [ %d ]\n",woodLog);
				time=0;
			}
		}
		System.out.println("---------------------------");
		System.out.printf("���� ������ %d��ŭ ĺ���ϴ�.",woodLog);
		System.out.printf("�ɸ� �ð� : %d",timeSave);
	}
	
	
}
