```groovy
def myMethod(Object obj) {
if (obj instanceof String) {
  println "String: "+ obj.toUpperCase()
} else if (obj instanceof Integer) {
  println "Integer: "+ obj * 2
} else if (obj instanceof List) {
  println "List:"
  obj.each { item ->
    if (item instanceof Integer) {
      println "  Integer: " + item * 2
    } else if (item instanceof String) {
      println "  String: " + item.toUpperCase()
    } else {
      println "  Other: " + item
    }
  }
} else {
  println "Other: "+ obj
}
}

myMethod("hello")
myMethod(10)
myMethod([1, 2, 3, "test"])
```