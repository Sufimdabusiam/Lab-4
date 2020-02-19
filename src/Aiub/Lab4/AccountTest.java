package Aiub.Lab4;

public class AccountTest {
	   public static void main(String[]args){
	    	 
	    	 Account a1=new Account();
	    	 a1.setAccName("saving");
	    	 a1.setAcid("1");
	    	 a1.setBalance(10000);
	    	 a1.show();
	    	 a1.showDeposit();
	    	 a1.showWithdraw();
	    	 System.out.println(a1);
	     }
}
