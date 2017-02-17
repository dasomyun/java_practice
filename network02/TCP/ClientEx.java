package network02.TCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
		// ip , port 立加 霖厚
		InetSocketAddress isa = new InetSocketAddress("211.63.89.103", 77);
		
		// socket 积己
		socket = new Socket();
		
		// 楷搬 夸没 
		socket.connect(isa);
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
