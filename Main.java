public boolean sleepIn(boolean weekday, boolean vacation) {
  boolean sleepIn = false;
  if(!weekday || vacation){
    sleepIn = true;
  }
  return sleepIn;
}
