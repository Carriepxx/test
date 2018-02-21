package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	
	@Select("select * from tb_user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	
	@Insert("Insert into tb_user(loginname,PASSWORD,username,phone,address) values(#{user.loginname},#{user.password},#{user.username,},#{user.phone},#{user.address})")
	public void saveOne(@Param("user")User user);

}
