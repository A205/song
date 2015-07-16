package day;

 public abstract class dd4{
	public void attack() {
		System.out.println("攻击目标");
	}

	public void move() {
		System.out.println("移动");
	}
}

class Tank extends dd4 {
	public void attack() {
		System.out.println("坦克攻击目标");
	}

	public void move() {
		System.out.println("坦克移动");
	}
}

class Flighter extends dd4 {
	public void attack() {
		System.out.println("飞机攻击目标");
	}

	public void move() {
		System.out.println("飞机移动");
	}
}

class WarShip extends dd4 {
	public void attack() {
		System.out.println("战舰攻击目标");
	}

	public void move() {
		System.out.println("战舰移动");
	}
}

