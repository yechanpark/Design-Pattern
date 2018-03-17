/**
 * @author yechanpark
 * @since 2018. 02. 16
 * @description Proxy Pattern - Client
 * */
package structural.proxy;

import structural.proxy.ConcreteSubject.ProxySubject;
import structural.proxy.subject.Subject;

public class Client {
    public static void main(String args[]){
        Subject subject1 = new ProxySubject("file1");
        Subject subject2 = new ProxySubject("file2");

        subject1.operation(); // need Instantiate (ProxySubject's preOperation())
        subject1.operation(); // no need Instantiate

        subject2.operation(); // need Instantiate (ProxySubject's preOperation())
        subject2.operation(); // no need Instantiate

        subject1.operation(); // no need Instantiate

    }
}
