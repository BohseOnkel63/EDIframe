package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7106  Shipment flashpoint  n3
 * Temperature in centigrade determined by the closed cup test as per ISO 1523/73 where a vapour is given off that can be ignited.
 */
public class E7106 extends Element {

    public E7106() {
        this(null);
    }

    public E7106(String Content) {
        super("7106", "Shipment flashpoint", "n3", "Temperature in centigrade determined by the closed cup test as per ISO 1523/73 where a vapour is given off that can be ignited.", "");
        this.setContent(Content);
    }
}

