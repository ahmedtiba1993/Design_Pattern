package strategy.exp1;

public class Context {
	
	public Strategy strategy = new DefaultStrategyImpl() ;
	
	
	public void affectuerOperataion() {
		
		System.out.println("*******");
		strategy.operationStrategy();
		System.out.println("*******");		
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
