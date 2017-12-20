package Task62;

public class Email {
    private String fTo;
    private String fCc;
    private String fBody;
    private String fSubject;
    private int fPriority;
    private boolean fAttachment;


    public void setfTo(String valTo){
        this.fTo = valTo;
    }

    public String getfTo(){
        return fTo;
    }

    public String getfCc() {
        return fCc;
    }

    public void setfCc(String valCc) {
        this.fCc = valCc;
    }


    public String getfBody() {
        return fBody;
    }

    public void setfBody(String valBody) {
        this.fBody = valBody;
    }

    public String getfSubject() {
        return fSubject;
    }

    public void setfSubject(String valSubject) {
        this.fSubject = valSubject;
    }

    public int getfPriority() {
        return fPriority;
    }

    public void setfPriority(int valPriority) {
        this.fPriority = valPriority;
    }
}
