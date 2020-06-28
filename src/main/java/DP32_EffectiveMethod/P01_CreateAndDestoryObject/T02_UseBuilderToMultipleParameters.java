package DP32_EffectiveMethod.P01_CreateAndDestoryObject;

/*
    @名称: 多个构造器参数时要考虑用构建器(Builder)
    @描述: 提供第一个只有必要参数的构造器，第二个构造器有一个可选参数，
            第三个有两个可选参数，以此类推，最后一个构造器包含所有可选参数。(重叠构造器模式)
            让客户端利用所有必要的参数调用构造器（或者静态工厂），得到一个builder对象。然后客户端调用无参的  build  方法来生成不可变的对象。
    @注意: 如果一开始就使用构造器或者静态工厂，等到类需要多个参数时才添加构建器，就会无法控制，那些过时的构造器或者静态工厂显得十分不协调。
            因此，通常最好一开始就使用构建器。
            简而言之， 如果类的构造器或者静态工厂中具有多个参数，设计这种类时，Builder模式就是种不错的选择。
    @优点: Builder像个构造器一样，可以对其参数强加约束条件。  build  方法可以检验这些约束条件。
            Builder模式的略微优势在于，builder可以有多个可变（varargs）参数。
            Builder模式十分灵活，可以利用单个builder构建多个对象。
    @缺点: 为了创建对象，必须先创建它的构建器。虽然创建构建器的开销在实践中可能不那么明显，但是在某些十分注重性能的情况下，可能就成问题了。
            Builder模式还比重叠构造器更加冗长，因此它只有在很多参数的时候才使用，比如4个或者更多个参数。
    @例如:
           // A builder for objects of type T
           public   interface   Builder < T >  {
                 public  T  build () ;
           }
 */

public class T02_UseBuilderToMultipleParameters {
    public static void main(String[] args) {
        Student stu = new Student.StudentBuilder(101, "LEO")
                .sex("男").age(20).weight((float)(100.0)).height((float)(180.0)).build();

        System.out.println(stu.toString());
    }
}

class Student {
    private int stu_id;
    private String name;
    private String sex;
    private int age;
    private float height;
    private float weight;

    static class StudentBuilder {
        private int stu_id;
        private String name;
        private String sex = "未知";
        private int age = 0;
        private float height = 0;
        private float weight = 0;

        public StudentBuilder(int stu_id, String name) {
            this.stu_id = stu_id;
            this.name = name;
        }

        public StudentBuilder sex(String val) {
            this.sex = val;
            return this;
        }

        public StudentBuilder age(int val) {
            this.age = val;
            return this;
        }

        public StudentBuilder height(float val) {
            this.height = val;
            return this;
        }

        public StudentBuilder weight(float val) {
            this.weight = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public Student(StudentBuilder studentBuilder) {
        this.stu_id = studentBuilder.stu_id;
        this.name = studentBuilder.name;
        this.sex = studentBuilder.sex;
        this.age = studentBuilder.age;
        this.weight = studentBuilder.weight;
        this.height = studentBuilder.height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

/*
    // 补充构造器，多参数处理方法 ((重叠构造器模式))

class DefaultStudent {
    final static public String SEX = "未知";
    final static public int AGE = 0;
    final static public float HEIGHT = (float) 0.0;
    final static public float WEIGHT = (float) 0.0;
}
class Student {
    private int stu_id;
    private String name;
    private String sex;
    private int age;
    private float height;
    private float weight;

    public Student(int stu_id, String name) {
        this(stu_id, name, DefaultStudent.SEX);
    }

    public Student(int stu_id, String name, String sex) {
        this(stu_id, name, sex, DefaultStudent.AGE);
    }

    public Student(int stu_id, String name, String sex, int age) {
        this(stu_id, name, sex, age, DefaultStudent.HEIGHT);
    }

    public Student(int stu_id, String name, String sex, int age, float height) {
        this(stu_id, name, sex, age, height, DefaultStudent.WEIGHT);
    }

    public Student(int stu_id, String name, String sex, int age, float height, float weight) {
        this.stu_id = stu_id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}

 */