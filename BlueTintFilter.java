import java.awt.Color;

/**
 * Write a description of class GreenChannelFilter here.
 *
 * @author Kenny Castro-Monroy
 * @version 2021.04.19
 */
public class BlueTintFilter extends Filter {
    /**
     * Constructor for objects of class DarkerFilter.
     * 
     * @param name The name of the filter.
     */
    public BlueTintFilter(String name) {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param image The image to be changed by this filter.
     */
    public void apply(OFImage image) {
        int height = image.getHeight();
        int width = image.getWidth();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                int r = pixel.getRed();
                int g = pixel.getGreen();
                int b = 255;

                image.setPixel(x, y, new Color(r, g, b));

            }
        }
    }
}
