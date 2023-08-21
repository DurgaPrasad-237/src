package OopsConcept;

public class TestEncapsulation {

	public static void main(String[] args) {
		String bankName;
		String ifsccode;
		int branchpin;
		Bank obj = new Bank();
		obj.setBankName("SLN Bank");
		obj.setIfscCode("SLNG123KL");
		obj.setBranchPin(2324);
		bankName = obj.getBankName();
		ifsccode = obj.getIfscCode();
		branchpin = obj.getBranchPin();
		System.out.println("branchname:"+bankName+"\nifscode:"+ifsccode+"\nbranchPin:"+branchpin);
	
		

	}

}
