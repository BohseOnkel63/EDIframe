package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6411  Measure unit qualifier  an..3
 * Indication of the unit of measurement in which weight (mass), capacity, length, area, volume or other quantity is expressed.
 */
public class E6411 extends Element {

    public E6411() {
        this(null);
    }

    public E6411(String Content) {
        super("6411", "Measure unit qualifier", "an..3", "Indication of the unit of measurement in which weight (mass), capacity, length, area, volume or other quantity is expressed.", "See UN/ECE Recommendation 20.");
        this.setContent(Content);
    }
}

