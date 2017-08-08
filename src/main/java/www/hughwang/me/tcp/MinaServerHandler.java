package www.hughwang.me.tcp;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import www.hughwang.me.utils.L;

/**
 * Created by wanghuan on 2017/8/8.
 */
public class MinaServerHandler extends IoHandlerAdapter {

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        super.sessionCreated(session);
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
        super.sessionOpened(session);
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        super.sessionIdle(session, status);
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        super.sessionClosed(session);
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        IoBuffer ioBuffer = (IoBuffer) message;
        byte[] bytes = new byte[ioBuffer.limit()];
        ioBuffer.get(bytes);
        String str = "";
        for (byte b : bytes) {
            String s16 = Integer.toHexString(b);
            if(s16.length() == 1){
                str += "0" + s16;
            }else if(s16.length() == 2){
                str += s16;
            }else if(s16.length() > 2){
                str += s16.substring(s16.length() - 2, s16.length());
            }else {
                str += "00";
            }
        }
        L.d("消息内容 ：" + str.toUpperCase());

        session.write("msg received!".getBytes("UTF-8"));
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        super.messageSent(session, message);
    }


    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        L.d("连接发生异常 : " + session.getId());
        String msg = cause.getMessage();
        L.d("异常信息 : " + msg);
    }

}
