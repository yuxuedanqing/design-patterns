package factory.method;
/**
 * 文件日志
 * @author Mkydy
 *
 */
public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("文件日志记录");
	}

}
