package www.hughwang.me.重载;

/**
 * Created by wanghuan on 2017/7/25.
 */
public class 构造方法的重载 {

    private int id;
    private String name;
    private String address;

    public 构造方法的重载() {
    }

    public 构造方法的重载(int id) {
        this.id = id;
    }

    public 构造方法的重载(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public 构造方法的重载(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


}
