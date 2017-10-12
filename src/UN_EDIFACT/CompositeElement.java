/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT;

import java.util.ArrayList;

/**
 *
 * @author mannelini
 */
public class CompositeElement {
    private String tag;
    private String description;
    private String longDescription;
    private Boolean mandatory;
    private Boolean empty;
    private ArrayList<Element> elementList;

    public CompositeElement(String Tag, String Description, String LongDescription) {
        this.tag = Tag;
        this.description = Description;
        this.longDescription = LongDescription;
        this.elementList = new ArrayList<>();
    }

    public final void addElement(Element E) {
        elementList.add(E);
    }
    
    @Override
    public String toString() {
        String output;
        output = "";
        //ArrayList<Element> eList = getElementList();
        
        for (Element e : elementList ) {
            if (elementList.indexOf(e) == 0) {
                output = e.toString() + ":";
            } else {
                output = output + e.toString() + ":";
            }
        }
        //output = e1001.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e1000.toString();
        return EdiFunctions.trim(output);
    }

    public void validate() throws ValidityException {
        try {
            for (Element e : elementList ) {
                e.validate();
            }
        } catch(ValidityException ex) {
            throw new ValidityException(this.getTag() + "." + ex.getMessage());
        }
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String Tag) {
        this.tag = Tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String LongDescription) {
        this.longDescription = LongDescription;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public final void setMandatory(Boolean Mandatory) {
        this.mandatory = Mandatory;
    }

   public ArrayList getElementList() {
        return elementList;
    }

    public void setElementList(ArrayList<Element> elementList) {
        this.elementList = elementList;
    }

}
