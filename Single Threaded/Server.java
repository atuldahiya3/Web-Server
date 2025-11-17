
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public void run() throws IOException{
        int port=8010;
        ServerSocket socket= new ServerSocket(port);
        socket.setToTimeout(10000);
        while(true){
            try{
                System.out.println("Server is running on"+port);
                Socket acceptedConnection=socket.accept();
                System.out.println("Socket connection accepted"+acceptedConnection.getRemoteSocketAddress());
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args){

    }
}