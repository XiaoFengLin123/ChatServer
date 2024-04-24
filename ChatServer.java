import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {

    public String handleRequest(URI url) {
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("&");
                if (parameters[0].substring(0,2).equals("s=" && parameters[1].substring(0,5).equals("user=") {
                    Message = parameters[0].substring(2);
                    User = parameters[1].substring(5);
                    return User + ": " + Message + "\n";
                }
            }
            return "404 Not Found!";
        }
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
