package www.hughwang.me.堆栈;

import www.hughwang.me.utils.L;

/**
 * Created by wanghuan on 2017/7/25.
 */
public class 堆栈基础 {

    class Person {
        String name;
        int age;

        public Person() {
        }

        public void log(){
            L.d(toString());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public void heapStack1(){
        Person person = null; // 栈分配 堆中无数据
        person = new Person(); // 在堆中分配空间
        person.name = "hughwang"; // 在堆中保存值
        person.log();
    }

    public void heapStack2(){
        Person person = new Person(); // 在堆中分配空间 并在栈中保存堆的引用地址
        person.name = "hughwang"; // 在堆中保存值
        person.log();
    }

    public void heapStack3(){
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "name1";
        person1.age = 10;

        person2.name = "name2";
        person2.age = 20;

        person2 = person1; //栈中 person2 指向的的老引用堆被视为垃圾 准备GC回收  同时指向新的引用堆 person1 的堆地址

        person2.log();
    }

    public static void main(String[] args){


    }

}
