interface Hello
{
    int []Numbers = {0,1,3,4,4};
}

class World implements Hello
{
    void helloWorld()
    {
        for(int i=0; i<Numbers.length; i++)
        {
            System.out.println(Numbers[i]);
        }
    }
}

public class LaunchArrayInInterface
{
    public static void main(String[] args)
    {
        new World().helloWorld();
    }
}
