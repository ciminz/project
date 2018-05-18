package com.nngdjt.test.service.processImpl;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vane.process.BaseProcess;



public class ProcessImplTCP1 extends BaseProcess{
	private static Logger logger = LoggerFactory.getLogger(ProcessImplTCP1.class);

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void execute(Object object) {
		Socket socket = (Socket)object;
		InputStream is = null;
		OutputStream os = null;
		try {
			is = socket.getInputStream();
			int count = 0;
			while(true) {
				count = is.available();
				if(count>0) {
					break;
				}
			}
			
			byte[] resultBytes = new byte[count];
			is.read(resultBytes);
			System.out.println("recv(GBK):" + new String(resultBytes));
			System.out.println("recv(UTF8):" + new String(resultBytes));
			
			os = socket.getOutputStream();
			os.write(new String("okok").getBytes());
			os.flush();
		} catch (Exception e) {
			try {
				e.printStackTrace();
				os = socket.getOutputStream();
				os.write(new String("not ok").getBytes());
				os.flush();
			}catch(Exception e1) {
				logger.error("异常处理失败");
			}
			
		}finally {
			try {
				os.close();
				is.close();
				socket.close();
			} catch (Exception e2) {
				logger.error("关闭流处理失败");
			}
			
		}
		
	}

}
