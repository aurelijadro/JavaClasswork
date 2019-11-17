package patterns.behavioral.strategy.two;

public class Human {
	private String name;
	private int Age;
	private TrainingStrategy strategy;
	
	public Human (TrainingStrategy strategy) {
		this.strategy=strategy;
	}
	
	public String printStrategy() {
		return strategy.printStrategy(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public TrainingStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(TrainingStrategy strategy) {
		this.strategy = strategy;
	}
	
	
	
	
}
