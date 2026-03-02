package ArraysAndHashing;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        for(char ch = '9'; ch >= '0'; ch--){
            if(n.indexOf(ch) != -1){
                return ch - '0';
            }
        }
        return -1;
    }

}
//Pegar o maior número. Ex: se o número é 32 -> 11 -> 11 -> 10
