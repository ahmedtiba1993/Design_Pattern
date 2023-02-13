package strategy.exp2;

public class PaymentContext {

	private PayStrategy strategy;

	public PaymentContext(PayStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	void executePayment() {
		if(strategy == null) {
			System.err.println("Aucun moyen de payment n'a ete defini");
			return;
		}
		strategy.pay();		
	}
	
	public void setStrategy(PayStrategy strategy) {
		this.strategy = strategy;
	}
}
