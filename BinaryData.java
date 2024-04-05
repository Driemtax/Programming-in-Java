public class BinaryData {
    public byte data;

    public BinaryData(int number){
        this.data = ToBinary(number);
    }

    public byte ToBinary(int number){
        byte result = 0b00001000;

        return result;
    }
}
