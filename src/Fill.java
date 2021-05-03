import java.awt.image.BufferedImage;

public class Fill
{
    public static void recursiveFill(BufferedImage img, int x, int y, int newColor, int oldColor)
    {
        boolean[] conditions = {x >= 0, x < img.getWidth(), y >= 0, x < img.getHeight(),
                img.getRGB(x, y) == oldColor, img.getRGB(x, y) != newColor};
        /*boolean condition2 = x < img.getWidth();
        boolean condition3 = y >= 0;
        boolean condition4 = x < img.getHeight();
        boolean condition5 = img.getRGB(x, y) == oldColor;
        boolean condition6 = img.getRGB(x, y) != newColor;*/

        if (conditions[0] && conditions[1] && conditions[2] && conditions[3] && conditions[4] && conditions[5])
        {
            img.setRGB(x, y, newColor);
            recursiveFill(img, x + 1, y, oldColor, newColor);
            recursiveFill(img, x - 1, y, oldColor, newColor);
            recursiveFill(img, x, y + 1, oldColor, newColor);
            recursiveFill(img, x, y - 1, oldColor, newColor);
        }
    }

    public static void recursiveLineFill(BufferedImage img, int x, int y, int newColor, int oldColor)
    {
        
    }
}
