package www.hughwang.me.tcp;


import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

/**
 * Created by wanghuan on 2017/8/8.
 */
public class MinaClientLogFilter extends IoFilterAdapter {

    @Override
    public void sessionCreated(NextFilter nextFilter, IoSession session) throws Exception {
        super.sessionCreated(nextFilter, session);
    }

    @Override
    public void sessionOpened(NextFilter nextFilter, IoSession session) throws Exception {
        super.sessionOpened(nextFilter, session);
    }

    @Override
    public void sessionIdle(NextFilter nextFilter, IoSession session, IdleStatus status) throws Exception {
        super.sessionIdle(nextFilter, session, status);
    }

    @Override
    public void sessionClosed(NextFilter nextFilter, IoSession session) throws Exception {
        super.sessionClosed(nextFilter, session);
    }

    @Override
    public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
        super.messageReceived(nextFilter, session, message);
    }

    @Override
    public void messageSent(NextFilter nextFilter, IoSession session, WriteRequest writeRequest) throws Exception {
        super.messageSent(nextFilter, session, writeRequest);
    }

}
