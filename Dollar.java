import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Dollar{
	int amount;

	public Dollar(){	}

	public Dollar(int amount){
		this.amount = amount;		
	}

	public Dollar times(int multiplier){
		return new Dollar(amount * multiplier);
	}

	public boolean equals(Dollar target){
		return this.amount == target.amount;
			

	}
	public boolean equals(int amount){
		if(this.amount == amount){
			return true;
		}else{
			return false;
		}

	}

}