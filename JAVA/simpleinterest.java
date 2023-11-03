public class simpleinterest
 {
    public double calcinterest(double p,double r,double t)
    {
        return(p*(r/100)*t);
    }
    public static void main(String[] args) 
    {
        simpleinterest aa= new simpleinterest();
        double pr=100000;
        double rt=5;
        double tm=5;
        double result= aa.calcinterest(pr,rt,tm);
        System.out.println("+interest is"+result);
    }
}