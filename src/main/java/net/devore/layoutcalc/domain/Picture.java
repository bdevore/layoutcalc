package net.devore.layoutcalc.domain;

/**
 * Created by benjamindevore on 1/3/16.
 */
public class Picture extends MattedObject {
    /**
     * Populating constructor, setting all overlap to the same value
     *
     * @param label      A name to use when describing the object
     * @param dimensions The height and width of the object
     * @param overlap    The amount of overlap for the matte board over the object
     */
    public Picture(String label, Dimension dimensions, float overlap) {
        super(label, dimensions, overlap);
    }

    /**
     * Default constructor
     *
     * @param label
     */
    public Picture(String label) {
        super(label);
    }
}
