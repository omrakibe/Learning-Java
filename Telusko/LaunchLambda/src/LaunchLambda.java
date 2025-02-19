@FunctionalInterface
interface ITelusko
{
    void disp();
}

public class LaunchLambda
{
    public static void main(String[] args)
    {
        ITelusko telusko = () -> {
            System.out.println("Implemented in disp");
        };
        telusko.disp();
    }
}