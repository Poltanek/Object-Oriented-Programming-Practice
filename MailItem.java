public class MailItem {
    private String to;
    private String subject;
    private String from;
    private String message;
    private boolean urgent;

    public MailItem(String to, String subject, String from, String message, boolean urgent) {
        this.to = to;
        this.subject = subject;
        this.from = from;
        this.message = message;
        this.urgent = urgent;
    }

    public String getTo(){
        return to;
    }

    public String getSubject(){
        return subject;
    }

    public String getFrom(){
        return from;
    }

    public String getMessage(){
        return message;
    }

    public boolean getUrgent(){
        return urgent;
    }

    public void printMail() {
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("From: " + from);
        System.out.println("Message: " + message);
        System.out.println("Urgent: " + (urgent ? "yes" : "no"));
    }
}
