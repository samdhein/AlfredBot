import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guestName = name;
        return String.format("Hello, %s. Lovely to see you.", guestName);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s.", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Do it yourself.";
        } else if (conversation.indexOf("Alfred") > -1) {
                return "Right away.";
        } else {
            return "Mmkay I'm going to sleep.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

