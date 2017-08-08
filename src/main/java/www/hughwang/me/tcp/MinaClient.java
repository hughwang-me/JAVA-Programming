package www.hughwang.me.tcp;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.transport.socket.nio.NioSocketConnector;
import www.hughwang.me.utils.L;

import java.net.InetSocketAddress;

/**
 * Created by wanghuan on 2017/8/8.
 */
public class MinaClient {

    public static void main(String[] args){
            MinaClient client = new MinaClient();
            client.connect();
    }

    public void connect(){
        NioSocketConnector connector = new NioSocketConnector();
        connector.setConnectTimeoutMillis(3 * 1000);
        connector.getFilterChain().addLast("logger", new MinaClientLogFilter());
        connector.setHandler(new MinaClientHandler());

        IoSession ioSession = null;

        for (;;){
            L.d("try connecting");
            try {
                ConnectFuture future = connector.connect(new InetSocketAddress("sh.keruis.com", 10099));
                future.awaitUninterruptibly();
                ioSession = future.getSession();
                L.d("connect success!");
                break;
            }catch (Exception e){
                e.printStackTrace();
                L.d("连接异常");
                try {
                    Thread.sleep(5 * 1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }

        ioSession.getCloseFuture().awaitUninterruptibly();
        connector.dispose();
        L.d("exit program");
    }

}
