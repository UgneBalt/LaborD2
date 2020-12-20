package org.ugne.wordcounter;

public class WordCounter {

    public int count(CharSequence userText, int countType){
        if (userText==null || userText.equals(""))
        {
            return 0;
        }
        if(countType==0)
        {
            //skaiciuojame zodzius
            CharSequence[] words = userText.toString().split("[ ,\\.]");
            // split metodas duotus simbolius tarktuoja kaip skyriklius - cia naudojame
            // tarpa, kableli ir taska kaip skyriklio zenklus

            int counter = 0;
            for(CharSequence word:words)
            {
                if (word.length()>0)
                {
                    counter=counter+1;
                }
            }
            return counter;
        }
        else
        {
            //skaiciuojame zenklus
            return userText.length();
        }
    }
}
