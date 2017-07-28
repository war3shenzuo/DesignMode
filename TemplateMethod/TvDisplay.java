package TemplateMethod;

import java.util.Random;

public class TvDisplay extends AbstractDisplay {

	@Override
	public void open() {
		System.out.println("打开电视机");		
	}

	@Override
	public void run() {
		System.out.println("选择播放CCTV"+new Random().nextInt(10)+"频道");		
	}

	@Override
	public void close() {
		System.out.println("关闭电视机");		
	}

}
