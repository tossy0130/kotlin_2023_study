fun main(args: Array(string))
{

//============================ 01
    var str_01 = readLine()!!
    println(str_01)

/**

//============================ 02

出力例1
paiza
gino

入力例2
heisei31
reiwa1

*/
var a = readLine()!!
var b = readLine()!!
  
Print_out(a)
Print_out(b)

//============================ 03
// === 配列で値取得
/**
入力例1
abc
def
ghi

出力例1
abc
def
ghi
*/
val s = (0 until 3).map{readLine()!!}

for (s_val in s) {
        println(s_val)
    }


}

// === 02 ===
// === 出力 関数
fun Print_out(str: String) {
    println(str)
}