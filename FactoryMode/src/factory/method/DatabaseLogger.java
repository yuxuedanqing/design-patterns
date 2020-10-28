package factory.method;
/**
 * 数据库日志
 * @author Mkydy
 *
 */
public class DatabaseLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("数据库日志记录");
	}

}
