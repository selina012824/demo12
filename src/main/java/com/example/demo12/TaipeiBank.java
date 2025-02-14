package com.example.demo12;

public class TaipeiBank {
	//建立屬性
		private String account;
		
		private int balance;

		// 建立存取私有屬性的方法

		public String getAccount() {
			return account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		public int save(int amount) {
			if(amount <= 0) {
				return balance;
			} else {
				return balance + amount;
			}		
		}
}
