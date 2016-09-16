package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;

public class BGM extends Segment {

    public C002 eC002;
    public E1004 e1004;
    public E1225 e1225;
    public E4343 e4343;

    public BGM() {
        this(false);
    }

    public BGM(Boolean Mandatory) {
        super("BGM", "BEGINNING OF MESSAGE", "Function: To indicate the type and function of a message and to");
        this.setMandatory(Mandatory);
        eC002 = new C002();
        e1004 = new E1004();
        e1225 = new E1225();
        e4343 = new E4343();
        addElement(eC002);
        addElement(e1004);
        addElement(e1225);
        addElement(e4343);
    }

}
