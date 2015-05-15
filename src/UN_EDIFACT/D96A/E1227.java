package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1227  Calculation sequence indicator, coded  an..3
 * Code indicating the sequence of cumulated calculations to be agreed between interchange partners.
 */
public class E1227 extends Element {

    public E1227() {
        this(null);
    }

    public E1227(String Content) {
        super("1227", "Calculation sequence indicator, coded", "an..3", "Code indicating the sequence of cumulated calculations to be agreed between interchange partners.", "");
        this.setContent(Content);
    }
}

