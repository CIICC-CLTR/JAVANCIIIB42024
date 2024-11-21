package programming_challlenges;

public class AccessModifiers {

    public static void main(String[] args) {
        AccessModifiers pub = new AccessModifiers();

         pub.publiAccessModifier();
         pub.privateAccessModifier();
         pub.protectedAccessModifier();
       
    }
    public void publiAccessModifier(){

        System.out.println("\nI am in Public method,\n1.) can be accessed within or outside the class \n2.) or packages just need to import me,\n3.) Just make an instantiation\n");
    }
    private void privateAccessModifier(){

        System.out.println("\nI am in Private method,\n1.) can be accessed within the class only \n2.) Just make an instantiation\n");
    }
    protected void protectedAccessModifier(){

        System.out.println("\nI am in Protected method,\n1.) can be accessed within the class and within the same package\n2.) Can be used by extending my class \n2.) Just make an instantiation\n");
    }
}