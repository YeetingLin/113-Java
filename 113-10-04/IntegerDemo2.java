public class IntegerDemo2 {
    public static void main(String[] args) {
        int data1 = 10;
        Integer wrapper1 = data1; //自動裝箱
        Integer wrapper2 = 20;
        int data2 = wrapper2;
        
       
        
        System.out.println(data1 / 3);
        System.out.println(data1 / 3.0);
        System.out.println((double)data2 / 3);
        System.out.println(wrapper1.doubleValue() / 3);
        System.out.println(wrapper1.compareTo(wrapper2));
    }
}
