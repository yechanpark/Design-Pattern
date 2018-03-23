/**
 * @author yechanpark
 * @since 2018. 02. 16
 * @description Proxy Pattern - Client
 * */
package structural.proxy;

import structural.proxy.concretesubject.ProxySubject1;
import structural.proxy.concretesubject.ProxySubject2;
import structural.proxy.concretesubject.RealSubject;
import structural.proxy.naive.Server;
import structural.proxy.subject.Subject;

public class Client {
    public static void main(String args[]){
        RealSubject realSubject = new RealSubject("filename"); // 실제 서버
        Subject subject1 = new ProxySubject1(realSubject); // 로깅
        Subject subject2 = new ProxySubject2(subject1); // 인증
        subject2.operation();

        System.out.println();

        subject2 = new ProxySubject2(realSubject);
        subject2.operation();

    }
}
