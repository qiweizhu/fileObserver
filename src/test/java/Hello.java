/**
 * <br>这是一个helloworld类
 *
 * @author <a href="www.baidu.com">zhuqiwei</a>
 * @version 1.0
 * @since 1.0
 * @create 2018-02-26 15:47
 **/
public class Hello {
    /**
     * 默认的命名空间，其值为{@value}
     */
    public static final String DEFAULT_NS="_NS";
    /**
     * @see #id 编号
     */
    public int id;
    /**
     * @see #name 姓名
     */
    public String name;

    /**
     * @see #sayHello(String) 这是一个向世界说你好的方法
     * @param name sayHello对象
     * @return hello world
     */
    public String sayHello(String name) {
        return "hello "+name;
    }
}
