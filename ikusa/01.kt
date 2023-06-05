fun main(args: Array<String>) {

/**
 *  配列を使った for文
 */
val array = arrayOf(1, 2, 3, 4, 5)

    for (i in array.indices) {
        val element = array[i]
        println("Index: $i, Element: $element")
    }

// ================ END


// === iF 文
var num = readLine()!!.toInt()
  
  if(num > 80) {
      println("pass")
  } else {
      println("fail")
  }

    //=================
   // === 文字列比較
   //=================
    var str_01 = readLine()!!
    var str_02 = readLine()!!

    if(str_01 == str_02) {
        println("YES")
    } else {
        println("NO")
    }
  

     var ans_03 = Time_Cut(num)
     println(ans_03)

     // === 明日天気になーれ
     var num_02 = readLine()!!.toInt()
     loop_go(num_02)


     // === ゆで卵
     var num_04 = readLine()!!.toInt()
     Yude_TAMAGO(num_04)

}

 //=================
// === 24時間　以降の時間を 24時間表記にする
 /=================
fun Time_Cut(num: Int): Int{
    var ans = 0;
    if(num > 24) {
        ans = num - 24
        return ans
    } else {
        return num
}


// === 出力プログラム ===
fun loop_go(num: Int) {
    
    val elements = mutableListOf<String>()
    
    // === List 値取得
    repeat(num) { 
        val elm = readLine()
        if(elm != null) {
            elements.add(elm)
        }
    }
    
    // === 出力　ロジック
    for (e in elements) {
        
        if(e == "forward") {
            println("Sunny")   
        } else if(e == "reverse") {
            println("Rainy")
        } else {
            println("Cloudy")
        }
    }
}

// ==========================
// === ゆで卵　分岐 ===
// ==========================
fun Yude_TAMAGO(num : Int) {
    
    if(num >= 0 && num <= 5) {
      println("raw")
  } else if(num >= 6 && num <= 7) {
      println("soft boiled")
  } else {
      println("hard boiled")
  }
    
}