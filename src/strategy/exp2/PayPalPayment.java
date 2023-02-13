package strategy.exp2;

public class PayPalPayment implements PayStrategy{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paiement Paypal effectue avec succes");
	}

}
