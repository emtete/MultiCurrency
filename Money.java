public abstract class Money{
	protected int amount;
	String currency;

	String currency(){
		return currency;
	}

	abstract Money times(int multiplier);
	
	static Money dollar(int amount){
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount){
		return new Franc(amount, "CHF");
	}

	public boolean equals(Object object){
		Money money = (Money)object;
		return this.amount == money.amount;
	}

	
}