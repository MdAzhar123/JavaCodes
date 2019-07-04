import java.text.DecimalFormat;
public class DecimalFormatDemo
{
  public static void main(String[] s)
  {
    double x=12.34666666;
    //Creating an object of DecimalFormat class
    //that will contain the decimal formatting specification
    DecimalFormat df=new DecimalFormat("#####.##");
    //Applying the format on 'x'
    String strX=df.format(x);
    System.out.println("strX="+strX);
  }
}
    

