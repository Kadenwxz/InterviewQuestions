package operator.addition;

public class Addition {
    public int add(int x, int y) throws Exception{
        while(y > 0){
            int carry = x & y;
            x ^= y;
            y = carry << 1;
            if(y < 0){
                throw(new Exception("Integer Overflow!!!"));
            }
        }
        return x;
    }
}
