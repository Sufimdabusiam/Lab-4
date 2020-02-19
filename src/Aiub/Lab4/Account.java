package Aiub.Lab4;


public class Account {
  private String accName;
  private String acid;
  private int balance;

public String getAccName() {
	return accName;
}

public void setAccName(String accName) {
	this.accName = accName;
}

public String getAcid() {
	return acid;
}

public void setAcid(String acid) {
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
public void deposit(int amount){
	System.out.println(amount);
}

public void Withdraw(int amount){
	System.out.println(amount);
}
public void showDeposit() {
	System.out.println("Accname:"+"accName"+" Acid:"+acid+" Balance:"+balance);
  }
public void showWithdraw() {
	System.out.println("Accname:"+accName+" Acid:"+acid+" Balance:"+balance);
  }
public void show() {
	System.out.println("Accname:"+accName+" Acid:"+acid+" Balance:"+balance);
  }

@Override
public String toString() {
	return "Account [accName=" + accName + ", acid=" + acid + ", balance=" + balance + "]";
}

}
