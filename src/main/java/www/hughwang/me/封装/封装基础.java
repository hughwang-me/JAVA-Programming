package www.hughwang.me.封装;

import org.junit.Test;
import www.hughwang.me.utils.L;

/**
 * Created by wanghuan on 2017/7/26.
 */
public class 封装基础 {

    @Test
    public void run(){

        /**
         * Book 无封装 直接访问对象的属性
         */
        Book book = new Book();
        book.name = "java hand book";
        book.price = -1.4f;
        book.log();

        /**
         * Book2 封装后 通过 setter getter 对对象实例的属性进行访问操作
         */
        Book2 book2 = new Book2();
        book2.setName("java hand book 2");
        book2.setPrice(1.5f);
        book2.log();
    }

}
