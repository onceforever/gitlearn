package hyq1913;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		//简单认识正则表达式的概念
		/*p("abc".matches("..."));
		p("a8739a".replaceAll("\\d", "-"));    //\d代表一位数字
		
		Pattern pattern = Pattern.compile("[a-z]{3}");
		Matcher matcher = pattern.matcher("fgh");
		
		p(matcher.matches());
		
		p("fgh".matches("[a-z]{3}"));*/
		
		//初步认识 . * +
		/*p("a".matches("."));
		p("aa".matches("aa"));
		p("aaaa".matches("a*"));  //*代表零个或多个
		p("aaaa".matches("a+"));
		p("".matches("a*"));
		p("aaaa".matches("a?"));
		p("".matches("a?"));
		p("a".matches("a?"));
		p("2145231452322".matches("\\d{3,100}"));
		p("192".matches("[0-2][0-9][0-9]"));*/
		
		//范围
		/*p("a".matches("[abc]"));   // []表示匹配其中的一个字符
		p("a".matches("[^abc]"));  //^表示取反
		
		p("A".matches("[a-zA-Z]"));
		p("A".matches("[a-z]|[A-Z]"));
		p("A".matches("[a-z[A-Z]]"));
		
		p("R".matches("[A-Z&&[RFG]]"));*/
		
		//认识\s  \w   \d     \
	/*	p(" \n\r\t".matches("\\s{4}"));
		p("".matches("\\s"));
		p("a_8".matches("\\w{3}"));
		p("abc999&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
		p("\\".matches("\\\\"));*/
		
		//POSIC Style
		//p("a".matches("\\p{Lower}"));
		
		//boundary
		/*p("hello sir".matches("^h.*"));
		p("hello sir".matches(".*ir$"));
		p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));
		p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));*/
		
		//white lines空白行
		//p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
		
		//matches e-mail
		//p("386507179@qq.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		
		//matcher find lookingAt
		/*Pattern p = Pattern.compile("\\d{3,5}");
		String s = "123-34345-234-00";
		Matcher m = p.matcher(s);
		p(m.matches());
		m.reset();
		
		p(m.find());  //find()找一个与之匹配的子串，找到之后会把第一个匹配的字串去掉
		p(m.start() + "-" + m.end());
		p(m.find());
		p(m.start() + "-" + m.end());
		p(m.find());
		p(m.start() + "-" + m.end());
		p(m.find());
		
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());*/
		
		/*Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("java Java JAVA JaVa I love jAva you hate JAva   shsfhklajfhuqwhkfahshjk");
		//p(m.replaceAll("JAVA"));
		StringBuffer buf = new StringBuffer();
		while (m.find()) {
			p(m.group());
		}
		int i = 0;
		while (m.find()) {
			i++;
			if (i % 2 == 0) {
				m.appendReplacement(buf, "java");
			} else {
				m.appendReplacement(buf, "JAVA");
			}
		}
		m.appendTail(buf);
		p(buf);*/
		
		//group
		/*Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
		String s = "123aaa-34345bb-234cc-00";
		Matcher m = p.matcher(s);
		while (m.find()) {
			p(m.group(1));
			p(m.group(2));
			p(m.group());
		}*/
		
		//quantifier
		
		/*Pattern p = Pattern.compile("(.{3,10}+)([0-9])");
		String s = "aaaa5bbbb6";
		Matcher m = p.matcher(s);
		if (m.find()) {
			p(m.start() + "--" + m.end());
		} else {
			p("not match!");
		}*/
		
		//non-capturing group
		/*Pattern p = Pattern.compile(".{3}");
		String s = "44a66b";
		Matcher m = p.matcher(s);
		while (m.find()) {
			p(m.group());
		}*/
		
		Pattern pattern = Pattern.compile("\\[\\d{2}:\\d{2}\\.\\d{2}\\].*");
		Matcher matcher = pattern.matcher("[01:30.50]");
		p(matcher.matches());
		
		
	}
	
	static void p(Object obj) {
		System.out.println(obj);
	}
}
