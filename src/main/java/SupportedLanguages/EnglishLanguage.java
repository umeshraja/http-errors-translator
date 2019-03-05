package SupportedLanguages;

public class EnglishLanguage implements Language {

    @Override
    public String getMessage(int errorCode) {
        return EnglishMessages.valueOf("ERROR_"+errorCode).getMessage();
    }

    enum EnglishMessages {

        ERROR_400("Missing required data"),
        ERROR_401("You are not allowed to access this feature"),
        ERROR_403("Your request cannot be processed at this time. Please try again later"),
        ERROR_404("Website you are trying to connect does not exist"),
        ERROR_405("This resource does not support the method you requested"),
        ERROR_408("Your request took longer than expected"),
        ERROR_413("Your request is larger than expected"),
        ERROR_414("Your request URI is larger than expected"),
        ERROR_415("The file type you uploaded is not supported"),
        ERROR_429("You have sent too many requests than expected"),
        ERROR_500("Something went wrong. Please try again later"),
        ERROR_501("This functionality is not supported"),
        ERROR_502("Your request cannot be processed due to errors from third party"),
        ERROR_503("The server is currently unavailable (overloaded or down for maintenance)"),
        ERROR_504("Your request cannot be processed due to third party server taking longer than expected"),
        ERROR_505("Http Version used in your request is not supported"),
        ERROR_511("You need to authenticate to gain network access");

        private String message;

        EnglishMessages(String message){
            this.message = message;
        }

        public String getMessage(){
            return this.message;
        }
    }
}