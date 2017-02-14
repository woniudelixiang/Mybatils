package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AscUserInfoMapper;

import model.AscUserInfo;

@Service("muserService")
public class AscUserInfoServiceImpl implements AscUserInfoServiceI {

	
	private AscUserInfoMapper mapper;
	
	
	public AscUserInfoMapper getMapper() {
		return mapper;
	}

	@Autowired
	public void setMapper(AscUserInfoMapper mapper) {
		this.mapper = mapper;
	}
	public List<AscUserInfo> getAll() {
		return mapper.getAll();
	}
	public AscUserInfo selectByPrimaryKey(String id) {
		return mapper.selectByPrimaryKey(id);
	}
	public int insert(AscUserInfo muser) {
		return mapper.insert(muser);
	}
	public int update(AscUserInfo muser) {
		return mapper.updateByPrimaryKeySelective(muser);
	}
	public int delete(String id) {
//		return mapper.deleteByPrimaryKey(id);
		return mapper.updateByPrimaryKeyToDelete(id);
	}
	public List<AscUserInfo> getUserInfoByIsDelete(AscUserInfo ascUserInfo) {
		return mapper.getUserInfoByIsDelete(ascUserInfo);
	}
}
