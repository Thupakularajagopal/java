public void handleWithoutChain(
String key, Consumer<String> processor) {
var item = map1.get(key);
if(item != null) 
processor.accept(item);
else {
item = map2get(key);
if(item != null) 
processor.accept(item);
else {
item = map3.get(key);
}
}
}