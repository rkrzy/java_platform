package Weekend_8.StudentSortTest_0703;

public class Person implements MyMovable{
    String name;
    Person(String name)
    {
        this.name = name;
    }

    @Override
    public String moveBy() {
        return String.format("나는 %s로 출근한다.",this.name);
    }
}
