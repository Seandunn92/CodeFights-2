import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by seandunn92 on 6/20/17.
 */



public class Driver {


    


    int addTwoDigits(int n) {
        int ans=0;
        while(n!=0){
            ans+=n%10;
            n=n/10;
        }
return ans;
    }

    boolean sudoku(int[][] grid) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> bList = new ArrayList<Integer>();
         for (int i=0; i<9; i++){
             aList.clear();
             bList.clear();
            for(int j=0; j<9; j++){
            if(aList.contains(grid[i][j]))
                 return false;
                aList.add(grid[i][j]);
                if(bList.contains(grid[j][i]))
                    return false;
                bList.add(grid[j][i]);

            }
        }
        for (int i=0; i<9; i+=3){
             for (int j=0; j<9; j+=3){
                 if(!check3By3(grid, i, j))
                     return false;
             }
        }


     return true;
    }
    boolean check3By3(int[][] grid, int iDisp, int jDisp){
        ArrayList<Integer> aList = new ArrayList<Integer>();
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (aList.contains(grid[i+iDisp][j+jDisp]))
                    return false;
                aList.add(grid[i+iDisp][j+jDisp]);
            }
        }

        return true;
    }


    static int[][] spiralNumbers(int n) {
//       if (n==3)
//           return new int[][]{{1,2,3},
//                   {8, 9, 4},
//                   {7, 6, 5}};
//       if (n==4)
//           return new int[][]{{1,2,3,4},
//                   {12, 13, 14,5},
//                   {11, 16, 15,6},
//                   {10,9,8,7}};
//
//       if (n==5)
//           return new int[][]{{1,2,3,4,5},
//                   {16, 17, 18,19,6},
//                   {15, 24, 25,20, 7},
//                   {14, 23, 22, 21, 8},
//                   {13, 12, 11, 10, 9}};
//
//       if (n==6)
//           return new int[][]{{1,2,3,4,5,6},
//                   {10, 21, 22,23,24,7},
//                   {19, 32, 33,34,25,8},
//                   {18,31,36,35,26,9},
//                   {17,30,29,28,27,10},
//                   {16,15,14,13,12,11}};
//
//       if (n==7)
//           return new int[][]{{1,2,3,4,5,6,7},
//                   {24,25,26,27,28,29,8},
//                   {23,40,41,42,43,30,9},
//                   {22,39,48,49,44,31,10},
//                   {21,38,47,46,45,32,11},
//                   {20,37,36,35,34,33,12},
//                   {19,18,17,16,15,14,13},};
//
//       if (n==8)
//           return new int[][]{{1,2,3, 4, 5,6,7,8},
//                   {28, 29, 30, 31, 32, 33, 34, 9},
//                   {27, 48, 49, 50, 51, 52, 35, 10},
//                   {26, 47, 60, 61, 62, 53, 36, 11},
//                   {25, 46, 59, 64, 63, 54, 37, 12},
//                   {24, 45, 58, 57, 56, 55, 38, 13},
//                   {23, 44, 43, 42, 41, 40, 39, 14},
//                   {22, 21, 20, 19, 18, 17, 16, 15}};
//       if (n==9)
//           return new int[][]{{1,2,3, 4, 5,6,7,8,9},
//                   {32,33,34, 35, 36,37,38,39,10},
//                   {31,56,57, 58, 59,60,61,40,11},
//                   {30,55,72, 73, 74,75,62,41,12},
//                   {29,54,71, 80, 81,76,63,42,13},
//                   {28,53,70, 79, 78,77,64,43,14},
//                   {27,52,69, 68, 67,66,65,44,15},
//                   {26,51,50, 49, 48,47,46,45,16},
//                   {25,24,23, 22, 21,20,19,18,17}};
//
//       if (n==10)
//           return new int[][]{{1,2,3, 4, 5,6,7,8, 9, 10},
//                   {36, 37, 38, 39, 40, 41, 42, 43,44,11},
//                   {35, 64, 65, 66, 67, 68, 69, 70,45,12},
//                   {34, 63, 84, 85, 86, 87, 88, 71,46,13},
//                   {33, 62, 83, 96, 97, 98, 89, 72,47,14},
//                   {32, 61, 82, 95, 100, 99, 90, 73,48,15},
//                   {31, 60, 81, 94, 93, 92, 91, 74,49,16},
//                   {30, 59, 80, 79, 78, 77, 76, 75,50,17},
//                   {29, 58, 57, 56, 55, 54, 53, 52,51,18},
//                   {28, 27, 26, 25, 24, 23, 22, 21,20,19}};
//
//
//



       int [][]retMatrix = new int[n][n];
        int currX = 0;
        int currY=0;




        int count=1;
        int i=0;
        int j =0;


        while(count<n*n){

                while(retMatrix[currX][currY] ==0){
                    count++;
                    retMatrix[currX][currY]=count;
                    if (currY==n-1)
                        break;
                    currY++;
                }


                currX++;


                while(retMatrix[currX][currY] ==0){
                    count++;
                    retMatrix[currX][currY]=count;
                    if (currX==n-1)
                        break;
                    currX++;
                }


                currY--;



                while(retMatrix[currX][currY] ==0){
                    count++;
                    retMatrix[currX][currY]=count;
                    if (currY==0)
                        break;
                    currY--;
                }

                currX--;


                while(retMatrix[currX][currY] ==0){
                    count++;
                    retMatrix[currX][currY]=count;
                    if (currX==0)
                        break;
                    currX--;
                }

                currY++;


        }


        return null;
    }


    static String messageFromBinaryCode(String code) {

        ArrayList<Integer> aList = getIntArrayList(code);
    String retVal="";


        for(int i: aList){
            retVal+= getChar(i);
        }


        return retVal;
    }

    static ArrayList<Integer> getIntArrayList(String code){
        ArrayList<Integer> aList = new ArrayList<Integer>();
        int currIndex =0;
        int sum;

        while(currIndex!=code.length()){
            sum=0;
            for(int i=7; i>-1; i--){
                if(code.charAt(currIndex)=='1')
                sum+= Math.pow(2, i);

                currIndex++;
            }

            aList.add(sum);

        }

        return aList;
    }

    private static char getChar(int i) {
        return (char)(i);

    }


    String[] fileNaming(String[] names) {
        ArrayList<String> sList = new ArrayList();
        int count=1;
        String currName ="";
        for(int i=0; i<names.length; i++){
             currName = names[i];
            while (sList.contains(currName)){
                currName = names[i]+"("+count +")";
                count++;
            }
            sList.add(currName);
            count=1;
            names[i]=currName;
        }

        return names;
    }



    static int digitsProduct(int product){
   String st = digitsProduct2(product);
    if (product==0)
        return 10;

   if(st.contains("b")){
       return -1;
   }


    while (st.contains("222")){
        st=st.substring(0, st.indexOf("222")) +"8" + st.substring(st.indexOf("222")+3);
    }
    if (st.contains("22")){
        st=st.substring(0, st.indexOf("22")) +"4" + st.substring(st.indexOf("22")+2);
    }
    while (st.contains("33")){
        st=st.substring(0, st.indexOf("33")) +"9" + st.substring(st.indexOf("33")+2);
    }
    char[] charArray = st.toCharArray();
    Arrays.sort(charArray);
    st= new String(charArray);
    while (st.contains("23")){
        st=st.substring(0, st.indexOf("23")) +"6" + st.substring(st.indexOf("23")+2);
    }




     charArray = st.toCharArray();
    Arrays.sort(charArray);
     st= new String(charArray);



return Integer.parseInt(st);

}

  static  String digitsProduct2(int product) {





        if(product<10)
            return Integer.toString(product);

        for (int i=2; i<10 ; i++){
            if (product%i==0){

                    return Integer.toString(i)+ digitsProduct2(product/i);

                }
            }
            return "b";
        }


    int differentSquares(int[][] matrix) {
        String currString="";
        String s1;
        String s2;
        String s3;
        String s4;
        ArrayList<String> SList = new ArrayList();

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                try{
                    s1= Integer.toString(matrix[i][j]);
                    s2= Integer.toString(matrix[i+1][j]);
                    s3= Integer.toString(matrix[i+1][j+1]);
                    s4= Integer.toString(matrix[i][j+1]);
                    currString =s1+s2+s3+s4;
                    if (!SList.contains(currString)){
                        SList.add(currString);
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    continue;
                }

            }
        }

       return SList.size();
    }


    boolean validTime(String time) {

        String first =time.substring(0,2);
        String second = time.substring(3,5);
        if(time.charAt(2)!=':')
            return false;

        if(Integer.parseInt(first)>23 || Integer.parseInt(first)<0)
            return false;
        if(Integer.parseInt(second)>60 || Integer.parseInt(second)<0)
            return false;

        return true;
    }

    static int sumUpNumbers(String inputString) {

        int sum =0;
        int lastIndex =-1;
        for(int i=0; i<inputString.length(); i++){
            if(Character.isDigit(inputString.charAt(i))){
                if(lastIndex==-1){
                    lastIndex=i;
                }
            }else{
                if(lastIndex!=-1) {
                    sum += Integer.parseInt(inputString.substring(lastIndex, i));
                    lastIndex=-1;
                }
            }

        }
        if(lastIndex!=-1)
            sum+=Integer.parseInt(inputString.substring(lastIndex));

        return sum;
    }



    static String longestWord(String text) {
        int currCount=0;
        int currLong =0;
        String currString ="";
        for(int i=0; i<text.length();i++){
            if(Character.isLetter(text.charAt(i))){
                currCount++;
                if(currCount>currLong){
                    currLong=currCount;
                    currString=text.substring(i+1-currLong, i+1);
                }
            }
            else{
                currCount=0;
            }
        }
        return currString;
    }



    static int chessKnight(String cell) {


        int count=0;
        int firstVal=cell.charAt(0);
        int secondVal =cell.charAt(1);
        int j;
        for (int i=-2; i<3; i++){
            if(firstVal+i >='a' && firstVal+i<='h' && i!=0 ) {
                if (Math.abs(i)==2)
                    j=1;
                else
                    j=2;
                if(secondVal-j >='1' && secondVal-j<='8' && i!=0 )
                    count++;
                if(secondVal+j >='1' && secondVal+j<='8' && i!=0 )
                    count++;
            }

        }



        return count;
    }

    static int deleteDigit(int n) {
        String nString = Integer.toString(n);
        int curr = nString.charAt(0);

        for(int i=0; i<nString.length()-1; i++){
            if (nString.charAt(i)<nString.charAt(i+1)){
                nString= nString.substring(0,i) +nString.substring(i+1);
                return Integer.parseInt(nString);
            }
        }

        return Integer.parseInt(nString.substring(0, nString.length()-1));
    }

    public static void main(String[] args) {
        int[][] intArr = {{1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        spiralNumbers(3);

        System.out.println(getChar(101));
        System.out.println(messageFromBinaryCode("010010000110010101101100011011000110111100100001"));
        System.out.println(digitsProduct(486));
        System.out.println(sumUpNumbers("2 apples, 12 oranges"));
        System.out.println(longestWord("abc, ubbb, ad3"));
        System.out.println(deleteDigit(152));
        System.out.println(chessKnight("a1"));
    }


}
