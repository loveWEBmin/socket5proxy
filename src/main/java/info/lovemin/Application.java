package info.lovemin;

import sockslib.server.SocksProxyServer;
import sockslib.server.SocksServerBuilder;

import java.io.IOException;

/**
 * 你好,你好,你好啊
 */
public class Application {

	public static void main(String[] args)  {
		int port = 8888; // 代理服务器监听的端口号

		SocksProxyServer proxyServer = SocksServerBuilder.buildAnonymousSocks5Server();
		try {
			proxyServer.start();// Creat a SOCKS5 server bind at port 1080
		} catch (IOException e) {
			throw new RuntimeException(e);
		}


		// 输出代理服务器信息
		System.out.println("SOCKS5 Proxy Server started on port " + port);
	}

}
