/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - Book (Model)
 * */
package behavioral.iterator.model;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
