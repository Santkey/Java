public class ex15 {

    public  float add(float n1, float n2)
    {
        return n1 + n2;
    }
    public  float substract(float n1, float n2)
    {
        return n1 - n2;
    }

    public  float multiply(float n1, float n2)
    {

        return n1 * n2;
    }
    public  float divide(float n1, float n2)
    {
        if(n2 == 0){
            System.out.println("Nie można dzielić przez 0!");
            return -1;
        }
        return n1 / n2;
    }
    public float module(int a, int b) {
        return a % b;

    }


}
