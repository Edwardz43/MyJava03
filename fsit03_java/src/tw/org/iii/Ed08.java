package tw.org.iii;

public class Ed08 {

    public static void main(String args[]) 
    { 
        final int N = 52; 
        int[] poker = new int[N]; 
        int i =1;
        //建立一個52格的陣列

        
        for(i = 0; i < N; i++) 
        {
            poker[i] = i + 1;// +1 =>位移 
        }
        //將陣列依序產生1~52的數字

        
        for(i = 0; i < N; i++) 
        { 
            int j = (int) (Math.random() * N );
            int tmp = poker[i]; 
            poker[i] = poker[j]; 
            poker[j] = tmp; 
        } 
        // 重點:隨機產生1~52的亂數 弄成陣列J  並利用tmp將之替換成陣列poker
        
        
        String [] symbols = {"黑桃", "紅心", "方塊", "梅花"};//做一個花色陣列
        
        for(i = 0; i < N; i++) 
        { 
            System.out.print(symbols[(poker[i] - 1) / 13]);//叫出poker 並決定花色

            int remain = poker[i] % 13; 
            
            switch(remain) 
            {  
                case  0: System.out.print(" K"); break; 
                case 12: System.out.print(" Q"); break; 
                case 11: System.out.print(" J"); break;     //決定點數
                default: System.out.printf("%2d", remain); 
            } 
            System.out.printf("%c", (i + 1) % 13 == 0 ? '\n' : '\t'); //補充  每發13張就換行 
        } 
    }
}