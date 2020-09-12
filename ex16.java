public class ex16 {
    int speed = 0;

    public void increase(int value)
    {
        speed = speed +value;
    }
    public void decrease(int value)
    {
        speed = speed - value;
    }
    public void stop()
    {
        speed = 0;
    }
    public void  showCurrentSpeed(){
        System.out.println("Aktualna prędkośc samochodu:");
        System.out.println(speed);
    }


}
