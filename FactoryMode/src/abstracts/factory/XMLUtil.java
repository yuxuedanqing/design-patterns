package abstracts.factory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * XML工具类
 * @author Mkydy
 *
 */
public class XMLUtil {

	public static String XML_CONFIG = "src/abstracts/factory/config.xml";

	public static Object getBean() {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document doc = builder.parse(new File(XML_CONFIG));
			//获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode=nl.item(0).getFirstChild();
			String cName=classNode.getNodeValue();
			//通过类名生成实例对象并将其返回
			Class<?> c = Class.forName(cName);
			return c.newInstance();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
