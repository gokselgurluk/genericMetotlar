import java.util.Arrays;

public class MyList<T> {

 private T[] array;
 private int size ;
private  int capacity;
 public MyList() {
  this.array = (T[]) new Object[10];
 }

 public MyList(int capacity) {
  this.capacity=capacity;
  this.array = (T[]) new Object[this.capacity];
  this.size=0;

 }
 public boolean contains(T data) {
  for (int i = 0; i < size; i++) {
   if (array[i].equals(data)) {
    return true; // Öğe bulundu
   }
  }
  return false; // Öğe bulunamadı
 }


 public MyList<T> sublist(int start, int finish) {
  if (start < 0 || finish >= size || start > finish) {
   throw new IndexOutOfBoundsException("Geçersiz indeks aralığı");
  }

  MyList<T> sub = new MyList<>(size); // Alt liste oluştur

  for (int i = start; i <= finish; i++) {
   sub.add(array[i]); // Belirtilen indeks aralığındaki öğeleri alt liste olarak ekle
  }

  return sub; // Alt listeyi döndür
 }

 public void clear() {
  for (int i = 0; i < size; i++) {
   array[i] = null; // Her bir öğeyi null yaparak sil
  }
  size = 0; // Listenin boyutunu sıfırla
 }


 public T[] toArray() {
  T[] result = (T[]) new Object[size]; // Sonuç dizisi oluştur
  for (int i = 0; i < size; i++) {
   result[i] = array[i]; // Listenin öğelerini sonuç dizisine kopyala
  }
  return result; // Sonuç dizisini döndür
 }
 public boolean isEmpty(){

  if (size!=0){
   return false ;
  }
  return true;
 }
 public int lastIndexOf(T data){
  for (int i = 0; i <size ; i++ ){
   if (array[i].equals(data)) {
    return size-1;
   }
  }
  return -1;
 }
 public int indexOf(T data){

  for (int i = 0; i <size ; i++ ){
      if (array[i].equals(data)) {
       return i;
      }
  }
 return -1;
 }
 public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("[");
  for (int i = 0; i < size; i++) {
   sb.append(array[i]);
   if (i != size - 1) {
    sb.append(", ");
   }
  }
  sb.append("]");
  return sb.toString();
 }
 public Object set(int index, T data){
  if(index<0 || size<index){
   return null;
  }

  return array[index]=data;
 }
 public Object remove(int index){
  if(index<0 || this.array.length<index){
   return null;
  }
  Object removedElement = array[index];
  for (int i = index; i < size - 1; i++) {
   array[i] = array[i + 1];
  }
  array[size - 1] = null; // Son elemanı null yap
  size--; // Dizinin boyutunu azalt
 return removedElement;
  }


 public Object  get(int index){

  if(this.array[index]==null){
   return  null ;
  }
  return this.array[index];

 }

 public void add (T data){
  if(size == capacity){
   capacity *= 2;
   array = Arrays.copyOf(array, capacity);
  }
  array[size++]=data;

 }

 public int size(){
 return this.size;
}

 public int getCapacity() {
  return capacity;
 }

 public void setCapacity(int capacity) {
  this.capacity = capacity;
 }
}
