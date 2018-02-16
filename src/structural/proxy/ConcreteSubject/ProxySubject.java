/**
 * @author yechanpark
 * @since 2018. 02. 16
 * @description Proxy Pattern - ProxySubject
 * */
package structural.proxy.ConcreteSubject;

import structural.proxy.subject.Subject;

// on System B
// Client에서 조작하는 Subject, RealSubject에 명령을 내리는 것 같지만 이쪽으로 명령함
// RealSubject를 수행하기 전 Pre/Post Execution 가능
public class ProxySubject implements Subject {

    private RealSubject realSubject = null;
    private String filename;

    public ProxySubject(String filename) {
        this.filename = filename;
    }

    @Override
    public void operation() {
        preOperation();
        realSubject.operation();
        postOperation();

    }

    private void preOperation() {
        if(realSubject == null) {
            realSubject = new RealSubject(filename);
            System.out.println("ProxySubject# preOperation()");
        }
    }

    private void postOperation() {
        System.out.println("ProxySubject# postOperation()");
    }
}
