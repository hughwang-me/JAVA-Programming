package www.hughwang.me.tcp;

import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.SocketSessionConfig;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import www.hughwang.me.utils.L;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by wanghuan on 2017/8/8.
 */
public class MinaServer {



    private final static int PORT = 9091;

    private final static int READ_BUFFER_SIZE = 1024;

    private final static int SESSION_IDLE = 30 * 1000;


    public static void main(String[] args){
        L.e("Start Mina Server at port : " + PORT);
        SocketAcceptor socketAcceptor = new NioSocketAcceptor();

        socketAcceptor.getFilterChain().addFirst("logFilter" , new MinaServerLogFilter());

        socketAcceptor.setHandler(new MinaServerHandler());
        SocketSessionConfig socketSessionConfig = socketAcceptor.getSessionConfig();
        socketSessionConfig.setReadBufferSize(READ_BUFFER_SIZE);
        socketSessionConfig.setBothIdleTime(SESSION_IDLE);

        try {
            socketAcceptor.bind(new InetSocketAddress(PORT));
            L.f("Mina start success");
        } catch (IOException e) {
            e.printStackTrace();
            L.f("Mina start failure");
        }

    }
}
