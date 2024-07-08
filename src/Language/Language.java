package Language;

 public abstract class Language implements ILanguage {
     String naam;

     public Language(String naam) {
         this.naam = naam;
     }

     public String getNaam() {
         return naam;
     }
 }

