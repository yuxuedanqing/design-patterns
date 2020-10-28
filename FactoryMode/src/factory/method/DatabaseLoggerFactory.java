package factory.method;

public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// 连接数据库，代码省略
		// 创建数据库日志记录器对象
		// 初始化数据库日志记录器，代码省略
		return new DatabaseLogger();
	}

}
