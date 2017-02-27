package by.epam.tr.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlRegexParser {
	private List<String> xmlNodes = new ArrayList<>();
	
	public List<String> parse(String text) {
		Pattern p = Pattern.compile("(<[!?]{1}[^!?>]*[!?]{1}>)*(<[/]{0,1}([^<>]*)>([^<>]*))");
		Matcher m = p.matcher(text);
		
		while (m.find()) {
			xmlNodes.add(m.group(3));
			String group4 = m.group(4);
			if (!group4.equals("")) {
				xmlNodes.add(group4);			
			}
		}
		return xmlNodes;
	}
}
