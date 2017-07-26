package www.hughwang.me.数组;

/**
 * Created by wanghuan on 2017/7/26.
 */
public class 数组基础 {

    /**
     * 数组是引用数据类型
     */
    public 数组基础() {
    }

    public void 数组的定义() {
        int[] a = new int[3]; //定义并开辟数组空间
        int b[] = new int[4]; //[] 位置不区分

        int[] c = null; //先定义（栈）
        c = new int[5]; //后开辟空间（堆）
    }

    public void 数组的静态初始化() {
        int[] a = new int[]{1, 2, 3, 4};
    }

    public void 数组的动态初始化() {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
    }

}
