package com.company;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

class ImageFrame extends JFrame {

    public ImageFrame()
    {
        setTitle("vezdekod 10");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        ImageComponent component = new ImageComponent();
        add(component);
    }
    public static final int DEFAULT_WIDTH = 800;
    public static final int DEFAULT_HEIGHT = 600;


}
class ImageComponent extends JComponent
{
    public ImageComponent()
    {
        try
        {
            image = ImageIO.read(new File("src/wattermellom.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        g.drawImage(image, 70, 70, null);

    }
    private Image image;
}