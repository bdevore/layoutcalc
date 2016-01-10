package net.devore.layoutcalc.domain;

/**
 * Class <code>Dimension</code> describes the height and width dimensions of an object
 * Created by benjamindevore on 1/3/16.
 */
public class Dimension {
    private float height;
    private float width;

    /**
     * Default constructor
     */
    public Dimension() {
    }

    /**
     * Populating constructor
     * @param height The height of the dimension
     * @param width The width of the dimension
     */
    public Dimension(float height, float width) {
        this.height = height;
        this.width = width;
    }

    /* Getters and setters */

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
