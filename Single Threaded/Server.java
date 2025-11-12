public class Server{
    public void run(){
        int port=8010;
        ServerSocket socket= new ServerSocket(port);
        socket.setToTimeout(10000);
        while(true){
            try{
                System.out.println('Server is running on'+port);
                Socket acceptedConnection=socket.accept();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args){

    }
}