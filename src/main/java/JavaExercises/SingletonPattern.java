package JavaExercises;

public class SingletonPattern
{
    private static SingletonPattern singletonPatternObject;

    private SingletonPattern()
    {
        System.out.println("Object created");
    }

    public static synchronized SingletonPattern getSingleObject()
    {
        if (singletonPatternObject == null)
        {
            singletonPatternObject = new SingletonPattern();
        }
        return singletonPatternObject;
    }

    public static void destroySingletonObject(){
        singletonPatternObject = null;
        System.out.println("Object DESTROYED");
    }
}

class Test
{
    public static void main(String[] args) {
        SingletonPattern.getSingleObject();
        SingletonPattern.getSingleObject();
        SingletonPattern.destroySingletonObject();
        SingletonPattern.getSingleObject();
        SingletonPattern.getSingleObject();


    }
}