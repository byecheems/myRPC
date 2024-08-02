package zhangzan.rpc.common.service.Impl;

import zhangzan.rpc.common.pojo.User;
import zhangzan.rpc.common.service.UserService;

/**
 * @author 张赞
 * @version 1.0
 */
public class ImplUserService implements UserService {
    @Override
    public User getUSerByUserId(Integer userId) {
        String userName = "";
        return User.builder().userName(userName).uerId(userId).sex("1").build();
    }
}
