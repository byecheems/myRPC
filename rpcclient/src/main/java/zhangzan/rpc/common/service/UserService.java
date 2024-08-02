package zhangzan.rpc.common.service;

import zhangzan.rpc.common.pojo.User;

/**
 * @author 张赞
 * @version 1.0
 */
public interface UserService {
    User getUSerByUserId(Integer userId);

}
