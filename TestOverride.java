Class Bank
{
int RateOfIntrest()
{
return 0;
}
}
Class SBI extend Bank
{
SBI RateOfIntrest()
{
return 6;
}
}
Class ICICI extend Bank
{
ICICI RateofIntrest()
{
return 7;
}
}
Class AXIS extend Bank
{
AXIS RateOfIntrest()
{ 
return 8;
}
}
Class TestOverride()
{
public static void main(String args[])
{
SBI s=new SBI RateOfIntrest
ICICI i=new ICICI RateOfIntrest
AXIS a=new AXIS RateOfIntrest
{
system.out.println("SBI RateOfIntrest",s.SBI RateOFIntrest);
system.out.println("ICICI RateOfIntrest",i.ICICI RateOFIntrest);
system.out.println("AXIS RateOfIntrest",a.AXIS RateOFIntrest);
}
}
}
