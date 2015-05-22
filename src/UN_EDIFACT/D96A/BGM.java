/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;
import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * UN-EDIFACT
 * Segment BGM, BEGINNING OF MESSAGE
 * 
 * @author mannelini
 */
public class BGM extends Segment {
    
    public C002 eC002;
    public E1004 e1004;
    public E1225 e1225;
    public E4343 e4343;

    /**
     *
     */
    public BGM() {
        this(false);
    }
    
    /**
     *
     * @param Mandatory
     */
    public BGM(Boolean Mandatory) {
        super("BGM", "BEGINNING OF MESSAGE", "To indicate the type and function of a message and to transmit the identifying number.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC002, e1004, e1225, e4343}));
    }

}
