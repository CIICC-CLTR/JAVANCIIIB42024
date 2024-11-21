package fetchmodifers;
import access_modifier.AccessModifiers;

public class Fetch_Modifiers extends AccessModifiers {
    
    public static void main(String[] args) {
        
        AccessModifiers fetch = new AccessModifiers();
        fetch.publiAccessModifier();

        Fetch_Modifiers fetchProtected = new Fetch_Modifiers();
        fetchProtected.protectedAccessModifier();
        
        
    }
  
 
}
