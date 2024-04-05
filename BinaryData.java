public class BinaryData {
    public byte data;

    public BinaryData(int number){
        this.data = ToBinary(number);
    }

    public byte ToBinary(int number){
        byte result = 0b01111111;

         while(result >= 1){
            if (number % 2 == 1) {
                result += 1;
            }
        } 
        return result;
    } // rekursiv gestalten
}