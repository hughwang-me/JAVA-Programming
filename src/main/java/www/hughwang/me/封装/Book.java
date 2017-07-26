package www.hughwang.me.封装;

import www.hughwang.me.utils.L;

/**
 * Created by wanghuan on 2017/7/26.
 */
public class Book {

    String name;
    float price;

    public void log(){
        L.d(toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
