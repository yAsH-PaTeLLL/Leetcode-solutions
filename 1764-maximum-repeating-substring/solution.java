class Solution {
    public int maxRepeating(String sequence, String word) {
     if(!sequence.contains(word)){
        return 0;
     }   
     int i=0;
     String original=word;
    while(i<101 && sequence.contains(word)){
        word=word+original;
        i++;
    }

    return i;
    }
}
