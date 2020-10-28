package factory.method;
/**
 * 日志工厂
 * @author Mkydy
 *
 */
public interface LoggerFactory {

	/**
	 * 创建日志
	 * @return Logger
	 */
	Logger createLogger();
}
