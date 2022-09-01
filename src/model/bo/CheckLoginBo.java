package model.bo;

import model.bean.Account;
import model.dao.CheckLoginDao;

public class CheckLoginBo {

	CheckLoginDao checkLoginDao = new CheckLoginDao();
	
	public boolean isValidAccount(String username, String password) {
		// TODO Auto-generated method stub
		if("".equals(username) ||  "".equals(password)){
			return false;
		} else {
			return checkLoginDao.isValiAccount(username,password);
		}
	}

	public Account getAccountInfor(String username) {
		// TODO Auto-generated method stub
		return checkLoginDao.getAccountInfor(username);
	}
}