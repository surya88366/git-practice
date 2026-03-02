class base{
    int a = 10;

}
class sub extends base{
    int a =20;


    void display(){
        a = 30;
        System.out.print(a);
    }
}
class drive{
    public static void main(String[] args){
        
    sub s = new sub();
    System.out.print(s.a);
    
    }
}
