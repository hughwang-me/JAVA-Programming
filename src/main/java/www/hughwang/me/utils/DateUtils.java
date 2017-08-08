package www.hughwang.me.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wanghuan on 2017/8/8.
 */
public class DateUtils {

    public static String getCurrentTimeFormat(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }

}
