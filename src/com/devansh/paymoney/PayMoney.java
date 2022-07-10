package com.devansh.paymoney;

public class PayMoney {

	public static int countRequiredTransactions(int[] transaction, int size, int target) {
		
		int currSum = 0;

		for (int i = 0; i < size; i++) {	
			currSum += transaction[i];
			
			if (currSum >= target) {
				return ++i;
			}
		}

		return -1;
	}

}
