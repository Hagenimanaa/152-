public class compund 
{
    public double compoundinterest(double p,double r,double t)
    {
        return p*Math.pow(1+(r/12),(12*t));
    }

    public static void main(String[] args)
     {
      compund hh= new compund();
        double pr=500000;
        double rt=0.18;
        double tm=3;
        double Answer=hh.compoundinterest(pr,rt,tm);
        System.out.println("+compound interest is"+Answer);
    }

}