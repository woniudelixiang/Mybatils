package controller;

import java.util.List;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import model.AscUserInfo;
import service.AscUserInfoServiceI;

@Controller
@RequestMapping("/UerInfoController")
public class AscUserInfoController {
	@Autowired
	private AscUserInfoServiceI serviceI;
	
	/**
	 *  用户列表页面
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/listUser")
	public String userList(HttpServletRequest request){
		AscUserInfo ascUserInfo = new AscUserInfo();
		ascUserInfo.setIsDelete(0);
		List<AscUserInfo> list = serviceI.getUserInfoByIsDelete(ascUserInfo);
		request.setAttribute("userlist", list);
		return "listUser";
	}

	/**
	 * 跳转到添加用户页面
	 * @return
	 */
	@RequestMapping(value="/addUserPre")
	public String addUserPre(){
		return "addUser"; 
	}
	
	/**
	 * 添加用户信息
	 * @param ascUserInfo
	 * @return
	 */
	@RequestMapping(value="/addUser")
	public String addUser(AscUserInfo ascUserInfo){
		String id = UUID.randomUUID().toString();
		ascUserInfo.setId(id);
		serviceI.insert(ascUserInfo);
		return "redirect:/UerInfoController/listUser"; 
	}

	/**
	 * 跳转到修改用户页面
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/updateUserInfoPre")
	public String updateUserInfoPre(String id,HttpServletRequest request){
		AscUserInfo ascUserInfo=serviceI.selectByPrimaryKey(id);
		request.setAttribute("user", ascUserInfo);
		return "updateUser";
	}
	
	/**
	 * 修改用户信息
	 * @param ascUserInfo
	 * @return
	 */
	@RequestMapping(value="/updateUser")
	public String updateUser(AscUserInfo ascUserInfo){
		serviceI.update(ascUserInfo);
		return "redirect:/UerInfoController/listUser";
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/deleteUser")
	public String deleteUser(String id){
		serviceI.delete(id);
		return "redirect:/UerInfoController/listUser";
	}
	

	

}
