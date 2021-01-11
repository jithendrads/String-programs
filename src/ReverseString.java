
public class ReverseString {

	public static void main(String[] args) {

String str="Welcome to edureka";
String newstr;
String[] strArray=str.split(" ");
StringBuffer sb=new StringBuffer();
for(String s:strArray)
{
	sb.append(s);
	//System.out.println(sb);
	newstr=sb.reverse().toString();
	System.out.print(newstr);
	System.out.print(" ");
	sb.setLength(0);
}
System.out.println(" ");
	


	
//for(int i=0;i<strArray.length;i++)
//{
//	char[] c1=strArray[i].toCharArray();
//	for(int j=c1.length-1;j>=0;j--)
//		System.out.print(c1[j]);
//	System.out.print(" ");
//}

}
}
