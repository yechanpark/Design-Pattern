package behavioral.strategy;

// 로봇 타입을 추상화
public abstract class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void move() {
		movingStrategy.move();
	}

	public void attack() {
		attackStrategy.attack();
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
}
