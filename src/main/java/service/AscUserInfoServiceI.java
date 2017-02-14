package service;

import java.util.List;

import model.AscUserInfo;

public interface AscUserInfoServiceI {

	List<AscUserInfo> getAll();

	AscUserInfo selectByPrimaryKey(String id);

	int insert(AscUserInfo muser);

	int update(AscUserInfo muser);

	int delete(String id);

	List<AscUserInfo> getUserInfoByIsDelete(AscUserInfo ascUserInfo);
}
