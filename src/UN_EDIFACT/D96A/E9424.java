package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9424  Array cell information  an..35
 * Contains the data for a cell in an array.
 */
public class E9424 extends Element {

    public E9424() {
        this(null);
    }

    public E9424(String Content) {
        super("9424", "Array cell information", "an..35", "Contains the data for a cell in an array.", "");
        this.setContent(Content);
    }
}

