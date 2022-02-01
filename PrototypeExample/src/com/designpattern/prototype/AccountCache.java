package com.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {
     static Map<String,Account> accCacheMap= new HashMap<>();
     static{
    	 Account currentAccount = new currentAccount();
    	 Account savingAccount = new savingAccount();
    	 accCacheMap.put("SAVING", savingAccount);
    	 accCacheMap.put("CURRENT", currentAccount);
     }
}
