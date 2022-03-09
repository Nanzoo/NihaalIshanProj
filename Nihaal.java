interface Quotient
{
    public void qTime();
}

class VRClass implements Quotient
{
    public void qTime(float numOne, float numTwo)
    {
        float quo = numOne/numTwo;
        
        System.out.printf(" %.3f",quo);

    }
}

class Main
{
    public static void main(String[]args)
    {
        VRClass vr = new VRClass();
        vr.qTime(19f,5f);
    }
}