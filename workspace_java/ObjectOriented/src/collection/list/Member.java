package collection.list;

public class Member {
    //5. 아이디와 비밀번호, 이름, 나이를 정보로 가지는 Member 클래스를 만들자.
    // 해당 클래스에서 각 필드에 대한 setter와 getter를 만들고,
    // 아이디, 비밀번호, 이름, 나이 정보를 출력할 수 있게 toString() 메소드를 오버라이딩하여 구현하여라.

   private String id;
   private String password;
   private String name;
   private int age;

    public Member(){}

    public Member(String id, String password, String name, int age) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
    }







//    public void Member(String id1, String password1, String name1, int age1){
//
//        id = id1;
//        password = password1;
//        name = name1;
//        age = age1;
//
//
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Test5_8{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
