package model.dao;

import model.bean.Account;

public class CheckLoginDao {

	public boolean isValiAccount(String username, String password) {
		if(username.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}

	public Account getAccountInfor(String username) {
		// TODO Auto-generated method stub
		Account account = new Account();
		return account;
	}
}
