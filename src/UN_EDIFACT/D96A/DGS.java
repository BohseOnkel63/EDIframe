package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DGS extends Segment {

    public E8273 e8273;
    public C205 eC205;
    public C234 eC234;
    public C223 eC223;
    public E8339 e8339;
    public E8364 e8364;
    public E8410 e8410;
    public E8126 e8126;
    public C235 eC235;
    public C236 eC236;
    public E8255 e8255;
    public E8325 e8325;
    public E8211 e8211;

    public DGS() {
        this(false);
    }

    public DGS(Boolean Mandatory) {
        super("DGS", "DANGEROUS GOODS", "Function: To identify dangerous goods.");
        this.setMandatory(Mandatory);
        e8273 = new E8273();
        eC205 = new C205();
        eC234 = new C234();
        eC223 = new C223();
        e8339 = new E8339();
        e8364 = new E8364();
        e8410 = new E8410();
        e8126 = new E8126();
        eC235 = new C235();
        eC236 = new C236();
        e8255 = new E8255();
        e8325 = new E8325();
        e8211 = new E8211();
        addElement(e8273);
        addElement(eC205);
        addElement(eC234);
        addElement(eC223);
        addElement(e8339);
        addElement(e8364);
        addElement(e8410);
        addElement(e8126);
        addElement(eC235);
        addElement(eC236);
        addElement(e8255);
        addElement(e8325);
        addElement(e8211);
    }

}
