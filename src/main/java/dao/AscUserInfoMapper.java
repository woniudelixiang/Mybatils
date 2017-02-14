package dao;

import java.util.List;

import model.AscUserInfo;

public interface  AscUserInfoMapper {
	
	int deleteByPrimaryKey(String id);
	int updateByPrimaryKeyToDelete(String id);

	int insert(AscUserInfo record);

	int insertSelective(AscUserInfo record);

	AscUserInfo selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(AscUserInfo record);

	int updateByPrimaryKey(AscUserInfo record);

	List<AscUserInfo> getAll();
	
	List<AscUserInfo> getUserInfoByIsDelete(AscUserInfo ascUserInfo);
}
