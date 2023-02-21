package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Comportamento strategy;

	public Comportamento getStrategy() {
		return strategy;
	}

	public void setStrategy(Comportamento strategy) {
		this.strategy = strategy;
	}
	
	public void mover() {
		strategy.mover();
	}

}
