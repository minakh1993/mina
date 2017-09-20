import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Socket cc = new Socket("localhost", 13349);
			
			DataInputStream is = new DataInputStream(cc.getInputStream());
			DataOutputStream os = new DataOutputStream(cc.getOutputStream());
			boolean is_true=true;
			while(is_true){
				System.out.println("write");
				Scanner input =new Scanner(System.in);
				os.writeBytes(input.next()+"\n");
				//os.writeBytes("dally\n");

				String line = is.readLine();
				System.out.println("zahra" +line);
				if(input.next().equals("q") || line.equals("q") ){
					is_true=false;
					break;
				}
				
			}
			cc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
