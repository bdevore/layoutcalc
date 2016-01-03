package net.devore.domain;

/**
 * Class <code>MattedObject</code> is an abstract base class that describes an object that can be placed under a matte board
 * Created by benjamindevore on 1/3/16.
 */
public abstract class MattedObject {
    private String label;
    private Dimension dimensions;
    private float topOverlap;
    private float rightOverlap;
    private float bottomOverlap;
    private float leftOverlap;

    /**
     * Default constructor
     */
    public MattedObject(String label) {
        this.label = label;
    }

    /**
     * Populating constructor, setting all overlap to the same value
     * @param label A name to use when describing the object
     * @param dimensions The height and width of the object
     * @param overlap The amount of overlap for the matte board over the object
     */
    public MattedObject(String label, Dimension dimensions, float overlap) {
        this.label = label;
        this.dimensions = dimensions;
        this.topOverlap = overlap;
        this.rightOverlap = overlap;
        this.bottomOverlap = overlap;
        this.leftOverlap = overlap;
    }

    /**
     * Populating constructor
     * @param label A name to use when describing the object
     * @param dimensions The height and width of the object
     * @param topOverlap The amount of top overlap
     * @param rightOverlap The amount of right overlap
     * @param bottomOverlap The amount of bottom overlap
     * @param leftOverlap The amount of left overlap
     */
    public MattedObject(String label, Dimension dimensions, float topOverlap, float rightOverlap, float bottomOverlap, float leftOverlap) {
        this.label = label;
        this.dimensions = dimensions;
        this.topOverlap = topOverlap;
        this.rightOverlap = rightOverlap;
        this.bottomOverlap = bottomOverlap;
        this.leftOverlap = leftOverlap;
    }

    /* Getters and setters */
    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public float getTopOverlap() {
        return topOverlap;
    }

    public void setTopOverlap(float topOverlap) {
        this.topOverlap = topOverlap;
    }

    public float getRightOverlap() {
        return rightOverlap;
    }

    public void setRightOverlap(float rightOverlap) {
        this.rightOverlap = rightOverlap;
    }

    public float getBottomOverlap() {
        return bottomOverlap;
    }

    public void setBottomOverlap(float bottomOverlap) {
        this.bottomOverlap = bottomOverlap;
    }

    public float getLeftOverlap() {
        return leftOverlap;
    }

    public void setLeftOverlap(float leftOverlap) {
        this.leftOverlap = leftOverlap;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
