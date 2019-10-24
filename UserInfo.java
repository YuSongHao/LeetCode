import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program:MyIdeaTest
 * @description:
 * @author:JasonYu
 * @date:2019-09-24 16-10
 **/
public class UserInfo {
    static interface Service{
        void add();
        void delete();
        void update();
    }
    static class ServiceImpl implements Service
    {

        @Override
        public void add() {
            System.out.println("add");
        }

        @Override
        public void delete() {
            System.out.println("delete");
        }

        @Override
        public void update() {
            System.out.println("update");
        }
    }
    static class ProxyInvocationHandler implements InvocationHandler{
        private Map<String, AtomicInteger> callCounts;
        private Service target;
        public ProxyInvocationHandler(Service target){
            this.target = target;
            callCounts = new HashMap<>();//1
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
            String key = method.getName();//2
            if(!callCounts.containsKey(key))
                callCounts.put(key,new AtomicInteger(0));
            callCounts.get(key).intValue();
            return target;
        }
        public int get(String key)
        {
            return callCounts.get(key).intValue();
        }

//        public static void main(String[] args) {
//            Service subject = new ServiceImpl();
//            ProxyInvocationHandler handler = new ProxyInvocationHandler(subject);
//            Service subjectProxy = (Service)Class.forName(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
//            subjectProxy.add();
//            subjectProxy.delete();
//            subjectProxy.delete();
//            subjectProxy.update();
//            subjectProxy.update();
//            subjectProxy.update();
//            System.out.println(handler.get("delete"));
//        }
    }
}
