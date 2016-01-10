package net.devore.layoutcalc.domain;

/**
 * Class <code>Insets</code> contains the inset distance for an object from its container
 * Created by bdevore on 1/10/16.
 */
public class Insets {
    private float leftInset;
    private float topInset;
    private float rightInset;
    private float bottomInset;

    public Insets(float leftInset, float topInset, float rightInset, float bottomInset) {
        this.leftInset = leftInset;
        this.topInset = topInset;
        this.rightInset = rightInset;
        this.bottomInset = bottomInset;
    }

    public Insets() {
    }

    public float getLeftInset() {
        return leftInset;
    }

    public void setLeftInset(float leftInset) {
        this.leftInset = leftInset;
    }

    public float getTopInset() {
        return topInset;
    }

    public void setTopInset(float topInset) {
        this.topInset = topInset;
    }

    public float getRightInset() {
        return rightInset;
    }

    public void setRightInset(float rightInset) {
        this.rightInset = rightInset;
    }

    public float getBottomInset() {
        return bottomInset;
    }

    public void setBottomInset(float bottomInset) {
        this.bottomInset = bottomInset;
    }
}
