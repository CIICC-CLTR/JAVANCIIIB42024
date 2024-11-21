package fetchmodifers;
import programming_challlenges.AccessModifiers;

public class Fetch_Modifiers extends AccessModifiers {
    
    public static void main(String[] args) {
        
        AccessModifiers fetch = new AccessModifiers();
        fetch.publiAccessModifier();

        Fetch_Modifiers fetchProtected = new Fetch_Modifiers();
        fetchProtected.protectedAccessModifier();
        
    }
 
}
class InnerFetch_Modifiers extends AccessModifiers {

    InnerFetch_Modifiers fetchProtected = new InnerFetch_Modifiers();
    fetchmodifers.protectedAccessModifier();

    
}