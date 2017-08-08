package www.hughwang.me.utils;

import org.apache.log4j.Logger;

/**
 * Created by wanghuan on 2017/7/25.
 */
public class L {

    public static final String SERVER_TAG = "上海 : 9095";

    private static Logger logger = Logger.getLogger(L.class);

    public static void f(String message){
        logger.fatal(SERVER_TAG + " : "+ message);
    }

    public static void e(String message){
        logger.error(SERVER_TAG + " : "+ message);
    }

    public static void w(String message){
        logger.warn(SERVER_TAG + " : "+ message);
    }

    public static void i(String message){
        logger.info(SERVER_TAG + " : "+ message);
    }

    public static void d(String message){
        logger.debug(SERVER_TAG + " : "+ message);
    }

    public static void t(String message){
        logger.trace(SERVER_TAG + " : "+ message);
    }
}
