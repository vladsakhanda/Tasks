package task.T20;

public class Main {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        ParentClass simpleClass1 = new SimpleClass();

//        AbstractClass abstractClass = new AbstractClass();
////        AbstractClass child2Class = new Child2Class();
//        child2Class.setName("Roman");
//        System.out.println(child2Class.getName());
//        child2Class.display();
//        child2Class.getInfo();

    }


}



class ParentClass {
}

class ChildClass extends SimpleClass {
}


class SimpleClass extends ParentClass {
    String name;

    {
        name = null;
    }

    SimpleClass() {

    }

    void display() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class InnerClass {

    }
}

