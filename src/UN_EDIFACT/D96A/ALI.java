package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


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
        e3239 = new E3239();
        e9213 = new E9213();
        e4183_1 = new E4183();
        e4183_2 = new E4183();
        e4183_3 = new E4183();
        e4183_4 = new E4183();
        e4183_5 = new E4183();
        addElement(e3239);
        addElement(e9213);
        addElement(e4183_1);
        addElement(e4183_2);
        addElement(e4183_3);
        addElement(e4183_4);
        addElement(e4183_5);
    }

}
