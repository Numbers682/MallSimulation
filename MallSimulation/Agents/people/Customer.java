package people;

import java.util.Random;

/**
 * Universal customer agent.
 * @author tyler
 *
 */
public class Customer {
	
	private enum CreditRisk {
		EXCELLENT, VERYGOOD, GOOD, NOTGOOD, POOR, VERYPOOR
	}
	
	@SuppressWarnings("unused")
	private double creditLimit, spendingBias;
	private int creditScore;
	@SuppressWarnings("unused")
	private Random random;
	
	CreditRisk creditRisk;
	
	public Customer() {
		creditLimit = 0;
		spendingBias = 0.5;
		creditScore = 0;
		random = new Random();
	}
	
	void setCreditLimit(double limit) {
		this.creditLimit = limit;
	}
	
	double getCreditLimit() {
		return creditLimit;
	}
	
	void setCreditScore(int score) {
		this.creditScore = score;
	}
	
	int getCreditScore() {
		return creditScore;
	}
	
	public CreditRisk ShopperRisk() {
		if(creditScore >= 760) {
			return CreditRisk.EXCELLENT;
		} else if(creditScore >= 700) {
			return CreditRisk.VERYGOOD;
		} else if(creditScore >= 660) {
			return CreditRisk.GOOD;
		} else if(creditScore >= 620) {
			return CreditRisk.NOTGOOD;
		} else if(creditScore >= 580) {
			return CreditRisk.POOR;
		} else if(creditScore >= 500) {
			return CreditRisk.VERYPOOR;
		}
		return null;	
	}

}
