package wood_factory;
public class Logging { //벌목기를 사용하여 나무원목을 자름
	private int woodLog; //나무 원목
	private int feller; //벌목기
	private int workbench; //작업대
	private int time; //벌목을 할 때 나무 원목을 잘라내는 시간 
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

	public void Wood() { //나무를 벌목
		System.out.println("벌목기를 작동합니다.");
	}	
	
	public	void fellingWood(Fuel f) {
		feller += f.getFuel();
		for(;woodLog<feller;) { //연료를 벌목기에 넣은 만큼 나무를 팸
			time++;
			if(time==180) {
				this.timeSave += time;
				woodLog += 1;
				System.out.printf("나무 원목 개수 [ %d ]\n",woodLog);
				time=0;
			}
		}
		System.out.println("---------------------------");
		System.out.printf("나무 원목을 %d만큼 캤습니다.",woodLog);
		System.out.printf("걸린 시간 : %d",timeSave);
	}
	
	
}
