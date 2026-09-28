
public abstract class InsurancePolicy {
	
	String policyHolderName;
	double basePremium;
	
	InsurancePolicy(String policyHolderName, double basePremium) {
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}
	
	abstract double calculatePremium();
	
	void printPolicyDetails() {
		System.out.println("Policy Holder Nmae: "+ policyHolderName);
		System.out.println("Basr Preminum: "+ basePremium);
		System.out.println("Final Premium: "+ calculatePremium());
	}

	public static void main(String[] args) {
		
		InsurancePolicy policy;
		
		policy = new CarInsurance("Ghanshyam", 10000, 2, false, 80000);
		
		policy.printPolicyDetails();
		
		System.out.println();
		
		policy = new HealthInsurance("Devendra", 1500,35, false, false);
		
       policy.printPolicyDetails();
	}

}

class CarInsurance extends InsurancePolicy {
	
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;
	
	CarInsurance(String policyHolderName, double basePremium,
			 int carAgeInYears, boolean hadAccidentInLastYear,
			 double carValue) {
		super(policyHolderName, basePremium);
		
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValue = carValue;
	}
	
	double calculatePremium() {
		double premium = basePremium;
		
		if(carAgeInYears <= 3) {
		       premium = premium + (premium * 0.10);	
		} 
		else if (carAgeInYears <= 7) {
			premium = premium + (premium * 0.20);
			
		} else {
			premium = premium + (premium * 0.25);
		}
		if(hadAccidentInLastYear) {
			premium = premium + (premium * 0.25);
		}
		else {
			premium = premium - (premium * 0.10);
			
		}
		if(carValue > 1000000) {
			premium = premium + 2000;
		}
		return premium;
	}
}

class HealthInsurance extends InsurancePolicy {
	
	   int age;
	   boolean isSmoker;
	   boolean hasPreExistingDisease;
	   
	   HealthInsurance(String policyHolderName, double basePremium,
			              int age, boolean isSmoker,
			              boolean hasPreExistingDisease) {
		   
		   super(policyHolderName, basePremium);
		   
		   this.age = age;
		   this.isSmoker = isSmoker;
		   this.hasPreExistingDisease = hasPreExistingDisease;
	   }
	   
	   double calculatePremium() {
		   
		   double premium = basePremium;
		   
		   if(age < 30) {
			   premium = premium + (premium * 0.10);
		   }
		   else if (age <= 45) {
			   premium = premium + (premium * 0.25);
		   }
		   else {
			   premium = premium + (premium * 0.40);
		   }
		   if(isSmoker) {
			   premium = premium + (premium * 0.30);
		   }
		   else {
			   premium = premium - (premium * 0.05);
		   }
		   if(hasPreExistingDisease) {
			   premium = premium + (premium * 0.20);
		   }
		   return premium;
	   }
}
