/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT;
/**
 *
 * @author mannelini
 */
public class Element implements ElementInterface {
    private String Tag;
    private String Description;
    private String LongDescription;
    private String FormatString;
    private String Note;
    private int MinLength;
    private int MaxLength;
    private String Content;
    private boolean Mandatory;
    private boolean Valid;

    @Override
    public String getNote() {
        return Note;
    }

    @Override
    public final void setNote(String Note) {
        this.Note = Note;
    }

    /**
     *
     * @param Tag Tag or name of element, like "1153"
     * @param Description Short desctiption of an element like "Reference qualifier"
     * @param FormatString Length and allowed content of an element like "an..3", "n1" etc
     * @param LongDescription Long description of an element like "Code giving specific meaning to a reference segment or a reference number."
     * @param Note Possible notes of an element
     */
    public Element(String Tag, String Description, String FormatString, String LongDescription, String Note) {
        this.setTag(Tag);
        this.setDescription(Description);
        this.setFormatString(FormatString);
        this.setLongDescription(LongDescription);
        this.setNote(Note);
    }
    
    public Element(String Tag, String Description, String FormatString, String LongDescription) {
        this(Tag, Description, FormatString, LongDescription, null);
    }
    /**
     *
     * @return 
     */
    @Override
    public String getFormatString() {
        return FormatString;
    }

    /**
     *
     * @param FormatString
     */
    @Override
    public final void setFormatString(String FormatString) {
        this.FormatString = FormatString;
    }

    
    private int getMinLength() {
        return MinLength;
    }

    private void setMinLength(int MinLength) {
        this.MinLength = MinLength;
    }

    private int getMaxLength() {
        return MaxLength;
    }

    private void setMaxLength(int MaxLength) {
        this.MaxLength = MaxLength;
    }

    @Override
    public String toString() {
        if (Content == null) {
            return "";
        } else {
            return Content;
        }
    }
    
    /**
     *
     * @param Content
     */
    @Override
    public void setContent(String Content) {
        this.Content = Content;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getTag() {
        return Tag;
    }

    /**
     *
     * @param Tag
     */
    @Override
    public final void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescription() {
        return Description;
    }

    /**
     *
     * @param Description
     */
    @Override
    public final void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     *
     * @throws ValidityException
     */
    @Override
    public void validate() throws ValidityException {
        try {
            EdiFunctions.validateElement(this.Tag, this.Mandatory, this.FormatString, this.Content);
        } catch(ValidityException ex) {
            throw new ValidityException(ex.getMessage());
        }
    }

    /**
     *
     * @param Mandatory
     */
    @Override
    public void setMandatory(boolean Mandatory) {
        this.Mandatory = Mandatory;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isMandatory() {
        return this.Mandatory;
    }
    
    /**
     *
     * @return
     */
    public boolean isValid() {
        return this.Valid;
    }

    /**
     *
     * @return
     */
    @Override
    public String getLongDescription() {
        return this.LongDescription;
    }

    /**
     *
     * @param LongDescription
     */
    @Override
    public final void setLongDescription(String LongDescription) {
        this.LongDescription = LongDescription;
    }

    /**
     * 
     */
    public String describe() {
        String contentStr;
        
        if (this.Content == null ) {
            contentStr = "";
        } else {
            contentStr = this.Content;
        }
        String output = this.Tag + "  \"" + contentStr + "\"  " + this.FormatString + "  " + this.Description;
        return output;
    }
}

