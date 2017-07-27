package www.hughwang.me.String;

import org.junit.Test;

/**
 * Created by wanghuan on 2017/7/26.
 */
public class String基础 {

    public void 引用对象类型(){

    }

    @Test
    public void 字符串比较(){
        // "==" 和 equals
        // "==" 比较的是栈中地址
        // equals 比较的是字符串内容

        String strA = "abc";
        String strB = new String("abc");
        String strC = "abc";
        String strD = strC;
        System.out.println(strA == strB);
        System.out.println(strA == strC);
        System.out.println(strA == strD);

        System.out.println(strB == strC);
        System.out.println(strB == strD);

        System.out.println(strC == strD);
    }

    public void 字符串的匿名对象(){

    }

    /**
     * JVM 的匿名对象池
     */
    public void 字符串两种实例化的区别(){
        String a = "abc";
        String b = new String("abc");

        String c = new String("abc").intern(); // intern() 手工入池
    }

    /**
     * 字符串创建后不可以改变 连接改变的是引用对象地址
     */
    public void 字符串相加连接(){
        String a = "abc";
        a = a + " def";
        a += "ghi";
        //观察内存空间的堆栈变化
    }
}
