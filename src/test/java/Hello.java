/**
 * <br>����һ��helloworld��
 *
 * @author <a href="www.baidu.com">zhuqiwei</a>
 * @version 1.0
 * @since 1.0
 * @create 2018-02-26 15:47
 **/
public class Hello {
    /**
     * Ĭ�ϵ������ռ䣬��ֵΪ{@value}
     */
    public static final String DEFAULT_NS="_NS";
    /**
     * @see #id ���
     */
    public int id;
    /**
     * @see #name ����
     */
    public String name;

    /**
     * @see #sayHello(String) ����һ��������˵��õķ���
     * @param name sayHello����
     * @return hello world
     */
    public String sayHello(String name) {
        return "hello "+name;
    }
}
