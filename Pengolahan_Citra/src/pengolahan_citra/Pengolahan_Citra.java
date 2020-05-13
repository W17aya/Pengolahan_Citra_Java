package pengolahan_citra;

import javax.swing.*;
import java.awt.*;

public class Pengolahan_Citra extends Canvas 
{

    public void paint(Graphics g)
    {
    }
}

class Menggambar extends JFrame
{
    Pengolahan_Citra gambar=new Pengolahan_citra();
    Menggambar()
    {
        super("Aplikasi Grafis");
        setLocation(100,100);
        setSize(250,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
    void KomponenVisual()
    {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().action(gambar,BorderLayout.Center);
        setVisible(true);
    }
 
    public static void main (String[] args)
    {
        Menggambar g1= new Menggambar();
        g1.KomponenVisual();
    }
    }