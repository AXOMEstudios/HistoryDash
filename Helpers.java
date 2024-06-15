import greenfoot.*;

public class Helpers  
{
    public static void setImageSize(int sx, int sy, Actor obj) {
        GreenfootImage image = obj.getImage();
        
        if (sy == -1) {
            double ratio = ((double)(image.getWidth()) / image.getHeight());
            image.scale(sx, (int)(sx / ratio));
        } else {
            image.scale(sx, sy);
        }
        
        obj.setImage(image);
    }
    
    public static int clampInt(int num, int min, int max) {
        if (num < min) return min;
        if (num > max) return max;
        return num;
    }
}
