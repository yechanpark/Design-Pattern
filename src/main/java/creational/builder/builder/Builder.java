package creational.builder.builder;

// 자료형이 T인 객체에 대한 빌더.
// 어떤 자료형의 객체를 만드는 빌더냐에 관계 없이 모든 빌더에 적용이 가능하다.
public interface Builder<T> {
    public T build();
}
