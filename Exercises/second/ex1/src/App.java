public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("配列変数の宣言 \nString[] arr\n" +
        "配列変数名 = new データ型[要素数]");
        String[] arr;
        arr = new String[3];

        arr[0] = "First";
        arr[1] = "Second";
        arr[2] = "Third\n";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("他宣言 \nデータ型 配列変数 = {データ1, データ2},......");
        String[] arr2 = {"First2", "Second2", "Third2\n"};
        
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("配列の中身を変更することもできる Second⇒Fourth");

        arr[1] = "Fourth";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("多次元配列 String[][] arr\n");
        String[][] arrArr;
        arrArr = new String[2][2];

        System.out.println("代入方法 \narr[x][y] = 中身");

        arrArr[0][0] = "First";
        arrArr[0][1] = "Second";
        arrArr[1][0] = "Third";
        arrArr[1][1] = "Fourth\n";

        System.out.println(arrArr[0][0]);
        System.out.println(arrArr[0][1]);
        System.out.println(arrArr[1][0]);
        System.out.println(arrArr[1][1]);
    }
}
