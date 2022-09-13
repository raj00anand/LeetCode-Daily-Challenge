class Solution {
    public boolean validUtf8(int[] data) {
        int numberOfBytesToProcess = 0;
        
        for(int i=0;i<data.length;i++){
            
            String binary=Integer.toBinaryString(data[i]);
            
            binary=binary.length()>=8 ? binary.substring(binary.length()-8): "00000000".substring(binary.length()%8)+binary;
            
            if(numberOfBytesToProcess==0){
                for(int j=0;j<binary.length();j++){
                    if(binary.charAt(j)=='0'){
                        break;
                    }
                    numberOfBytesToProcess +=1;

                }

                if(numberOfBytesToProcess == 0){
                    continue;
                }

                if(numberOfBytesToProcess>4 || numberOfBytesToProcess == 1){
                    return false;
                }
            }else{
                
                if(!(binary.charAt(0)=='1' && binary.charAt(1)=='0')){
                    return false;
                }
            }
            numberOfBytesToProcess -= 1;
                
        }
        return numberOfBytesToProcess ==0;
    }
}