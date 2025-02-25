package zhangzan.rpc.common.message;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 张赞
 * @version 1.0
 */
@Builder
@Data
public class RpcResponse implements Serializable {
    //状态码
    String code;
    //状态信息
    String message;
    //返回数据
    Object data;
    //构造成功信息
    public static RpcResponse success(Object data){
        return RpcResponse.builder().code("200").data(data).build();
    }
    //构造失败信息
    public static RpcResponse fail(){
        return RpcResponse.builder().code("500").message("服务器发生错误。").build();
    }
}
