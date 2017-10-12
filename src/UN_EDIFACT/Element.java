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
    private String tag;
    private String description;
    private String longDescription;
    private String formatString;
    private String note;
    private int minLength;
    private int maxLength;
    private String content;
    private boolean mandatory;
    private boolean valid;
    private boolean empty;

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public final void setNote(String Note) {
        this.note = Note;
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
        this.empty = true;
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
        return formatString;
    }

    /**
     *
     * @param FormatString
     */
    @Override
    public final void setFormatString(String FormatString) {
        this.formatString = FormatString;
    }

    
    private int getMinLength() {
        return minLength;
    }

    private void setMinLength(int MinLength) {
        this.minLength = MinLength;
    }

    private int getMaxLength() {
        return maxLength;
    }

    private void setMaxLength(int MaxLength) {
        this.maxLength = MaxLength;
    }

    @Override
    public String toString() {
        if (content == null) {
            return "";
        } else {
            return content;
        }
    }
    
    /**
     *
     * @param Content
     */
    @Override
    public void setContent(String Content) {
        if (Content == null) {
            return;
        }
        if (Content.isEmpty()) {
            // do nothing
        } else {
            this.content = Content;
            this.empty = false;
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getTag() {
        return tag;
    }

    /**
     *
     * @param Tag
     */
    @Override
    public final void setTag(String Tag) {
        this.tag = Tag;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param Description
     */
    @Override
    public final void setDescription(String Description) {
        this.description = Description;
    }

    /**
     *
     * @throws ValidityException
     */
    @Override
    public void validate() throws ValidityException {
        try {
            EdiFunctions.validateElement(this.tag, this.mandatory, this.formatString, this.content);
        } catch(ValidityException ex) {
            throw new ValidityException(ex.getMessage());
        }
    }

    /**
     *
     * @param Mandatory
     */
    @Override
    public final void setMandatory(boolean Mandatory) {
        this.mandatory = Mandatory;
    }

    public final void setEmpty(boolean Empty) {
        this.empty = Empty;
    }
    /**
     *
     * @return
     */
    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }
    
    /**
     *
     * @return
     */
    public boolean isValid() {
        return this.valid;
    }

    /**
     * 
     * @return
     */
    public boolean isEmpty() {
        return this.empty;
    }
    /**
     *
     * @return
     */
    @Override
    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     *
     * @param LongDescription
     */
    @Override
    public final void setLongDescription(String LongDescription) {
        this.longDescription = LongDescription;
    }

    /**
     * 
     */
    public String describe() {
        String contentStr;
        
        if (this.content == null ) {
            contentStr = "";
        } else {
            contentStr = this.content;
        }
        String output = this.tag + "  \"" + contentStr + "\"  " + this.formatString + "  " + this.description;
        return output;
    }
}

