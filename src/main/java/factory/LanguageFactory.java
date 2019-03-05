package factory;

import SupportedLanguages.Language;
import constants.Languages;

public class LanguageFactory {

    private LanguageFactory(){
        throw new SecurityException("You cannot create an instance of this class");
    }

    public static Language getLanguage(Languages name) {
        return name.getLanguage();
    }
}