package org.fkit.service;

import org.fkit.domain.User;

/**
 * User鏈嶅姟灞傛帴鍙�
 * */
public interface UserService {
	
	/**
	 * 鍒ゆ柇鐢ㄦ埛鐧诲綍
	 * @param String loginname
	 * @param String password
	 * @return 鎵惧埌杩斿洖User瀵硅薄锛屾病鏈夋壘鍒拌繑鍥瀗ull
	 * */
	User login(String loginname,String password);
	
	public void saveOne(User user);

}
