/**
 * @author yechanpark
 * @since 2018. 02. 16
 * @description Proxy Pattern - ProxySubject
 * */
package structural.proxy.concretesubject;

import structural.proxy.subject.Subject;

// on System B
// Client에서 조작하는 Subject, RealSubject에 명령을 내리는 것 같지만 이쪽으로 명령함
// RealSubject를 수행하기 전 Pre/Post Execution 가능
public class ProxySubject1 implements Subject {

    private Subject subject = null;

    public ProxySubject1(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        preOperation();
        subject.operation(); // Delegation
        postOperation();

    }

    private void preOperation() {
        System.out.println(this.getClass().getSimpleName() + "# preOperation()");
    }

    private void postOperation() {
        System.out.println(this.getClass().getSimpleName() + "# postOperation()");
    }
}
