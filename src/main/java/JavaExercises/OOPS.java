package JavaExercises;
//super class
abstract class OOPS
{
    abstract void paint();
    void display(){
        System.out.println("Concrete method");
    }
}

class A extends OOPS{
    @Override
    void paint(){
        System.out.println("Paint in class JavaExercises.A");
    }
    void paint(String s){
        System.out.println("Overloaded paint in class JavaExercises.A");
    }
}
//child class
class B extends A
{
    B(){
        super();
    }

    private String paintColor;
    void setPaintColor(String paintColor){
        this.paintColor = paintColor;
    }
    String getPaintColor(){
        return paintColor;
    }
    @Override
    void paint(String paintColor){
        System.out.println("Overridden paint() in class JavaExercises.B with setColor(): "+getPaintColor());
    }
}

//main method
class TestMethods{
    public static void main(String[] args) {
        B b = new B();
        b.setPaintColor("Blue");
        b.paint(b.getPaintColor());
        b.paint();
    }
}