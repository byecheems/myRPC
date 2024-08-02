package zhangzan.rpc.client;

import zhangzan.rpc.common.message.RpcRequest;
import zhangzan.rpc.common.message.RpcResponse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 张赞
 * @version 1.0
 */
public class IOClient {
    public static RpcResponse sendRequest(String host, int port, RpcRequest request){
        try{
            Socket socket = new Socket(host, port);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            oos.writeObject(request);
            oos.flush();
            RpcResponse response = (RpcResponse)ois.readObject();
            return response;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
