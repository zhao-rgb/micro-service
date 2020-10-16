package com.soft1851.usercenter.service;

import com.soft1851.usercenter.domain.dto.LoginDTO;
import com.soft1851.usercenter.domain.dto.ResponseDTO;
import com.soft1851.usercenter.domain.dto.UserAddBonusMsgDTO;
import com.soft1851.usercenter.domain.dto.UserSignInDTO;
import com.soft1851.usercenter.domain.entity.User;

/**
 * @author zhao
 * @className UserService
 * @Description TODO
 * @Date 2020/9/29
 * @Version 1.0
 **/

public interface UserService {

    /**
     * 根据id获得用户详情
     * @param id
     * @return User
     */
    User findById(Integer id);

    /**
     * 添加一条积分记录
     *
     * @param userAddBonusMsgDTO
     */
    int addBonus(UserAddBonusMsgDTO userAddBonusMsgDTO);

    /**
     * 登录
     * @param loginDTO
     * @return
     */
    User login(LoginDTO loginDTO);

    /**
     * 用户签到
     * @param signInDTO
     * @return
     */
    ResponseDTO signIn(UserSignInDTO signInDTO);

    /**
     * 判断用户是否签到的
     * @param signInDTO
     * @return
     */
    ResponseDTO checkIsSign(UserSignInDTO signInDTO);

}
