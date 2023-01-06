class Strings2 {
  fun doubleChar(str: String):String {
    var newStr = ""  
    for (letter in str)
      newStr = newStr + letter + letter 
    return newStr 
  }

  fun bobThere(str:String): Boolean {
    for (i in 0..str.length-3) {
      if (str[i].equals('b') && str[i+2].equals('b')) return true
    }
    return false
  }
}
