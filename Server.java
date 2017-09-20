import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket ss = new ServerSocket( 13349 );

			Socket client = ss.accept();
			
			DataInputStream is = new   DataInputStream(client.getInputStream());
			DataOutputStream os = new   DataOutputStream(client.getOutputStream());
			boolean is_true=true;
			while(is_true){
				String line = is.readLine();
				System.out.println("maryam"+line);
				
				
				System.out.println("write2");
				Scanner input =new Scanner(System.in);
				os.writeBytes(input.next()+"\n");
				if(input.next().equals("q")){
					is_true=false;
					break;
				}
				//os.writeBytes("hello\n");
				
			}
			ss.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
