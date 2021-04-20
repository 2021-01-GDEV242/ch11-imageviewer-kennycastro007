import java.awt.Color;

/**
 * Write a description of class GreenChannelFilter here.
 *
 * @author Kenny Castro-Monroy
 * @version 2021.04.19
 */
public class GreenChannelFilter extends Filter {
    /**
     * Constructor for objects of class DarkerFilter.
     * 
     * @param name The name of the filter.
     */
    public GreenChannelFilter(String name) {
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
                int g = pixel.getGreen();

                if (g > 125) {
                    image.setPixel(x, y, Color.white);
                } else {
                    image.setPixel(x, y, Color.black);
                }

            }
        }
    }
}
