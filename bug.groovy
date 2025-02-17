```groovy
def myMethod(Object obj) {
if (obj instanceof String) {
  println "String: "+ obj.toUpperCase()
} else if (obj instanceof Integer) {
  println "Integer: "+ obj * 2
} else {
  println "Other: "+ obj
}
}

myMethod("hello")
myMethod(10)
myMethod([1, 2, 3])
```