package beans;

public class Student implements Comparable{
    private String id;
    private String name;
    private String age;
    private String sex;
    private String score;
    private String rank;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Student(String id, String name, String age, String sex, String score,String rank) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
        this.rank = rank;
    }


    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        int compare = id.compareTo(s.id);
        return compare;
    }
}
