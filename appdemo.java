import java.applet.*;
import java.awt.*;
/*
<applet code="appdemo2.class" width="300" height="400">
<param name = "first" value="34">
<param name ="second" value="56">
</applet>
*/

public class appdemo
{
    int x,y,z;
    public void init()
    {
        x=Integer.parseInt(getParam("first"));
        y=Integer.parseInt(getParam("second"));
        z=x+y;

    }
    
    public void paint(Graphic g)
    {
        g.drawString(String.valueOf(x),50,60);
        g.drawString(String.valueOf(y),50,70);
        g.drawString("+_______",48,80);
        g.drawString(String.valueOf(z),50,90);
    }
    //sonu
    //yash
}
