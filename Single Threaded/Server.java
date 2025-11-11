public class Server{
    public void run(){
        int port=8010;
        ServerSocket socket= new ServerSocket(port);
        socket.setToTimeout(10000);
        while(true){
            System.out.println('Server is running on'+port);
            Socket acceptedConnection=socket.accept();
        }
    }
    public static void main(String[] args){

    }
}