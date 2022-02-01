package com.designpattern.prototype;

public class Client {

	public static void main(String[] args) {
		Account currentaccount=(Account)AccountCache.accCacheMap.get("CURRENT").clone();
		currentaccount.accountType();
		Account  savingaccount=(Account)AccountCache.accCacheMap.get("SAVING").clone();
		savingaccount.accountType();
	}

}
