package tw.org.iii;

import java.util.Random;

public class NumToCheck {  
    // 大写数字字符串  
    private static String[] RMB = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};  
    // 单位数组  
    private static String[] unit = {"角","分","圆","拾","佰","仟","万","拾","佰","仟","亿"};  
      
      
    // 转换成大写RMB  
    public static String toRMB(String num)  
    {     
        // 结果  
        String result = "";  
  
        // 将待转换的数字分解成整数及小数2部分  
        String integer = divide(num, true);  
        String decimal = divide(num, false);  
      
        // 将整数部分及小数部分分别转换成相应大写，并添加单位  
        result += convert(integer, true);  
        result += convert(decimal, false);  
  
        // 正则表达式替换，清除多余的零  
        result = zeroClear(result);  
  
        return result;  
    }  
  
  
      
    // 替换结果中的"零分"、"零角"、"零圆"、"零拾"、"零佰"、"零仟"、"零万"  
    private static String zeroClear(String str)  
    {  
        String[] regex = {"零分","零角","零拾","零佰","零仟"};  
          
        //结果  
        String result = str;  
  
        // 正则表达式替换  
        for (int i = 0;i < regex.length ;i++ )  
        {  
            result = result.replace(regex[i], "零");  
        }  
          
        // 清除多余的零  
        result = result.replace("零零零零","");  
        result = result.replace("零零零","零");  
        result = result.replace("零零","零");  
        result = result.replace("零万","万");  
        result = result.replace("零圆","圆");  
  
  
        return result;  
    }  
      
    // 将待转换的数字分解成整数及小数2部分  
    private static String divide(String num, boolean isIntegerPart)  
    {  
        String result = "";  
          
        // 若isIntegerPart为true，表明截取的是整数部分  
        if (isIntegerPart)  
        {  
            // 用以"."为分割符，应写成"\\."才符合正则表达式  
            result = num.split("\\.")[0];  
            // 去除开头多余的"0"  
            while(result.charAt(0) == '0')  
            {  
                result = result.substring(1);  
            }  
  
            return result;  
        }  
        else  
        {  
            String tmp = num.split("\\.")[1];  
            // 截取小数点后2位  
            result = tmp.substring(0, 2);  
            return result;  
        }  
    }  
  
    // 将整数部分及小数部分分别转换成相应大写，并添加单位  
    private static String convert(String str, boolean isIntegerPart)  
    {  
        String result = "";  
  
        int strLength = str.length();  
        // 转换整数部分  
        if (isIntegerPart)  
        {  
            for (int i = 0;i < strLength ;i++ )  
            {  
                // 将字符转换成相应的数字大写  
                result += RMB[str.charAt(i) - 48];  
                // 添加单位  
                result += unit[strLength - i + 1];  
            }  
              
            return result;  
          
        }  
        else  
        {  
            for (int i = 0;i < strLength ;i++ )  
            {  
                // 将字符转换成相应的数字大写  
                result += RMB[str.charAt(i) - 48];  
                // 添加单位  
                result += unit[i];  
            }  
              
            return result;  
        }  
              
    }  
  
  
    // main  
    public static void main(String[] args)  
    {  
        // 待转换的数字长度  
        Random random = new Random();  
        int length = random.nextInt(10) + 1;  
          
        String str = "";  
        // 随机生成整数部分  
        for (int i = 0;i < length ;i++ )  
        {  
            str += String.valueOf((int)(Math.random() * 10));     
        }  
        // 随机生成小数部分  
        str += ".";  
        for (int i = 0;i < 2 ;i++ )  
        {  
            str += String.valueOf((int)(Math.random() * 10));     
        }  
      
        System.out.println(str);  
        System.out.println(NumToCheck.toRMB(str));  
    }  
  
}  



//
//String[] decimal = {"","拾","佰","仟","萬","拾","佰","仟","億"};
//String[] chNumber = {"零","壹","貳","参","肆","伍","陸","柒","捌","玖"};
//String[] input = {"4","0","0","0","0","6","6","0"};
//
//for(int i=0;i<input.length;i++){
//	int n = (int) (Integer.parseInt(input[i]));
//	int d = input.length-i-1;
//	if(chNumber[n]=="零"&& d ==4){
//		System.out.print(decimal[d]);
//	}else if(chNumber[n]=="零"){
//		System.out.print("零");
//	}
//	else {
//		System.out.print(chNumber[n]+decimal[d]);
//	}
//	
//	
//	
////	System.out.print(chNumber[n]==""?"":chNumber[n]+decimal[d]);
//}
//System.out.println("元整");