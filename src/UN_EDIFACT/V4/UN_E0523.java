package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0523  Use of algorithm, coded  an..3
 * Specification of the usage made of the algorithm.
 */
public class UN_E0523 extends Element {

    public UN_E0523() {
        this(null);
    }

    public UN_E0523(String Content) {
        super("0523", "Use of algorithm, coded", "an..3", "Specification of the usage made of the algorithm.");
        this.setContent(Content);
    }
}

