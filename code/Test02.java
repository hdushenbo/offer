/**
 * Author: 沈博 
 * Date: 2019-04-11 
 * Declaration:请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("We Are Happy.");
		System.out.println(replaceSpace(stringBuffer));
	}

	public static String replaceSpace(StringBuffer str) {
		StringBuffer strBuffer = new StringBuffer();
		for(int i = 0;i< str.length();i++){
			if(str.charAt(i) == ' '){
				strBuffer.append("%20");
			}else{
				strBuffer.append(str.charAt(i)); 
			}
		}
		return strBuffer.toString();
		
	}
}
