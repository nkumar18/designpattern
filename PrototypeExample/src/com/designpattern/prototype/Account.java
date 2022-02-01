package com.designpattern.prototype;

public abstract class Account implements Cloneable {
  abstract public  void accountType();
  
  public Object clone() {
	  Object clone=null;
	  try {
		  clone =super.clone();
	  }catch(CloneNotSupportedException exp) {
		  exp.printStackTrace();
	  }
	return clone;
	  
  }
}

class savingAccount extends Account{

	@Override
	public void accountType() {
		System.out.println("This is saving account");
		
	}
	
}

class currentAccount extends Account{

	@Override
	public void accountType() {
		System.out.println("This is current account");
		
	}
	
}





