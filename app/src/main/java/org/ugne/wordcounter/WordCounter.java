package org.ugne.wordcounter;

public class WordCounter {

    public int count(CharSequence userText, int countType){
        if(countType==0)
        {
            //skaiciuojame zodzius
            CharSequence[] words = userText.toString().split("[ ,\\.]");
            // split metodas duotus simbolius tarktuoja kaip skyriklius - cia naudojame
            // tarpa, kableli ir taska kaip skyriklio zenklus
            return words.length;
        }
        else
        {
            //skaiciuojame zenklus
            return userText.length();
        }
    }
}
