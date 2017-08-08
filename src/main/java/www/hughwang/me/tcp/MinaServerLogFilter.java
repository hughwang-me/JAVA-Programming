package www.hughwang.me.tcp;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import www.hughwang.me.utils.L;

/**
 * Created by wanghuan on 2017/8/8.
 */
public class MinaServerLogFilter extends IoFilterAdapter {

    @Override
    public void sessionCreated(NextFilter nextFilter, IoSession session) throws Exception {
        L.d("新的连接创建 : " + session.getId());
    }

    @Override
    public void sessionOpened(NextFilter nextFilter, IoSession session) throws Exception {
        L.d("新的连接被打开 : " + session.getId());
    }

    @Override
    public void sessionIdle(NextFilter nextFilter, IoSession session, IdleStatus status) throws Exception {
        L.d("连接闲置中 : " + session.getId());
    }

    @Override
    public void sessionClosed(NextFilter nextFilter, IoSession session) throws Exception {
        L.d("连接被关闭 : " + session.getId());
    }

    @Override
    public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
        L.d("接收到新消息 : " + session.getId());


    }

    @Override
    public void messageSent(NextFilter nextFilter, IoSession session, WriteRequest writeRequest) throws Exception {
        L.d("已经发送消息 : " + session.getId());
        String text = writeRequest.getMessage().toString();
        L.d("消息内容是 : " + text);
    }

}
