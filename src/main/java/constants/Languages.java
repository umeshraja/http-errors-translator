package constants;

import SupportedLanguages.EnglishLanguage;
import SupportedLanguages.Language;

public enum Languages {
    ENGLISH(new EnglishLanguage());
//    FRENCH,
//    LATIN,
//    GREEK
//
    private Language language;
    Languages(Language language){
        this.language = language;
    }

    public Language getLanguage(){
        return this.language;
    }
}