package day;

 public abstract class dd4{
	public void attack() {
		System.out.println("����Ŀ��");
	}

	public void move() {
		System.out.println("�ƶ�");
	}
}

class Tank extends dd4 {
	public void attack() {
		System.out.println("̹�˹���Ŀ��");
	}

	public void move() {
		System.out.println("̹���ƶ�");
	}
}

class Flighter extends dd4 {
	public void attack() {
		System.out.println("�ɻ�����Ŀ��");
	}

	public void move() {
		System.out.println("�ɻ��ƶ�");
	}
}

class WarShip extends dd4 {
	public void attack() {
		System.out.println("ս������Ŀ��");
	}

	public void move() {
		System.out.println("ս���ƶ�");
	}
}

