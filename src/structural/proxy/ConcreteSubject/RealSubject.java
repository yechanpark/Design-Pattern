/**
 * @author yechanpark
 * @since 2018. 02. 16
 * @description Proxy Pattern - RealSubject
 * */
package structural.proxy.ConcreteSubject;

import structural.proxy.subject.Subject;

// on System A
// Client로부터 명령받은 ProxySubject에 의해 조작되는 진짜 Subject
public class RealSubject implements Subject {

    private String filename;

    public RealSubject(String filename) {
        this.filename = filename;
    }

    @Override
    public void operation() {
        System.out.println("RealSubject#  operation(), filename is " + filename);
    }
}
