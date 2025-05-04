class Test{
    public static void main(String[] args) {
        int a = 2;
        int b  = 4;
        while(b !=0){
            int  temp =b;
            b = a % b;
            a  = temp;
        }
        System.out.println(a);
    }
}