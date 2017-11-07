
public class Magpie2 {

    //Get a default greeting and return a greeting  
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * takes in a user statement
     * returns a response based on given rules
     */
    public String getResponse(String statement) {
        String response = "";
        if(statement.indexOf("no") >= 0){
            response = "Why so negative?";
        }else if((statement.trim().length()) <= 0){
            response = "Say something please.";
        }else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        }else if(statement.indexOf("Dreyer") >= 0){
            response = "She must be a great teacher!";
        }else if(statement.indexOf("deHeer") >= 0){
            response = "He is a funny and helpful guy!";
        }else if(statement.indexOf("Lamont") >= 0){
            response = "He must be very knowledgeable!";
        }else if(statement.indexOf("Knox") >= 0){
            response = "He is very helpful!";
        }else if(statement.indexOf("Cancilla") >= 0){
            response = "He mus care for his students!";
        }else{
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * returns a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "Wait, what? Say it again?";
        } else {
            response = "LOL, that is funny!";
        }
        return response;
    }
}
