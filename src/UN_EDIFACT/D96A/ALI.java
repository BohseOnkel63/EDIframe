package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ALI extends Segment {

    public E3239 e3239;
    public E9213 e9213;
    public E4183 e4183_1;
    public E4183 e4183_2;
    public E4183 e4183_3;
    public E4183 e4183_4;
    public E4183 e4183_5;

    public ALI() {
        this(false);
    }

    public ALI(Boolean Mandatory) {
        super("ALI", "ADDITIONAL INFORMATION", "Function: To indicate that special conditions due to the origin,");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3239, e9213, e4183_1, e4183_2, e4183_3, e4183_4, e4183_5}));
    }

}
