package www.hughwang.me.封装;

import www.hughwang.me.utils.L;

/**
 * Created by wanghuan on 2017/7/26.
 */
public class Book2 {

    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

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
