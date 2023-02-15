package Annotations02;

public class Start {
    public static void main(String[] args) throws NoSuchMethodException {
        
        DevAnnotation devAnnotationWelcome = Greetings.class.getMethod("sayWelcome").getAnnotation(DevAnnotation.class);
        System.out.println("SayWelcome was written by " + devAnnotationWelcome.DevName() + " " + devAnnotationWelcome.DevSurname());

        DevAnnotation devAnnotationGoodbye = Greetings.class.getMethod("sayGoodbye").getAnnotation(DevAnnotation.class);
        System.out.println("SayWelcome was written by " + devAnnotationGoodbye.DevName() + " " + devAnnotationGoodbye.DevSurname());
    }
}
