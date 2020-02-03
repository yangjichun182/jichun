package com.jichun.utils;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 * 
 * @author xbm
 * @date 2019年3月20日 下午12:39:43
 *
 */
public class MyUtils {

	public MyUtils() {
	}

	/**
	 * 获取一个目录下的所有文件和文件夹，将文件夹用directory：开头展示，文件用File:开头展示
	 * 
	 * @author : xbm
	 * @throws URISyntaxException
	 * @date : 2019年4月13日 下午3:36:41
	 */
	public static void get_File_Tree() throws URISyntaxException {
		Path path = FileSystems.getDefault().getPath("D:\\", "2018");
		System.out.println(path.getFileName());
	}

	/**
	 * 返回一个字符串中的某个字符或者字符串的位置 <blockquote>
	 * 
	 * <pre>
	 * ApiTest test = new ApiTest();
	 * int index = test.get_str_index("abcdefg", "cd"); // 返回2 ，同样的道理下标从0
	 * 													// 开始，底层就是数组
	 * System.out.println(index);
	 * </pre>
	 * 
	 * </blockquote>
	 * 
	 * @author : xbm
	 * @date : 2019年3月4日 下午4:51:23
	 */
	public int get_str_index(String str, String str1) {
		return new String(str).indexOf(str1);
	}

	/**
	 * 
	 * @author : xbm
	 * @date : 2019年2月27日 下午6:59:53
	 * @function: 根据身份证号码获取年龄
	 * @comments:
	 * @param idCard
	 *            身份证号码
	 */
	public int get_idcard_age(String idCard) {
		String str = new String(idCard);
		String trimed = str.trim(); // 去掉空格
		// 01、获取身份证号长度
		int length = trimed.length();
		// 02、根据身份证号长度分别判断(15位或者18位)
		if (length == 15) {
			// 15位处理方法
		} else if (length == 18) {
			// 18位处理方法
		} else {
			// 其它位数处理方法
		}
		return 0;
	}

	/**
	 * 
	 * @author : xbm
	 * @throws InterruptedException
	 * @date : 2019年2月21日 下午5:25:55
	 * @function: 获取前后两个时间的差值
	 * @comments:扫盲 01、1 hour = 60 minutes 分 02、1 minutes = 60 second 秒 03、1
	 *              second = 1000 milliseconds 毫秒 04、1 millisecond = 1000
	 *              microsecond 微秒 05、1 microsecond = 1000 nanosecond 纳秒 06、1
	 *              nanosecond = 1000 picosecond 皮秒 也称作微微秒
	 */
	public void get_nanoTime() throws InterruptedException {
		long nanoTime = System.nanoTime();
		Thread.sleep(10);
		long nanoTime1 = System.nanoTime();
		long minus1 = nanoTime1 - nanoTime;
		System.out.println("纳秒级差值：" + minus1); // 获取差值
		System.out.println("==============方式2================");
		long currentTimeMillis = System.currentTimeMillis();
		Thread.sleep(10);
		long currentTimeMillis1 = System.currentTimeMillis();
		long munus2 = currentTimeMillis1 - currentTimeMillis;
		System.out.println("当前的时间差值：" + munus2); // 获取差值
	}

	/**
	 * 判断输入的年份是否是闰年[闰年：]
	 * 
	 * @param year
	 *            输入的是一个年份
	 * @author : xbm
	 * @date : 2019年3月9日 上午10:28:40
	 */
	public boolean leap(int year) {
		if (((year % 100 != 0) && (year % 4 == 0)) || ((year % 100 == 0) && (year % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 获取当前系统日期,获取的格式如：2019-11-18 10:54:54
	 * 
	 * @author : xbm
	 * @date : 2019年11月18日 上午10:44:20
	 */
	public static String getDate() {
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		return format.format(date).toString();
	}

	/**
	 * 按照希望的格式显示日期
	 * 
	 * @author : xbm
	 * @date : 2019年11月18日 上午10:57:02
	 */
	public static String getDate(String parten) {
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		switch (parten) {
		case "yyyy-MM-dd HH:mm:ss":
			SimpleDateFormat format = new SimpleDateFormat(parten);
			return format.format(date).toString();
		case "yyyy年MM月dd日 HH:mm:ss":
			SimpleDateFormat format1 = new SimpleDateFormat(parten);
			return format1.format(date).toString();
		case "yyyy/MM/dd  HH:mm:ss":
			SimpleDateFormat format2 = new SimpleDateFormat(parten);
			return format2.format(date).toString();
		default:
			SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd");
			return format0.format(date).toString();
		}
	}

	/**
	 * 输出通用方法
	 * 
	 * @author : xbm
	 * @date : 2019年11月18日 上午10:40:10
	 */
	public static void sout(Object o) {
		System.out.println(o);
	}

	/**
	 *
	 * @param arr
	 */
	public void reverseArray(char[] arr) {
		int x = 0;
		int y = arr.length - 1;
		for (; x < y; x++, y--) {
			char temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
	}

	/**
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		char[] charArray = str.toCharArray();
		reverseArray(charArray);

		return new String(charArray);
	}

	/**
	 * 创建文件公用方法，成功返回true,失败返回 false 创建文件要是直接是文件名，就会在当前工程下创建该文件，要是用的
	 * 
	 * @author : xbm
	 * @date : 2019年11月22日 下午2:16:16
	 */
	public static boolean makeFile(String fileName) {
		File file = new File(fileName);
		try {
			if (!file.exists()) {
				file.createNewFile(); // create a new file
			} else {
				System.out.println("The file exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file.exists();
	}

	/**
	 * 创建带有父目录的文件 MyUtils.makeParentFile("./../testfile.txt");
	 * MyUtils.makeParentFile("D:\\test\\testfile.txt");
	 * 
	 * @author : xbm
	 * @date : 2019年11月22日 下午2:36:33
	 */
	public static boolean makeParentFile(String fileName) {
		File file = new File(fileName);
		if (file.getParentFile().exists()) {
			// file or directory exists delete
			System.out.println("file or directory exists!");
			file.delete();
			System.out.println("file or directory delete!");
			file.getParentFile().mkdirs();
			System.out.println("file or directory exists!delete and recreate");
		} else {
			file.getParentFile().mkdirs();
			System.out.println("create file or directory!!");
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file.exists(); // whether the file exists
	}

	public static String getLocalName() {

		try {
			InetAddress inet = InetAddress.getLocalHost();
			return inet.getHostName();
		} catch (UnknownHostException e) {

		}
		return "";
	}
}
