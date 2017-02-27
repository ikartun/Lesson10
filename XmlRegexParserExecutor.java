package by.epam.tr.lesson10;

import java.util.List;

public class XmlRegexParserExecutor {

	public static void main(String[] args) {
		String xmlText = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><breakfast-menu><food id=\"1\"><name>Belgian Waffles</name><price>$5.95</price><description>two of our famous Belgian Waffles with plenty of real maple syrup</description><calories>650</calories></food><food id=\"2\"><name>Strawberry Belgian Waffles</name><price>$7.95</price><description>light Belgian waffles covered with strawberries and whipped cream</description><calories>900</calories></food></breakfast-menu>";
		XmlRegexParser xmlRegexParser = new XmlRegexParser();
		
		List<String> xmlNodes = xmlRegexParser.parse(xmlText);
		
		for (String node : xmlNodes) {
			System.out.println(node);
		}
	}
}
