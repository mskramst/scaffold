class Strings2 {
  fun doubleChar(str: String):String {
    var newStr = ""  
    for (letter in str)
      newStr = newStr + letter + letter 
    return newStr 
  }
}
