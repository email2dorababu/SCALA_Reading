
class Book( var title: String) {
def printTitle {
  println(title)
  }
 }

class Book(  title: String) {
def printTitle {
 val b=this
  println(b.title)
  }
 }