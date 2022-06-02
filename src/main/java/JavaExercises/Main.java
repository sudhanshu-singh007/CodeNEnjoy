package JavaExercises;

class Parent {
    protected int x, y;
}

class Child extends Parent {
    Child() {
        this.x = this.y = 1;
    }

    public static void main(String a[]) {
        Parent app = new Parent();
        System.out.println(app.x + " " + app.y);
    }
}


