package zhangzan.rpc.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 张赞
 * @version 1.0
 */
@Data
@Builder
public class RpcRequest implements Serializable {
    //服务类名，客户端只需知道接口名
    String interfaceName;
    //调用方法名
    String methodName;
    //参数列表
    Object[] paras;
    //参数类型列表
    String[] paraTypes;
}
