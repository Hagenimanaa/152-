public class compound 
{
    public double compoundinterest(double p,double r,double t)
    {
        return(p*(1+r/12)*t);
    }

    public static void main(String[] args)
     {
      
        compund hh= new compund();
        double pr=500;
        double rt=18;
        double tm=3;
        double Answer=hh.compoundinterest(pr,rt,tm);
        System.out.println("+compound interest is"+Answer);
    }

}